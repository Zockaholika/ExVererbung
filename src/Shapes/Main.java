package Shapes;

public class Main{

    public static void main(String[] args) {


        Rectangle rec1 = new Rectangle("Grey", false, 50,52);
        Rectangle rec2 = new Rectangle("Blue", true, 20, 60);
        System.out.println(rec1.getArea() + "cm Fläche und " + rec1.getPerimeter() + "cm");
        System.out.println("REC2: " + rec2.color + " " + rec2.isFilled);

        Circle circleOne = new Circle("Rot",true, 10);
        System.out.println(circleOne.getArea());
        circleOne.extendRadius(30.0);
        System.out.println(circleOne.getArea());
        System.out.println(circleOne.getPerimeter());

        Circle circletwo = new Circle("Rose", true, 15);
        System.out.println(circletwo.getPerimeter() + " " + circleOne.getArea());

    }
}
