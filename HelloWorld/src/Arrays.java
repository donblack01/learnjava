
public class Arrays {
    public static void main(String[] args) {
        /**
         * 数组定义的三种方式
         */

        // String[] arr1 = new String[4];
        // double[] arr2 = new double[]{1,2,3,4,5};
        // int[] arr3 = {1,2,3,4,5,6};
        // System.out.println(arr3[2]);
        // arr3[1] = 4;
        // System.out.println(arr2[0]);
        int[] arr = { 1, 2, 8, 4, 9, 3456, 78, 54, 4 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);

        printArr(arr);

    }



    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}