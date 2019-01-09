package com.jamesxu.spaceinvaders.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

class Bullet extends BaseActor {
    final double direction;
    private Ship parent;

    Bullet(float direction, float speed, Ship parent) {
        super(new Texture("sprites/bullet.png"), speed);
        Texture texture = new Texture("sprites/bullet.png");
        this.parent = parent;
        setPosition(parent.getX() + parent.getWidth() / 2 - texture.getWidth() / 2, parent.getY());
        this.direction = Math.toRadians(direction);
    }

    @Override
    public void act(float delta) {
        moveBy((float) (speed * Math.cos(direction)), (float) (speed * Math.sin(direction)));
        if (!(0 <= getX()) || !(Gdx.graphics.getWidth() <= getX()) || !(0 <= getY()) || !(Gdx.graphics.getHeight() <= getY())) {
            this.addAction(Actions.removeActor());
        }
    }
}
