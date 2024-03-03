import java.util.Scanner ;

public class Triangulo {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Entre com lado 1:");
      int lado1 = scan.nextInt();
      
      System.out.print("Entre com lado 2:");
      int lado2 = scan.nextInt();
      
      System.out.print("Entre com lado 3:");
      int lado3 = scan.nextInt();
      
      if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
        
         if(lado1 == lado2 && lado2 == lado3 && lado2 == lado3){
           System.out.println("Triangulo Equilatero");
         }else if(lado1 != lado2 && lado2 != lado3){
           System.out.println("Triangulo Escaleno");
         }else if(lado1 == lado2 || lado1 == lado3 || lado3 == lado2){
           System.out.println("Triangulo Isoceles");
         }
         
      }else{
        System.out.println("Nao e um triangulo");
      }
   }
}