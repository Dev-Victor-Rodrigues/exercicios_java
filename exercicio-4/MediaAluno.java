import java.util.Scanner ;

public class MediaAluno {
  
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
     System.out.print("Digite sua Primeira nota: ");
     double primeiraNota = scan.nextDouble();
     System.out.print("Digite sua Segunda nota: ");
     double segundaNota = scan.nextDouble();
     
     double media = (primeiraNota + segundaNota) / 2;
     
     if(media >= 9.0 && media <= 10){
       //conceito A
       System.out.println("Aprovado(a)");
     }else if(media >= 7.5 && media < 9.0){
       //conceito B
       System.out.println("Aprovado(a)");
     }else if(media >= 6.0 && media < 7.5){
       //conceito C 
       System.out.println("Aprovado(a)");
     }else if(media >= 4.0 && media < 6.0 ){
       //conceito D 
       System.out.println("Reprovado");
     }else if(media >= 0.0 && media < 4.0){
       //conceito E 
       System.out.println("Reprovado");
     }else {
       System.out.println("incorreto!!!");
     }
     
     System.out.println("Primeira nota: " + primeiraNota + " Segunda nota: " + segundaNota);
     System.out.println("Media :"+ media);
   }
}