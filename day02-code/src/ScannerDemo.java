import java.util.Scanner;

public class ScannerDemo {
    /**
     * 键盘录入
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据年龄");
        int age = sc.nextInt();
        System.out.println("请输入数据名字");
        String name = sc.next();


        System.out.println(age);
        System.out.println(name);
    }
}
