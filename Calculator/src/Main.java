import java.util.Scanner;

class Number {

    private double number;

    public Number(double number) {
        this.number = number;
    }

    public void add(double value) {
        number += value;
    }

    public void subtract(double value) {
        number -= value;
    }

    public void multiply(double value) {
        number *= value;
    }

    public void divide(double value) {
        number /= value;
    }

    public double getNumber() {
        return number;
    }
}

record UserInterface(Scanner scanner, Number number) {

    public void start() {
        printCommands();
        while (true) {
            String cmd = scanner.nextLine();
            if (cmd.equals("stop"))
                break;

            String[] parts = cmd.split(" ");
            switch (parts[0]) {
                case "+" -> addNumber(Double.parseDouble(parts[1]));
                case "-" -> subtractNumber(Double.parseDouble(parts[1]));
                case "*" -> multiplyNumber(Double.parseDouble(parts[1]));
                case "/" -> divideNumber(Double.parseDouble(parts[1]));
                case "=" -> printResult();
            }
        }
    }

    public void addNumber(double num) {
        number.add(num);
        System.out.println();
    }

    public void subtractNumber(double num) {
        number.subtract(num);
        System.out.println();
    }

    public void multiplyNumber(double num) {
        number.multiply(num);
        System.out.println();
    }

    public void divideNumber(double num) {
        number.divide(num);
        System.out.println();
    }

    public void printResult() {
        System.out.println("= " + number.getNumber());
    }

    public void printCommands() {
        System.out.println("+: add\n" +
                "-: minus\n" +
                "*: multiply\n" +
                "/: divide\n" +
                "=: result\n" +
                "stop: stop calculator");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("initial value: ");
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        Number number = new Number(num);
        UserInterface ui = new UserInterface(scanner, number);
        ui.start();
    }
}
