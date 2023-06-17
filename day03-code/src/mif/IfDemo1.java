package mif;

public class IfDemo1 {
    /**
     * if语句格式
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("开始");

        int age  =15;

//        if (age>18){
//            System.out.println("可以上网吧");
//        }



        if (age>18){
            System.out.println("可以上网吧");
        }else {
            System.out.println("不可以上网吧");
        }


        if (age>18){
            System.out.println("可以上网吧");
        }else if (age <16){
            System.out.println("不可以上网吧");
        }else{
            System.out.println("学习");
        }

        System.out.println("结束");
    }
}
