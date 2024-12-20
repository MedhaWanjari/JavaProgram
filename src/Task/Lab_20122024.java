package Task;

public class Lab_20122024 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int max = x<y ? x:y;
        System.out.println(max);
        int a = 20;
        int b = 30;
        int c = 40;
        int d = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(d);
    }
}
