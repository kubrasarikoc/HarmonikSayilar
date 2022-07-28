import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total=0;
        System.out.println("n Sayısını Giriniz : ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++){
            total += (1/i);
        }
        System.out.println(total);
    }
}
