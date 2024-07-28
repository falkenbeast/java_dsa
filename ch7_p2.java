    //this program shows how to find the unique number in the array using xor..
public class ch7_p2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {                    // this syntax is used to go through each element of for loop ":"
            unique ^= n;
        }
        
     /*    for(int n=0;n<arr.length;n++){
            unique ^= arr[n];                                
        } */


        return unique;
    }
}