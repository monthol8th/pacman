package com.monthol.game.pacman;

public class World {
    private Pac pacman;
    private Pacman pacmanGame;
    private Maze maze;

    
    World(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        maze = new Maze();
        pacman = new Pac(60,60,maze);


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
