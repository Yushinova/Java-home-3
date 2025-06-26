import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Задание 1.
    //Пользователь вводит число, необходимо определить, является ли введенное число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Задание 2.
    //Пользователь вводит целое число (любое длины, int).
    //Программа должна посчитать сумму и произведение цифр данного числа.
    public static int SumN(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Получаем последнюю цифру
            num /= 10;       // Удаляем последнюю цифру
        }
        return sum;
    }

    public static int MultiN(int num) {
        int multi = 1;
        while (num != 0) {
            multi *= num % 10;  // Получаем последнюю цифру
            num /= 10;       // Удаляем последнюю цифру
        }
        return multi;
    }

    //Задание 3.
    //Пользователь вводит 2 числа. Необходимо найти НОК и НОД двух этих чисел.
    //НОД
    public static int Nod(int a, int b) {
        while (Math.min(a, b) > 0) {
            if (a >= b) {
                a = a % b;
            } else b = b % a;
        }
        return Math.max(a, b);
    }
    //рекурсивный метод
    public static int NodRecursive(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return NodRecursive(b, a % b);
    }
//НОК
public  static int Nok(int a, int b){

        return a*b/Nod(a,b);
}
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (isPrime((n))) {
            System.out.println(n + " -число простое");
        } else {
            System.out.println(n + " -число составное");
        }
        System.out.println("Сумма цифр числа: " + SumN(n));
        System.out.println("Произведение цифр числа: " + MultiN(n));
        System.out.print("Введите число a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите число b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("НОД = " + Nod(a, b));
        System.out.println("НОК = " + Nok(a, b));
    }
}