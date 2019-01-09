package com.jamesxu.spaceinvaders;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.jamesxu.spaceinvaders.logic.Ship;
import com.jamesxu.spaceinvaders.logic.UserInput;


public class SpaceInvaders extends Game {
    private SpriteBatch batch;
    private Texture img, ship, bg;
    private Ship userShip;
    private Stage stage;
    private Group bullets;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        ship = new Texture("sprites/ship.png");
        userShip = new Ship();
        stage = new Stage();
        bullets = new Group();
        stage.addActor(userShip);
        stage.addActor(bullets);
        Gdx.input.setInputProcessor(new UserInput(userShip, bullets));
    }

    @Override
    public void render() {
        stage.act();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        stage.draw();
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
