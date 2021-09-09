package _06_inheritance.exercise;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
   public MoveablePoint(){
    }
   public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
       super(x, y);
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
    public void setSpeed(float xSpeed, float ySpeed){
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
       float[] arr2 = {this.xSpeed, this.ySpeed};
       return arr2;
    }
    public float[] move(){
       float a = super.getX()+xSpeed;
       float b = super.getY()+ySpeed;
       float[] arr3 = {a, b};
       return arr3;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                ", x =" + super.getX() +
                ", y =" + super.getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
