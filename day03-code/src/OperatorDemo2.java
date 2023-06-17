public class OperatorDemo2 {
    /**
     * 扩展运算符
     *
     * +=
     * -=
     * *=
     * /=
     * @param args
     */
    public static void main(String[] args) {
        //赋值运算符

        int a = 10;

        a+=20; //a = a+20 = 30

        System.out.println(a);


        /**
         *a是short 常量默认为int 运算时默认提升为int 扩展运算符
         */
        short b  =1;
//        a = a+1; //会报错
           b += 1;//不会报错 扩转运算符隐含了 强制类型转换
    }
}
