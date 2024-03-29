package Units;

public class Position {

    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Position position) {
        return (float) Math.sqrt(Math.pow((this.x - position.getX()), 2) + Math.pow((this.y - position.getY()), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEquals(Position position) {
        return this.x == position.getX() && this.y == position.getY();
    }
}
