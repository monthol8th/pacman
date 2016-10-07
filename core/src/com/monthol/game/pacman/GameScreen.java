package com.monthol.game.pacman;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
 
    private Pacman pacmanGame;
    
    public GameScreen(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
    }
    
    @Override
    public void render(float delta) {
        System.out.println("Hello " + delta);
    }
}