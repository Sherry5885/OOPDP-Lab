class Shape{
    void getArea(){

    }
}

class Rectangle extends Shape{
    int length , width;
    int getArea(int length, int width){
        return length*width;
    }
}

class Box extends Rectangle{

    int getArea(int length, int width, int height) {
        return 2*(length*width + width*height + height*length);
    }
}




public class Question7 {
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.getArea();
        Rectangle obj2 = new Rectangle();
        int area = obj2.getArea(45, 56);
        System.out.println(area);
        Box obj3 = new Box();
        int Surface_area = obj3.getArea(34 , 45 ,9);
        System.out.println(Surface_area);
    }
}
