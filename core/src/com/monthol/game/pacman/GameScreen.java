package com.monthol.game.pacman;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
 
    private Pacman pacmanGame;
    private Texture pacmanImg;

    public GameScreen(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");

    }
    
    @Override
    public void render(float delta) {
        SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        batch.draw(pacmanImg, 100, 100);
        batch.end();
    }
}