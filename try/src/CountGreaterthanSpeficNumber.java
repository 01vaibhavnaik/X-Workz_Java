public class CountGreaterthanSpeficNumber {
    public static void main(String []args){
        int[] arr = {12, 35, 1, 10, 34, 1};
        int specificNumber = 9;
        System.out.println( specificNumber + ": " + countGreaterThan(arr, specificNumber));
    }
    public static int countGreaterThan(int[] arr,int specificNumber) {
        int count = 0;
       for(int num:arr){
            if(num > specificNumber) {
                count++;
            }
        }
        return count;
       }
    }

