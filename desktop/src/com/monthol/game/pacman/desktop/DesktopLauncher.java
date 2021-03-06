package com.monthol.game.pacman.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.monthol.game.pacman.Pacman;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	    config.width = Pacman.WIDTH;
	    config.height = Pacman.HEIGHT;
		new LwjglApplication(new Pacman(), config);
	}
}
