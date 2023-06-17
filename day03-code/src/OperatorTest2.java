import java.util.Scanner;

public class OperatorTest2 {
    /**
     * 键盘录入 输入三个数 找出最大值
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();


        int temp = a1 > a2 ? a1: a2;
        int max  =  temp > a3 ? temp : a3;
        System.out.println("最大值："+max);

        int temp1 = a1 < a2 ? a1: a2;
        int min  =  temp1 < a3 ? temp1 : a3;
        System.out.println("最小值："+min);

        int temp3 = (a1 + a2 +a3)   - max -min;

        System.out.println("中间值："+temp3);

    }
}
