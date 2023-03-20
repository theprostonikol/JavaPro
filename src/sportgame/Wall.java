package sportgame;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int overcome() {
        return height;
    }

}
