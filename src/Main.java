import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie dwóch liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        // Tworzenie obiektu klasy liczby
        liczby dzialania = new liczby(a, b);

        // Wykonywanie działań
        System.out.println("Liczby: " + a + " i " + b);
        System.out.println("Dodawanie: " + dzialania.dod(a, b));
        System.out.println("Odejmowanie: " + dzialania.odej(a, b));
        System.out.println("Mnożenie: " + dzialania.mnoz(a, b));

        int wynikDzielenia = dzialania.dziel(a, b);
        if (wynikDzielenia != Integer.MIN_VALUE) {
            System.out.println("Dzielenie: " + wynikDzielenia);
        }




        scanner.close();
    }
}