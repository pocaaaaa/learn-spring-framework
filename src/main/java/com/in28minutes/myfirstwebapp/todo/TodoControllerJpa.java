package com.in28minutes.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {

    public TodoControllerJpa(TodoRepository todoRepository) {
        super();
        this.todoRepository = todoRepository;
    }

    private TodoRepository todoRepository;
    private String redirectList = "redirect:list-todos";

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        String userName = getLoggedInUserName(model);
        List<Todo> todos = todoRepository.findByUsername(userName);
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @GetMapping(value = "add-todo")
    public String showNewTodoPage(ModelMap model) {
        String userName = getLoggedInUserName(model);
        Todo todo = new Todo(0, userName, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @PostMapping(value = "add-todo")
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        String userName = getLoggedInUserName(model);
        todo.setUsername(userName);
        todoRepository.save(todo);
        return redirectList;
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoRepository.deleteById(id);
        return redirectList;
    }

    @GetMapping(value = "update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Todo with ID " + id + " not found."));
        model.addAttribute("todo", todo);
        return "todo";
    }

    @PostMapping(value = "update-todo")
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        String username = getLoggedInUserName(model);
        todo.setUsername(username);
        todoRepository.save(todo);
        return redirectList;
    }

    private String getLoggedInUserName(ModelMap model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
