public class ArrayPositiveZahlen {
    public static int findMaxZahl(int[] array){
        int max = array[0];
        for(int i = 1;i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int findMinZahl(int[] array){
        int min = array[0];
        for(int i = 1;i < array.length; i++){
            if(array[i] < min)
                min= array[i];
        }
        return min;
    }

    public static int findMaxSum(int[] array) {
        int sum = 0;
        int min = array[0];
        for (int n : array) {
            sum += n;
            if(n < min){
                min = n;
            }
        }
        return sum - min;
    }

    public static int findMinSum(int[] array){
        int sum = 0;
        int max = array[0];
        for(int n : array){
            sum += n;
            if(n > max){
                max = n;
            }
        }
        return sum - max;
    }

}
