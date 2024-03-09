import java.util.Scanner ;

public class Validez {
   
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     boolean infoValida = false;
     String nome;
     do{
       
       System.out.println("Informe seu nome: ");
       nome = scan.next();
       if(nome.length() > 3){
         infoValida = true;
       }else{
         System.out.println("Nome precisa de no minimo 3 caracteres.");
       }
       
     }while(!infoValida);
     
     infoValida = false;
     int idade;
     do{
       
       System.out.println("Informe sua idade: ");
       idade = scan.nextInt();
       if(idade > 0 && idade <= 150){
         infoValida = true;
         System.out.println("Voce tem " + idade + " anos");
       }else{
         System.out.println("Idade invalida");
       }
     }while(!infoValida);
     
     infoValida = false;
     double salario;
     do{
       System.out.println("Informe seu salario: ");
       salario = scan.nextDouble();
       if(salario > 0){
         infoValida = true;
       }else{
         System.out.println("Salario invalido");
       }
     }while(!infoValida);
     
     infoValida = false;
     String sexo;
   do{
     System.out.println("Informe sua sexualida (F - M)");
     sexo = scan.next();
     if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
       infoValida = true;
     }else{
       System.out.println("genero invalida");
     }
   }while(!infoValida);
   
   infoValida = false;
   String estado;
   do{
      
   }while(!infoValida);
   }
}