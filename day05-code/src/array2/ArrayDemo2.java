package array2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /**
         * 遍历二维数组
         */
        int[][] arr = {
                {11,22,33},
                {22,33,44}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
        }

    }
}
