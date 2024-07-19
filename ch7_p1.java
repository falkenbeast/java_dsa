import java.util.*;               //checks the number is even or not using and '&' operator 
public class ch7_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check ");
        int n = sc.nextInt();
        if((n & 1) == 1)
        {
            System.out.println("odd ");
        }
        else
        System.out.println("even");
    }
}
