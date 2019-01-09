package com.jamesxu.spaceinvaders.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;

public class Ship extends BaseActor {
    public Ship() {
        super(new Texture("sprites/enterprise.png"), 20);
        setZIndex(100);
        setY(10);
    }

    public void left(float delta) {
        if (getX() - speed * delta >= 0) {
            moveBy(-speed * delta, 0);
        }
    }

    public void right(float delta) {
        if (getX() + speed * delta <= Gdx.graphics.getWidth() - getWidth()) {
            moveBy(speed * delta, 0);
        }
    }

    public void fire(Group otherBullets) {
        otherBullets.addActor(new Bullet(90, 30, this));
    }

    @Override
    public void act(float delta) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            left(speed * delta);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            right(speed * delta);
        }
    }
}
