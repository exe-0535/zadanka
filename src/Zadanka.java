import java.util.Scanner;

public class Zadanka {

    private static final Scanner skaner = new Scanner(System.in);

    public static void main(String[] args) {

        // PETLE

        // Zad 1

        int n = -1;

        while(n != 0) {
            System.out.println("Wprowadź liczbę: ");
            n = skaner.nextInt();
            System.out.println("Wprowadzono " + n + ".");
        }

        // Zad 2

        System.out.println("Wprowadź liczbę do obliczenia silni: ");

        int s = 1;
        int num = skaner.nextInt();
        for(int i=1; i <= num; i++){
            s = s * i;
        }

        System.out.println("Silnia liczby " + num + " to " + s);

        // Zad 3


    }

}
