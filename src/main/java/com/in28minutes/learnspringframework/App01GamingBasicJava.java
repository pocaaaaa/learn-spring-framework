package com.in28minutes.learnspringframework;

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
