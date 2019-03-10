package Day13;

import com.sun.javafx.collections.SortHelper;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.HashMap;
import java.util.concurrent.ForkJoinPool;

public class Day13_1 {
    public static void main(String[] args) {
        int[] data = Day13.SortHelper.generateArray(10000,10,1000000);
        bubbleSort(Day13.SortHelper.copyArray(data));
        charuSort(Day13.SortHelper.copyArray(data));
        binaryInsertSort(Day13.SortHelper.copyArray(data));
        selectionSort(Day13.SortHelper.copyArray(data));
//          int[] array = new int[] {1,3,2,8,2,5};
//          binaryInsertSort(data);
//          Day13.SortHelper.printArray(data);
    }
// 4 5 6 1 3 2
    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        long start = System.currentTimeMillis();
        int n = array.length;
        if (n <= 1) {
            return;
        } else {
            //控制比较次数
            for (int i = 0; i < n; i++) {
                boolean flag = false;
                //两两交换比较
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
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序耗时："+ (end - start) + "毫秒");
    }

     /**
     * 直接插入排序
     * @param array
     */
    public static void charuSort(int[] array){
//        int n = array.length;
//        if( n <= 1){
//            return;
//        }else{
//            //将待排序数据集看为两个区间
//            for (int i = 1; i < n; i++) {
//                //当前待排序数组中的第一个元素
//                int val = array[i];
//                int j = i-1;
//                for(;j >= 0;j--){
//                    if(array[j] > val){
//                        //移元素
//                        array[j + 1] =array[j];
//                    }else{
//                        break;
//                    }
//                }
//                //找到的待插入位置，
//                array[j + 1] = val;
//            }
//        }
        long start = System.currentTimeMillis();
        int n = array.length;
        if(n <= 1){
            return ;
        }else{
            //待排序
            for (int i = 1; i < n; i++) {
                //待排序的第一个元素
                int charu = array[i];
                //待排序数组中的第一个元素
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
        long end = System.currentTimeMillis();
        System.out.println("直接插入排序耗时："+ (end - start) + "毫秒");
    }
    /**
     * 插入排序的优化--折半插入--二分查找
     */
    public static void binaryInsertSort(int[] array){
        long start = System.currentTimeMillis();
        int n = array.length;
        if( n <= 1){
            return;
        }else {
            for (int i = 1; i < n ; i++) {
                int val = array[i];
                //已排序空间的第一个元素
                int low = 0;
                //已排序空间的最后一个元素
                int high = i - 1;
                int j = i - 1;
                //寻找待插入的位置
                while(low <= high){
                    //寻找中间位置
                    int  mid = (low + high) / 2;
                    if (array[mid] < val){
                        low = mid + 1;
                    }else{
                        high = mid - 1;
                    }
                }
                //找到插入位置high + 1
                for (;j >= high + 1 ;j--){
                    array[j+1] = array[j];
                }
                array[j + 1 ] = val;

            }
        }

        long end = System.currentTimeMillis();
        System.out.println("折半插入排序耗时："+ (end - start) + "毫秒");
    }
    /**
     *希尔排序
     */
    public static  void shellSort(int[] array){
        long start = System.currentTimeMillis();


        long end  = System.currentTimeMillis();
        System.out.println("希尔排序总耗时为" + (end - start) + "毫秒");
    }
    /**
     * 选择排序
     * 不稳定排序：5 8 5 2 9
     */
    public static void selectionSort(int[] array){
        long start = System.currentTimeMillis();
        int n = array.length;
        if(n <= 1){
            return;
        }else{
            //从为未排序空间中选择最小值
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i +1 ;j < n ;j++){
                    if (array[j] < minIndex){
                        minIndex = j;
                    }
                }
                //此时min一定是最小值
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("选择排序总耗时为：" + ((end) - (start)) + "毫秒");
    }

    /**
     * 归并排序
     */
    public static void mergeSort(int[] array){
        int n= array.length;
        if(n <= 1){
            return;
        }
        int mid = n / 2;
        mergeInternal(array,0,n-1);
    }
    private static void mergeInternal(int[] array,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low + (high - low)) / 2;
        //左边小数组
        mergeInternal(array,low,mid);
        //右边小数组
        mergeInternal(array,mid +1,high);
        //合并
        merge(array,low,mid,high);
    }
    private static void merge(int[] array,int p,int q,int r){

    }
}