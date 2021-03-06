package com.monthol.game.pacman;

import com.badlogic.gdx.math.Vector2;

public class Pac {
    private Vector2 position;
    
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    private int currentDirection;
    private int nextDirection;
    private Maze maze;

    
    public static final int SPEED = 5;

    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,-1},
        {1,0},
        {0,1},
        {-1,0}
    };
    
    public Pac(int x, int y,Maze maze) {
        position = new Vector2(x,y);
        
        currentDirection = DIRECTION_STILL;
        nextDirection = DIRECTION_STILL;

        this.maze = maze;
    }    
 
    public void setNextDirection(int dir) {
        nextDirection = dir;
    }
    
    public boolean isAtCenter() {
        int blockSize = WorldRenderer.BLOCK_SIZE;
 
        return ((((int)position.x - blockSize/2) % blockSize) == 0) &&
                ((((int)position.y - blockSize/2) % blockSize) == 0);
    }

    public void update() {
        if(isAtCenter()) {
        	if(maze.hasDotAt(getRow(), getColumn()))
        	{
        		maze.removeDotAt(getRow(), getColumn());
        	}
            if(canMoveInDirection(nextDirection)) {
                currentDirection = nextDirection;    
            } else {
                currentDirection = DIRECTION_STILL;    
            }
        }
        position.x += SPEED * DIR_OFFSETS[currentDirection][0];
        position.y += SPEED * DIR_OFFSETS[currentDirection][1];
    }
    
    public Vector2 getPosition() {
        return position;    
    }
    
    public void move(int dir) { 
    	position.x += SPEED * DIR_OFFSETS[dir][0];
    	position.y += SPEED * DIR_OFFSETS[dir][1];
        
        System.out.println(position.x+" "+position.y);
    }
    private boolean canMoveInDirection(int dir) {
        int newRol=+getRow()+DIR_OFFSETS[nextDirection][1];
        int newCol=+getColumn()+DIR_OFFSETS[nextDirection][0];
        
    	return !maze.hasWallAt(newRol, newCol);   // ยอมหมดไปก่อน เดี๋ยวเราจะทยอยเขียน
    }
    
    private int getRow() {
        return ((int)position.y) / WorldRenderer.BLOCK_SIZE; 
    }
 
    private int getColumn() {
        return ((int)position.x) / WorldRenderer.BLOCK_SIZE; 
    }
}
