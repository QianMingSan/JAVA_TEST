public class OperatorDemo3 {
    /**
     * 三元运算符
     * 达成二者选其一的效果
     *
     * 格式： 判断条件 ？ 值1 ：值2
     *
     * 执行流程
     *      条件为true/false true 为值1 false为值2
     *
     *      需求：使用程序 找出两个整数的最大值
     * @param args
     */
    public static void main(String[] args) {
        int a =50;
        int b =20;

        int max  = a>b ? a:b;
        System.out.println(max);
    }
}
