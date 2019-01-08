package com.jamesxu.spaceinvaders;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class SpaceInvaders extends Game {
	SpriteBatch batch;
	Texture img, ship;
	int x, y;
	@Override
	public void create () {
		Gdx.input.setInputProcessor(new UserInput());
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		ship = new Texture("sprites/ship.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		int mx = Gdx.input.getX(), my = Gdx.graphics.getHeight() - Gdx.input.getY();
		batch.begin();
		batch.draw(ship, x, y, 50, 50);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
