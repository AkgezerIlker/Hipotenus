import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("Komşu eksen derecesini giriniz: ");
        a = input.nextInt();

        System.out.print("Karşı eksen derecesini giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));


        System.out.println("Hipotenüs: " + c);
    }
}
