
// given a number n find the no of set bits in it
public class ch7_p8{
    public static void main(String[] args) {
        int base = 2;
        int power = 4;

        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}