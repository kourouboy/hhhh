package Array;


public class Work1 {

    public static boolean Find(int target, int [][] array){


        for (int i = 0; i <array.length ; i++) {
            int low = 0;
            int high = array[i].length;
            while(low <= high){
                int mid = (low + high)/2;
                if(target > array[i][mid]){
                    low = mid +1;
                }else if (target < array[i][mid]){
                    high = mid -1;
                }else{
                    return true;
                    }
                }
            }
            return false;
    }

    public static void main(String[] args) {
//        int[][] data = new int[][] {{1,2,3},{2,3,4}};
//        int i = 1;
//        System.out.println(Find(i,data));

    }
}
