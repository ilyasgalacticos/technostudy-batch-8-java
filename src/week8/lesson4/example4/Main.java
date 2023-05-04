package week8.lesson4.example4;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle("Yellow", 4);
        Circle circle2 = new Circle("Green", 3);

        Square square1 = new Square("Red", 5);
        Square square2 = new Square("Blue", 10);

        Rectangle rectangle1 = new Rectangle("Pink", 10, 20);
        Rectangle rectangle2 = new Rectangle("Brown", 5, 6);

        Shape shapes[] = {circle1, circle2, square2, square1, rectangle1, rectangle2};

        for (int i = 0; i < shapes.length; i++) {

            String shapeText = "";

            if(shapes[i] instanceof Rectangle){
                shapeText = "rectangle";
            }else if(shapes[i] instanceof Circle){ // ==
                shapeText = "circle";
            }else if(shapes[i] instanceof Square){
                shapeText = "square";
            }

            System.out.println("This shape is " + shapeText + " "
                    + shapes[i].getColor()
                    + " colored with area: " + shapes[i].getArea()
                    + ", with perimeter: " + shapes[i].getPerimeter());
        }
    }

}
