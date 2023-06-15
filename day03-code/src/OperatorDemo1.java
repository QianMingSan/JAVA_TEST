public class OperatorDemo1 {
    /**
     * 自增自减运算符
     *
     * ++ ：让变量自身值加1
     * --： 让变量自身值减1
     * -----------------
     * 单独使用 一条语句 只做++/-- 运算符在前在后没有区别
     *
     *参与运算使用
     * ++在前 先自增 在操作
     * ++在后 先操作 在自增
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        a++;

        --a;
        System.out.println("a="+a);
    }
}
