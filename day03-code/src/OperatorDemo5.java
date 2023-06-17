public class OperatorDemo5 {
    /**
     * && 练习
     * @param args
     */
    public static void main(String[] args) {
        int x = 3;
        int y  =4;

        boolean falg = ++x>5 && y--<2; //短路y--不执行 && 有短路效果
        System.out.println("x="+x);  //4
        System.out.println("y="+y); //4
        System.out.println(falg); //false

    }
}
