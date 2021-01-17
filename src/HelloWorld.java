import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        String name;
        int age;
        double annualPay;

        Scanner kb = new Scanner(System.in);

        System.out.print("Please type your name: ");
        name = kb.nextLine();

        System.out.print("Please type your age: ");
        age = kb.nextInt();

        System.out.print("Please type your annualPay: ");
        annualPay = kb.nextDouble();

        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");
    }
}
