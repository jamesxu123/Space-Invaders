package com.jamesxu.spaceinvaders.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.jamesxu.spaceinvaders.SpaceInvaders;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setWindowedMode(800, 600);
        config.setHdpiMode(Lwjgl3ApplicationConfiguration.HdpiMode.Logical);
        config.setIdleFPS(30);
        config.setResizable(false);
        new Lwjgl3Application(new SpaceInvaders(), config);
    }
}
