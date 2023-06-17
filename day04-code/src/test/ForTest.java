package test;

public class ForTest {
    /**
     * 求1-100 之间偶数之和
     * @param args
     */
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);//1-100的偶数和

    }
}
