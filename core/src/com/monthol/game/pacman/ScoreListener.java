package com.monthol.game.pacman;

public class ScoreListener {
	private int score;
	
	public ScoreListener()
	{
		
		this.score=0;
	}
	public void update()
	{
		this.score++;
	}
	public int getScore()
	{
		return this.score;
	}
	
}
