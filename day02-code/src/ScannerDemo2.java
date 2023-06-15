import java.util.Scanner;

public class ScannerDemo2 {
    /**
     * 需求 根据输入的数 将数字 拆分为
     * 个位  %10
     * 十位 /10%10
     * 百位 /100%10
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三位数据");
        int num = scanner.nextInt();

        System.out.println("拆分为个位为："+num%10);
        System.out.println("拆分为十位为："+num/10%10);
        System.out.println("拆分为百位为："+num/100%10);

    }
}
