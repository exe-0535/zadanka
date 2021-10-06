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


    }

}
