package Day13;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class helpER {
    public static void printArray(int[] array) {
        for(int i : array){
            System.out.println(i + " ");
        }
    }

    /**
     *
     * @param n 生成数组长度
     * @param rangeL  左边界
     * @param rangeR  右边界
     * @return
     */
    public static int[] generateArray(int n,int rangeL,int rangeR){
        int array[] = new int[n];
        if (rangeL > rangeR){
            throw new IllegalArgumentException("Illega array");
        }else{
            for (int i = 0; i < n; i++) {
                array[i] =  new Random().nextInt((rangeR - rangeL +1)+rangeL);
            }
            return array;
        }
    }
    public  static int[] copyArray(int[] array){
        return Arrays.copyOf(array,array.length);
    }
}