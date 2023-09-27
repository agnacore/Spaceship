package com.agnacore.spaceship.game;

public class Ship {
	// superclass baybee
	// any character on screen, so basically the player and enemies
	// methods for creation, necessary getters/setters...
	// variables for health, ammo, location, speed...
	
	private int health, speed;
	private int[] position;
	private int[] offset;
	
	public Ship(int h, int s, int x, int y, int width, int height) {
		this.health = h;
		this.speed = s;
		this.position = new int[2];
		this.position[0] = x;
		this.position[1] = y;
		
		// the offset is how far from the middle (position) the borders are
		// this makes for easy collision detection...
		// with the downside of the actual width or height being 1 pixel larger if they were even
		// I could fix that, but it sounds like more effort than it's worth lol
		this.offset = new int[2];
		this.offset[0] = width / 2;
		this.offset[1] = height / 2;
	}
	
	public int getHealth() { return health; }
	
	public boolean damage(int d) {
		health = health - d;
		
		// return true if dead
		return health <= 0;
	}
	
	public int getSpeed() { return speed; }
	
	public void setSpeed(int s) { speed = s; }
	
	public int[] getPosition() { return new int[] {position[0], position[1]}; }
	
	public int[] getOffset() { return new int[] {offset[0], offset[1]}; }
	
}
