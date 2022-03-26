class Ball { //first created class Ball
    static double radius;
    String color;

    static class Box { // THIRD we create new class box which has a heigth, and a ball inside
        double height; //we create other class Box
        Ball ball;//in the box can be a ball

        //6 CONSTRUCTOR
        Box() {
            height = 3;

        }

        //7 second constructor ang give data:double h
        Box(double h) {
            height = h;

        }

        // 4 we create a method for class Box. Method will return a radius of a ball which is inside of our Box
        double radius() {
            return Ball.radius;

        }

        // 5 create a method which returns a volume of a box
        double volume() {
            return height * height * height;
        }
    }

    public class Les_classes {
        // exemplar creating: NameOfClass nameOfVariable =new nameOfClass();

    }

    public static void main(String[] args) {//SECOND we described a ball in main
        Ball ball = new Ball();
        ball.color = "Red";
        ball.radius = 1.0;


        Ball blueBall = new Ball();
        blueBall.color = "Blue";
        blueBall.radius = 2;

        System.out.println(ball.color);
        System.out.println(ball.radius);

        System.out.println(blueBall.color);
        System.out.println(blueBall.radius);

        Box box = new Box();
        box.height = 2;// under 5 we assign height
        box.ball = blueBall;

        System.out.println(box.ball.color);//result:Blue we got a color of a ball inside a box
        System.out.println(box.radius());//4
        System.out.println(box.volume());//5

        Box bigBox = new Box();//6
        System.out.println(bigBox.volume());

        Box someBox = new Box(5); //last
        System.out.println(someBox.volume());

    }
}
