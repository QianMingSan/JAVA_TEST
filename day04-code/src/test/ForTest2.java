package test;

public class ForTest2 {
    /**
     * 需求：在控制台输出所有的“水仙花数”，并统计出水仙花数的个数
     *
     *分析：
     * 定义计数器变量 count，准备统计水仙花数的个数
     * 通过 for 循环，获取到所有的三位数 100 - 999
     * 在循环内部，将每一个三位数拆分为（个位，十位，百位）
     * 加入 if 筛选条件
     * if (ge*ge*ge + shi*shi*shi + bai*bai*bai == 原数)
     * 满足条件则输出水仙花数，count变量++
     * 打印 count 所记录的值
     *
     * @param args
     */
    public static void main(String[] args) {
        //获取三位数
        for (int i = 100; i <=999; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println("水仙花数为"+i);
            }
        }
    }
}
