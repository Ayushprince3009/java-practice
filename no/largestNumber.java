package no;
public class largestNumber {
    public static int big(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr= {12,4,8,98,56,877,34,54,65,23,18,35};
        int result = big(arr);
        System.out.println("Largest number is: " + result);
    }
}