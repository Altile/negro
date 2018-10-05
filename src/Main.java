public class Main {
    public static void main(String[] args) {

        System.out.println(rechner(6, 8, '/'));
        boolean nibba = true;
    }

    public static double rechner(double zahl1, double zahl2, char operator) {
        double summe;
        if (operator == '+') {
            summe = zahl1 + zahl2;
        } else if (operator == '-') {
            summe = zahl1 - zahl2;
        } else if (operator == '/') {
            summe = zahl1 / zahl2;
        } else if (operator == '*') {
            summe = zahl1 * zahl2;
        } else {
            System.out.println("bruh man braucht schon n operator");
            summe = 0;
        }
        return summe;
    }
}



