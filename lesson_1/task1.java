package lesson_1;
// 1Вычислить n-ое треугольного число(сумма чисел от 1 до n)
import java.util.Scanner;
public class task1 {
    public static void main(String[] args ) {
       
    System.out.println("Введите число: ");
    Scanner scanner = new Scanner(System.in);
    int val = scanner.nextInt();
    int n = trinum(val);
    System.out.println(n);
    scanner.close();
}

    public static  int trinum(int val){
    int res = val/2*(val + 1);{ 
    }
     return res;
}
}