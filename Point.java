public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] Array = {x, y};
        return Array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    private void setSpeed(float xSpeed,float ySpeed){

    }
    public float[] getSpeed() {
        float[] Array = {xSpeed,ySpeed};
        return Array;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void movePoint(float x, float y) {
        setX(getX() + x);
        setY(getY() + y);
    }

}
class TextPoint{
    public static void main(String[] args) {
    MovablePoint movablePoint = new MovablePoint(1.2f, 2.3f, 0.5f, 0.5f);
    System.out.println(movablePoint.toString());

    movablePoint.movePoint(1.0f, -0.5f);
    System.out.println( movablePoint.toString());
}

}

