public class ChangeDemo2 {
    /**
     * 强制转换
     * 将取值大的变量或数据 给取值小的变量赋值
     * 减少强转的使用
     * @param args
     */
    public static void main(String[] args) {

        double a = 12.3;
        int b= (int) a;
        System.out.println(b);
    }
}
