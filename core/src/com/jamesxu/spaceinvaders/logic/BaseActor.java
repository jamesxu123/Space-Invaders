package com.jamesxu.spaceinvaders.logic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

class BaseActor extends Actor {
    final Texture sprite;
    final float speed;

    BaseActor(Texture sprite, float speed) {
        this.sprite = sprite;
        setWidth(sprite.getWidth());
        setHeight(sprite.getHeight());
        this.speed = speed;
        setZIndex(1000);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(sprite, getX(), getY());
    }
}
