class PrintName{
    int a = 10;
    Integer i = a;

    Integer k = 50;
    int f = k;

    float fl = 5.6f;
    Float fl2 = fl;

    Float fl3 = 16.6f;

    float fl4 = fl3;

    void Display(){
        System.out.println(a+" "+i+" "+k+" "+f );
        System.out.println(fl+" "+fl2+" "+fl3+" "+fl4);
    }
}



public class Question5 {
    public static void main(String[] args) {
        PrintName obj = new PrintName();
        obj.Display();
    }
}
