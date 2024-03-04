import java.util.Scanner;

public class Raiz {
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Entre com valor de A: ");
      int valorA = scan.nextInt();
      
      if(valorA == 0){
        System.out.println("Nao e um equação de segundo grau");
      }else{
        System.out.print("Entre com valor de B: ");
        int valorB = scan.nextInt();
        
        System.out.print("Entre com valor de C: ");
       int valorC = scan.nextInt();
       
       double delta = Math.pow(valorB,2) -  (4 * valorA * valorC);
       
       if(delta < 0){
         System.out.println("Delta negativo");
       }else{
         System.out.println("Delta " + delta);
         
         double x1 = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
         double x2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);
         
         System.out.println("x1 = " + x1);
         System.out.println("x2 = " + x2);
       }
      }
   }
}