package lab4;

public class Question6 {
    private double squareSide;
    private double rectangleLength;
    private double rectangleBreadth;

    public static Question6 create(double... parameters) {
        Question6 calculator = new Question6();
        if (parameters.length == 1) {
            calculator.squareSide = parameters[0];
        } else if (parameters.length == 2) {
            calculator.rectangleLength = parameters[0];
            calculator.rectangleBreadth = parameters[1];
        } else {
            System.out.println("Invalid number of parameters. Please provide either 1 parameter for square side or 2 parameters for rectangle length and breadth.");
        }
        return calculator;
    }

    private Question6() {
    }

    public double calculateSquareArea() {
        return squareSide * squareSide;
    }

    public double calculateRectangleArea() {
        return rectangleLength * rectangleBreadth;
    }

    public void displayAreaAndDataMembers() {
        System.out.println("Square side: " + squareSide + ", Area: " + calculateSquareArea());
        System.out.println("Rectangle length: " + rectangleLength + ", breadth: " + rectangleBreadth + ", Area: " + calculateRectangleArea());
    }

    public static void main(String[] args) {
        Question6 square = Question6.create(5);
        Question6 rectangle = Question6.create(4, 5);

        square.displayAreaAndDataMembers();
        rectangle.displayAreaAndDataMembers();
    }
}