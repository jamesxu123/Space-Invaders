package com.jamesxu.spaceinvaders.logic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Ship extends Actor {
    ArrayList<Bullet> bullets = new ArrayList<Bullet>();

    public Ship() {
        super(new Texture("sprites/ship.png"));
    }

    public void fire() {
        Bullet b = new Bullet();
    }

    public void render(SpriteBatch batch) {
        for (Bullet b : bullets) {
            float x = b.getX();
            float y = b.getY();

        }
        super.render(batch, 50, 50);
    }
}
