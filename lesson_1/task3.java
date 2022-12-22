package lesson_1;
// 3.Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка. 
// Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)

public class task3 {

    public static void main(String[] args ) {
            String ls = " ";
             
            for(int i=2; i <=1000; i++){ 
               boolean simplenum = true;
               
               for(int j=2; j <i; j++){ 
                if(i%j==0){
                    simplenum = false; 
                    break; 
                }
                    
            }
            if (simplenum){
                ls+=i + " ";
            }
        }
            System.out.println(ls); 
    }       
}