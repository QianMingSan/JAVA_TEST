public class OperatorTest1 {
    public static void main(String[] args) {
        int x =10;
        int y  = ++x;
        int z = y--;
        System.out.println("x="+x);//11
        System.out.println("y="+y);//10
        System.out.println("z="+z);//11

        System.out.println("===================");

        int a = 3;
        int b  = (++a)+(a++)+(a*10);//4+4+50=58
        System.out.println("a="+a);//5
        System.out.println("b="+b);//58

    }
}
