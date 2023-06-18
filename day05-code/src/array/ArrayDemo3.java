package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /**
         * 动态初始化
         格式：数据类型[] 数组名 = new 数据类型[数组长度];
         范例：int[] arr  = new int[3];
         */

        int[] arr  = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
