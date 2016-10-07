package com.monthol.game.pacman;

public class World {
    private Pac pacman;
    private Pacman pacmanGame;
 
    World(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacman = new Pac(100,100);
    }
 
    Pac getPacman() {
        return pacman;
    }
}
