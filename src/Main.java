import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Задание 1.
    //Пользователь вводит число, необходимо определить, является ли введенное число простым
    public static boolean isPrime(int num){
       if(num<=1) {
           return false;
       }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0) {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int n = Integer.parseInt(scanner.nextLine());
        if (isPrime((n))) {
            System.out.println(n+" -число простое");
        } else {
            System.out.println(n+ " -число составное");
        }

    }
}