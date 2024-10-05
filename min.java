public class min {
    public static int findmin (int[] arr){
        int min = arr[0];
        for ( int i = 0 ; i < arr.length ; i++){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    
    }
    public static int findmax (int[] arr){
        int max = arr [0];
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        int[] number = {5,2,3,4,-5,6,800,1,100};
        System.out.println("min number is " + findmin(number));
        System.out.println("max number is " + findmax(number));
    }
}