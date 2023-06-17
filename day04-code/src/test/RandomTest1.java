package test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
    /**
     * 猜数字小游戏
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100)+1;
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        while (true){
            int shuru = sc.nextInt();

            if (shuru<num){
                System.out.println("猜小了");
            } else if (shuru>num) {
                System.out.println("猜大了");
            }else if (shuru==num){
                System.out.println("猜中了");
                break;
            }
        }
    }
}
