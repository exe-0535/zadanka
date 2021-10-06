import java.util.Scanner;

public class Zadanka {

    private static final Scanner skaner = new Scanner(System.in);

    public static void main(String[] args) {

        // PETLE

        // Zad 1

        int n = -1;

        while(n != 0) {
            System.out.println("Wprowadź liczbę: "); n = skaner.nextInt();
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

        System.out.println("Podaj login: "); String login = skaner.next();
        System.out.println("Podaj hasło: "); String password = skaner.next();

        System.out.println("Zaloguj się: ");

        for(int i = 1; i < 3; i++) {

            System.out.println("Podaj login: "); String loginCheck = skaner.next();
            System.out.println("Podaj hasło: "); String passwordCheck = skaner.next();

            if(loginCheck.equals(login) && passwordCheck.equals(password)) {
                System.out.println("Wprowadzono poprawne dane."); break;
            } else {
                System.out.println("Wprowadzono błędny login lub hasło. Spróbuj ponownie. Pozostało prób: " + (3 - i));
            }
        }

        // Zad 4

        System.out.println("Podaj liczbę do znalezienia dzielników: "); int nextNum = skaner.nextInt();

        if(nextNum <= 0) System.out.println("Błędna liczba");
        else {
            for(int i = 1; i <= nextNum; i++) {
                if(nextNum % i == 0) System.out.println("Następnym dzielnikiem liczby " + nextNum + " jest " + i);
            }
        }

        // Zad 5

        int max = Integer.MIN_VALUE;
        int number = -1;

        while(number != 0) {
            System.out.println("Wprowadź number: "); number = skaner.nextInt();
            if(number > max && (number % 2 == 1)) max = number;
        }

        System.out.println("Największą liczbą nieparzystą jest " + max);

        // Zad 6

        System.out.println("Podaj dlugosc prostokąta: "); int length = skaner.nextInt();
        System.out.println("Podaj szerokosc prostokąta: "); int width = skaner.nextInt();

        for(int i = 0; i < length; i++) {
            for(int j = 1; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        // Zad 7

        System.out.println("Podaj wysokosc trojkata: "); int height = skaner.nextInt();

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
