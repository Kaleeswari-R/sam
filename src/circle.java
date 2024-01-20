import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        float a;
        int r;
        Scanner s= new Scanner(System.in);
        System.out.println("enter r");
        r=s.nextInt();
        a = (float) (3.14 * r * r);
        System.out.println(a);
    }
}
