package com.umu_jep.atime.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.umu_jep.atime.AdTimeGame;

public class DesktopLauncher {
	
	static LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	
	public static void main (String[] arg) {

		config.title = "Adventure Time";
		config.width = 1280;
		config.height = 720;
		config.resizable = false;

		new LwjglApplication(new AdTimeGame(), config);
	}
}
