package array;

import java.util.Arrays;

public class ArrayDemo1 {
    /**
     * 数组就是一种容器 可以存储多个同种数据类型的值
     *
     * 发现操作的数据有多个 并且这多个数据 他们属于同一种数据
     *
     * 数组初始化 在内存中 为数组容器开辟空间
     *
     * 格式 数据类型[] 数字名
     * @param args
     */
    public static void main(String[] args) {
        //静态初始化格式
//        int[] arr1 = new int[]{1,2,3};
        //简化格式
        int[] arr2 = {1,2,3};
        //格式2
//        double arr2[] ;
        //获取索引
        System.out.println(arr2[1]);
        //数组遍历
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i);
        }


    }
}
