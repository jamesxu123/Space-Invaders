package com.jamesxu.spaceinvaders;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jamesxu.spaceinvaders.logic.Ship;


public class SpaceInvaders extends Game {
    SpriteBatch batch;
    Texture img, ship;
    Ship userShip;
    int x, y;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        ship = new Texture("sprites/ship.png");
        userShip = new Ship();

    }

    @Override
    public void render() {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            userShip.moveLeft(5);
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            userShip.moveRight(5);
        }
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        userShip.render(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
