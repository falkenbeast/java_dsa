//this program shows that string object cannot be changed ones asssigned  (immutablity)..
public class ch3_p2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String name = "Kunal Kushwaha";
//        System.out.println(name);

        String a = "Kunal";                  // assigned once 
        System.out.println(a);
        a = "Kushwaha";  //this is creating a new object of name "kushwaha" this is not changing the value of previouse a reference variable
        System.out.println(a);
    }
}
