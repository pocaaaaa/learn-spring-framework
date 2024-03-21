package com.in28minutes.learnjpaandhibernate.course;

import com.in28minutes.learnjpaandhibernate.course.Course;
import com.in28minutes.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository1;

    @Autowired
    private CourseJpaRepository repository2;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
        repository.save(new Course(2, "Learn Azure Jpa!", "in28minutes"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "in28minutes"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn AWS Jpa!"));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));

//        repository.insert(new Course(1, "Learn AWS Jpa!", "in28minutes"));
//        repository.insert(new Course(2, "Learn Azure Jpa!", "in28minutes"));
//        repository.insert(new Course(3, "Learn DevOps Jpa!", "in28minutes"));
//
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));
    }
}
