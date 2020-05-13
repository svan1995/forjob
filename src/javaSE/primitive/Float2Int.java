package javaSE.primitive;

public class Float2Int {



    private int a = 1;
    private static int b = 2;

    public void a(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void b(){

    }





    public static void main(String[] args) {


        float a = 2147483648.6f;

        int x = (int)a;
        System.out.println(x);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        float aa = (float) 444444890;
        System.out.println(aa);


    }
}
