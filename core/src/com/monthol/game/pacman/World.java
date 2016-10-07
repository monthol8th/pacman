package com.monthol.game.pacman;

public class World {
    private Pac pacman;
    private Pacman pacmanGame;
    private Maze maze;

    
    World(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pac(100,100);
        maze = new Maze();

    }
 
    Pac getPacman() {
        return pacman;
    }

    Maze getMaze() {
        return maze;
    }

}
