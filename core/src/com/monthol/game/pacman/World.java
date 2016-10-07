package com.monthol.game.pacman;

public class World {
    private Pac pacman;
    private Pacman pacmanGame;
    private Maze maze;

    
    World(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pac(60,60);
        maze = new Maze();

    }
 
    Pac getPacman() {
        return pacman;
    }
    public void update(float delta) {
        pacman.update();
    }


    Maze getMaze() {
        return maze;
    }

}
