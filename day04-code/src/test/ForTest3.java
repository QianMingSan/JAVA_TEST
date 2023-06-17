package test;

public class ForTest3 {
    /**
     * 循环嵌套
     * 在循环中 继续写循环的代码
     *
     * 需求 打印矩形
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
