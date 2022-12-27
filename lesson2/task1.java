package lesson2;
// Используем наш код который мы писали на семинаре и дорабатываем, 
// нужно сделать так что бы мы могли написать формулу и заполненить все элементов которые сами же и вели
// Например
// a + b + c
// 2
// 3
// 4
// ответ 9

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args){ 
          Equation();
    
    }
    public static String GetString()
  {
    Scanner str = new Scanner(System.in);
    String equation;
    System.out.println("Введите формулу");
    equation = str.nextLine();
    return equation;
  }
   public static void Equation()
   {
    Map<String, Integer> states = new HashMap<String, Integer>();
    states.put("0",0);
    System.out.println(states);
    Scanner str = new Scanner(System.in);
    String equation = GetString();
    equation = String.format(equation).replace(" ", "");
    String [] st1 = equation.split("\\+");
     int[] numbers = new int[st1.length];
    int sum = 0;
    for(int i = 0; i < st1.length; i++)
    {
     for(Map.Entry<String, Integer> item : states.entrySet()) {
       if(item.getKey() != st1[i]){ 
       states.put(st1[i], str.nextInt()); 
        break;
       } 
     } 
    } 
     for(Map.Entry<String, Integer> item : states.entrySet()) {
        sum+= item.getValue();
        
     }
     System.out.println(sum);
     
    }
   
     
}