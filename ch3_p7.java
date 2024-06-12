//this program shows the performance of the string loop which give 0(n2) time complexity 

public class ch3_p7 {
    public static void main(String[] args) {
        String series = "";
            for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

        System.out.println(series);
    }}
