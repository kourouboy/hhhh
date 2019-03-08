package Day13;

import java.util.concurrent.ForkJoinPool;

public class Day13_1 {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,8,2,5};
        //bubbleSort(array);
        charuSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
// 4 5 6 1 3 2
    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                boolean flag = false;
                for(int j = 0; j < n-i-1;j++){
                    if(array[j +1] < array[j]){
                        flag = true;
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                if(!flag){
                    break;
                }
            }

        }
    }

    /**
     * 插入排序
     * @param array
     */
    public static void charuSort(int[] array){
        int n = array.length;
        if(n <= 1){
            return ;
        }else{
            //待排序
            for (int i = 1; i < n; i++) {
                //待排序的第一个元素
                int charu = array[i];
                //已排序的最后元素
                int j = i-1;
                for(;j >= 0;j--){
                    if(array[j] > charu){
                        array[j+1] = array[j];
                    }else{
                        break;
                    }
                }array[j+1] = charu;
            }
        }


    }
}