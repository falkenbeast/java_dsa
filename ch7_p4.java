// find the the nth magic number ..


public class ch7_p4 {
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}

