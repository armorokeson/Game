package me.sna.pong.entities;

import static org.lwjgl.opengl.GL11.*;

public class Ball extends AbEnt2D{
	
	private float x,y;
	
	public Ball (float xl, float yl) {
		x = xl;
		y = yl;
	}

	@Override
	public float getX() {
		return x;
	}

	@Override
	public float getY() {
		return y;
	}

	@Override
	public void setX(float xl) {
		x = xl;
	}

	@Override
	public void setY(float yl) {
		y = yl;
	}

	@Override
	public void setLocation(float xl, float yl) {
		x = xl;
		y = yl;
	}

	@Override
	public void setUp() {
		
	}

	@Override
	public void destroy() {
		
	}
	
	@Override
	public void draw() {
		
	}

	public void draw(float cx, float cy, float rad, int num_segments) {
		glBegin(GL_LINE_LOOP);
		for(int ii = 0; ii < num_segments; ii++){
			float theta = 2.0f * (float)Math.PI * (float)(ii) / (float)(num_segments);
			x = (float) (rad * Math.cos(theta));
			y = (float) (rad * Math.sin(theta));
			
			glVertex2f(x + cx, y + cy);
		}
		glEnd();
	}
}
