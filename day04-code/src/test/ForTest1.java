package test;

public class ForTest1 {

    /**
     * 需求 在控制太打印1-3 3-1
     * @param args
     */
    public static void main(String[] args) {
        //1-3
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        //3-1
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
