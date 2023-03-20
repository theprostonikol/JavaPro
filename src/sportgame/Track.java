package sportgame;


public class Track extends Obstacle {
    private int length;


    public Track(int length) {
        this.length = length;
    }


    public int overcome() {

        return length;
    }
}
