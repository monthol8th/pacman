package com.monthol.game.pacman;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	Pacman pacmanGame;
	World world;
	Texture pacmanImg;
	SpriteBatch batch;
    private MazeRenderer mazeRenderer;
    public static final int BLOCK_SIZE = 40;
    private ScoreListener scoreListener;
    BitmapFont scoreBoard;
    public WorldRenderer(Pacman pacmanGame, World world,ScoreListener scoreListener) {
        this.pacmanGame = pacmanGame;
        batch = pacmanGame.batch;
        scoreBoard=new BitmapFont();
        this.world = world;
        this.scoreListener=scoreListener;
        pacmanImg = new Texture("pacman.png");
        mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());

    }
    public void render(float delta) {
        mazeRenderer.render();

        SpriteBatch batch = pacmanGame.batch;
        Vector2 pos = world.getPacman().getPosition();
        batch.begin();
        batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, Pacman.HEIGHT - pos.y - BLOCK_SIZE/2);        
        scoreBoard.setColor(1.0f, 1.0f, 1.0f, 1.0f);
        scoreBoard.draw(batch, "Score: "+scoreListener.getScore(), 50, 580);
        batch.end();
    }
}
