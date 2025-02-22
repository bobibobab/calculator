import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator. Enter commands (e.g., 'add 1 3'). Type 'exit' to quit.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length == 0) continue;

            String command = parts[0];

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println(calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "subtract":
                        System.out.println(calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "multiply":
                        System.out.println(calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "divide":
                        int num1 = Integer.parseInt(parts[1]);
                        int num2 = Integer.parseInt(parts[2]);
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println(calculator.divide(num1, num2));
                        }
                        break;
                    case "fibonacci":
                        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parts[1])));
                        break;
                    case "binary":
                        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parts[1])));
                        break;
                    default:
                        System.out.println("Invalid command. Use add, subtract, multiply, divide, fibonacci, binary.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input format.");
            }
        }

        scanner.close();
    }
}

