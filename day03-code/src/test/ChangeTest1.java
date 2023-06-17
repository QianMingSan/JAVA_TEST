package test;

public class ChangeTest1 {
    /**
     * 类型转换面试题
     *
     *         byte b1 =3;
     *         byte b2 = 4;
     *         byte b3 =b1+b2;
     *    回答 ：会报错 b1和b2 参与运算会直接提升为int 存在类型的强制转换
     *
     *    byte b = 3+4;
     *    疑惑：3和4相加会提升为int类型 需要强转
     *
     *   答按： 在代码中不会报错  因为java中存在常量优化机制
     *          -在编译的时候 就会将结果运算好
     *          - class 文件中 buyte b = 7
     *
     * byte
     * @param args
     */
    public static void main(String[] args) {
        //解决办法
        byte b1 =3;
        byte b2 = 4;
        byte b3 =(byte)(b1+b2);
        //面试题2
        byte b = 3+4;

    }
}
