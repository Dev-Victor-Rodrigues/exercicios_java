import java.util.Scanner ;

public class DiaSemana {
    
    public static void main(String[] args){
       
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Digite um dia da Semana Sendo representado por : 1 a 7: ");
       int diaSemana = scan.nextInt();
       
       switch(diaSemana){
         case 1: System.out.println("Domingo"); break;
         case 2: System.out.println("Segunda"); break;
         case 3: System.out.println("Terça-feira"); break;
         case 4: System.out.println("Quarta-feira"); break;
         case 5: System.out.println("Quinta-Feira"); break;
         case 6: System.out.println("Sexta-feira"); break;
         case 7: System.out.println("Sabado"); break;
         default: System.out.println("Nao e um dia da Semana valido");
       } 
    }
}