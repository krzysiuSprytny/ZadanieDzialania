public class liczby implements dzialania {
    // Prywatne pola
    private int liczba1;
    private int liczba2;

    // Konstruktor
    public liczby(int liczba1, int liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }

    // Gettery
    public int getLiczba1() {
        return liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    // Implementacja metod interfejsu
    @Override
    public int dod(int a, int b) {
        return a + b;
    }

    @Override
    public int odej(int a, int b) {
        return a - b;
    }

    @Override
    public int mnoz(int a, int b) {
        return a * b;
    }

    @Override
    public int dziel(int a, int b) {
        if (b == 0) {
            System.out.println("Nie można dzielić przez 0");
            return Integer.MIN_VALUE; // Specjalna wartość oznaczająca błąd
        }
        return a / b;
    }
}