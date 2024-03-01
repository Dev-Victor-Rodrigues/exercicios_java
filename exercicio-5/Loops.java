import java.util.Scanner ;

public class Loops {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      boolean notaValida = false;
      do{
        
      System.out.print("Digite uma nota entre 0 ou 10 : ");
      int nota = scan.nextInt();
      
      if(nota >= 0 && nota <= 10){
        notaValida = true;
        System.out.println("Nota valida");
      }else{
        System.out.println("Nota invalida");
      }
      
    }while(!notaValida);
  }
}