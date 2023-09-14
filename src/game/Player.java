package game;

public class Player extends Ship {
	// unique player stuff like moving and input
	// upgrades? maybe? different ship models?
	// ooh like a quick laser-y ship vs. a slow bomber-type
	// handle ship types with an index system? simple enough

    public Player(int h, int s, int x, int y, int width, int height){
        super(h, s, x, y, width, height);
    }
}
