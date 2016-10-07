package com.monthol.game.pacman;

public class World {
    private Pac pacman;
    private Pacman pacmanGame;
    private Maze maze;
    private ScoreListener scoreListener;
    World(Pacman pacmanGame,ScoreListener scoreListener) {
        this.pacmanGame = pacmanGame;
 
        this.scoreListener = scoreListener;
        maze = new Maze(scoreListener);
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
