package com.monthol.game.pacman;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
 
    private Pacman pacmanGame;
    private Texture pacmanImg;
    private int x;
    private int y;
    private Pac pacman;
    private WorldRenderer worldRenderer;
    
    public World world;


    public GameScreen(Pacman pacmanGame) {
        this.pacmanGame = pacmanGame;
 
        pacmanImg = new Texture("pacman.png");
 
        world = new World(pacmanGame);
        
        worldRenderer= new WorldRenderer(this.pacmanGame, this.world);
    }
    
    @Override
    public void render(float delta) {
        update(delta);

    	
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        worldRenderer.render(delta);
    }
    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	world.getPacman().setNextDirection(Pac.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	world.getPacman().setNextDirection(Pac.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
        	world.getPacman().setNextDirection(Pac.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	world.getPacman().setNextDirection(Pac.DIRECTION_DOWN);  
        }
        if(!(Gdx.input.isKeyPressed(Keys.DOWN)||Gdx.input.isKeyPressed(Keys.UP)||Gdx.input.isKeyPressed(Keys.RIGHT)||Gdx.input.isKeyPressed(Keys.LEFT)))
        	world.getPacman().setNextDirection(Pac.DIRECTION_STILL);  
        world.update(delta);
    }

}