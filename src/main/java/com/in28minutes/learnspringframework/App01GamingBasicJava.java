package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        var game2 = new SuperContraGame();

        // 1: Object creation
        var game3 = new PacmanGame();

        // 2: Object Creation + wiring of Dependencies
        // Game is a Dependency of GameRunner
        var gameRunner = new GameRunner(game3);

        gameRunner.run();
    }
}
