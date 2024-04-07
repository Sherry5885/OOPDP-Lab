class IntValue{
    int aa;
    IntValue(float a){
        aa = (int)a;
    }
}

public class Question6 {
    public static void main(String[] args) {
        float aaa = 100.8989f;
        IntValue INTVAL = new IntValue(aaa);
        System.out.println(INTVAL.aa);
    }
}
