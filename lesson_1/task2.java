package lesson_1;
import java.util.Scanner;

// 2.Вычислить n! (произведение чисел от 1 до n)

public class task2 {
    public static void main(String[] args ) {
       
    System.out.println("Введите число: ");
    Scanner scanner = new Scanner(System.in);
    int val = scanner.nextInt();
    System.out.printf("Факториал %d\n",val);
    
    System.out.println(factorial(val));
    scanner.close();
    }
    public static long factorial(int val){
    long res = 1;
    int i = 1;
    while (i <= val){
        res *= i;
        // System.out.println(res);
        i++;
    }
    
    return res;
    }
}
