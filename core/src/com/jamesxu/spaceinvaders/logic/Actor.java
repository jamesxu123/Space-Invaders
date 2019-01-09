package com.jamesxu.spaceinvaders.logic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Actor {
    private Texture sprite;
    private float x, y;

    Actor(Texture sprite) {
        this.sprite = sprite;
    }

    public Texture getSprite() {
        return sprite;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void moveUp(float speed) {
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

    protected void render(SpriteBatch batch, float w, float h) {
        batch.draw(sprite, x, y, w, h);
    }

}
