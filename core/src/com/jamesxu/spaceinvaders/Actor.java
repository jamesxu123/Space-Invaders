package com.jamesxu.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;

public class Actor {
    private Texture sprite;
    private int x, y;

    public Actor(Texture sprite) {
        this.sprite = sprite;
    }

    public void moveUp(int speed) {
        this.y -= speed;
    }

    public void moveDown(int speed) {
        this.y += speed;
    }

    public void moveLeft(int speed) {
        this.x -= speed;
    }

    public void moveRight(int speed) {
        this.x += speed;
    }
}
