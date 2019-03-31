package Day15;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Day15_1 {
    public static void main(String[] args) {
        int[] data = generateRandomArray(100000,0,1000000);
        //bubbleSort(copyArray(data));
        insertSort(copyArray(data));
        binaryInserSort(copyArray(data));
        shellSort(data);
//        int[] data = new int[] {5,3,7,2,4,8,};
////        binaryInserSort(data);
//        shellSort(data);
//        for (int i :data) {
//            System.out.print(i + "、");
//        }
    }
    /**
     * 冒泡排序
     * 空间复杂度为：O(1)
     * 冒泡排序是原地排序算法
     * 冒泡排序是稳定排序算法
     * 最好时间复杂度：O（n）  已经有序
     * 最坏时间复杂度：O（n^2）完全倒序
     */
    private static void bubbleSort(int[] arr){
        long start = System.currentTimeMillis();
        int n = arr.length;
        if( n <= 1){
            return;
        }else{
            //比较次数
            for (int i = 0; i < n; i++) {
                boolean flag = false;//优化
                for(int j = 0;j < n -i - 1;j++){
                    if(arr[j] > arr[j+1] ){
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序总耗时为：" + (end - start) + "毫秒");
    }

    /**
     * 直接插入排序
     * 空间复杂度为：O(1)
     * 直接插入排序是原地排序算法
     * 直接插入排序是稳定排序算法
     * 最好时间复杂度为：O(n)  从头到尾遍历已经有序的数据
     * 最坏时间复杂度为：O(n^2)
     * 平均时间复杂度为：O(n^2)
     * @param arr
     */
    private static void insertSort(int[] arr){
        long start = System.currentTimeMillis();
        int n = arr.length;
        if(n <= 1){
            return;
        }else{
            for (int i = 0; i < n ; i++) {
                //未排序数组的第一个元素
                int val = arr[i];
                int j = i - 1;
                //从后向前找元素应该插入的位置
                for (;j >= 0;j--){
                    if(val < arr[j]){
                        arr[j+1]  = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j+1] = val;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("直接插入排序总耗时为：" + (end - start) + "毫秒");
    }

    /**
     * 折半插入排序 （与直接插入相同，比较次数不同）
     * 空间复杂度为：O(1)
     * 折半插入排序是原地排序算法
     * 折半插入排序是稳定排序算法
     * 最好时间复杂度为：O(n)
     * 最坏时间复杂度为：O(n^2)
     * 平均时间复杂度为：O(n^2)
     * @param arr
     */
    private static void binaryInserSort(int[] arr){
        long start = System.currentTimeMillis();
        int n = arr.length;
        if (n <= 1){
            return;
        }else{
            int low,mid,high,j = 0;
            for (int i = 1; i < n ; i++) {
                //未排序集合的第一个元素
                int temp = arr[i];
                //已排序集合的第一个元素
                low = 0;
                //已排序集合的最后一个元素
                high = i -1;
                while(low <= high){
                    mid = high - (high - low) / 2;
                    if(temp > arr[mid]){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
                //插入的位置在high+1处，搬移元素
                for( j = i -1;j > high;j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("折半插入排序总耗时为：" + (end - start) + "毫秒");
    }

    /**
     * 希尔排序
     * 空间复杂度：O（1）
     * 非稳定性排序
     * @param arr
     */
    private static void shellSort(int[] arr){
        long start = System.currentTimeMillis();
        int n = arr.length;
        if (n <= 1) return;
        int step = n / 2;
        while( step >= 1){
            for (int i = step; i < n; i++) {
                int val = arr[i];
                int j = i - step;
                for (; j >= 0;j -= step){
                    if (val  < arr[j]){
                        arr[j + step] = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j + step ] = val;
            }
            step = step / 2;
        }

        long end = System.currentTimeMillis();
        System.out.println("希尔排序总耗时为：" + (end - start) + "毫秒");
    }

    /**
     * 选择排序 ： 从未排区间找到最小的元素，放到已排区间的末尾
     *空间复杂度 O（1）
     * 最好，最坏时间复杂度：O（n^2）
     * 不稳定的排序算法
     * @param arr
     */
    private static void selectionSort(int[] arr,int n){
         if (n <= 1) return;

        for (int i = 0; i <  n - 1; ++i) {
            //查找最小值
            int min = i;
            int j = i + 1;
            for(;j < n;++j){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //交换
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static int[] generateRandomArray(int n ,int rangeL,int rangeF){
        assert rangeL <= rangeF;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =  new Random().nextInt((rangeF - rangeL +1)+rangeL);
        }
        return arr;
    }
    public  static int[] copyArray(int[] array){
        return Arrays.copyOf(array,array.length);
    }
}
