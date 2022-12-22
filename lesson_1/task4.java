package lesson_1;
// 4.Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... 
//   "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
import java.util.Scanner;
public class task4 {
    public static void main(String[] args ) {
          System.out.println("Enter number: ");
          int a = enterNum();
          System.out.println("Select an action: ");
          String actions = getAct();
          System.out.println("Enter number: ");   
          int b = enterNum();
          int res = getAction(actions, a, b);
          System.out.printf("%d  %s  %d = %d",a,actions,b,res);
          
    }
    public static int enterNum(){ 
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    return num;
    }
    public static String getAct(){
      Scanner act = new Scanner(System.in);
      String actions = act.next();
      return actions;
    }
    
    public static int getAction(String a, int f, int k){
              int res = 0;
              switch(a){
                  case "+": res = f + k;
                  break;
                  case "-": res = f - k;
                  break;
                  case "*": res = f * k;
                  break;
                  case "/": res = f / k;
                  break;
                  default:  System.out.println("Akella missed! Try again: +,-,*,/");

              }
              return res;
          }
}
      
