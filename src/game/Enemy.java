package game;

public class Enemy extends Ship {
	// unique enemy stuff like moving and shooting logic
	// though yeah most of the actual mechanics are handled by Ship, thankfully
	// ...in theory, anyway
	// need enemy types. oh, and a big boss type, of course
	// handle types with an index system during creation? simple enough

    public Enemy(int h, int s, int x, int y, int width, int height){
        super(h, s, x, y, width, height);
    }
}
