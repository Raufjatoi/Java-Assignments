package lab2;

public class array_prc4 {
    public static void main(String[] args) {
        
    
    int [] numbers = {1,2,3,7,5,6};
    int maxnum = numbers[0];
    int min = numbers[5];

    for(int num : numbers ){
        if (num > maxnum){
            maxnum = num;
        }
        else if (num < min){
            min = num;
        }
        }
    System.out.println(maxnum);
    System.out.println(min);

    

    }
}
