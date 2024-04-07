package lab4;

public class Question5 {
    private double squareSide;
    private double rectangleLength;
    private double rectangleBreadth;

    public Question5(double... parameters) {
        if (parameters.length == 1) {
            this.squareSide = parameters[0];
        } else if (parameters.length == 2) {
            this.rectangleLength = parameters[0];
            this.rectangleBreadth = parameters[1];
        } else {
            System.out.println("Invalid number of parameters. Please provide either 1 parameter for square side or 2 parameters for rectangle length and breadth.");
        }
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
        Question5 square = new Question5(5);
        Question5 rectangle = new Question5(4, 5);

        square.displayAreaAndDataMembers();
        rectangle.displayAreaAndDataMembers();
    }
}
