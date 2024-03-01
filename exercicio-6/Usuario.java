import java.util.Scanner ;

public class Usuario {
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      boolean valorValido = false;
      String nomeUser;
      String senha;
      do {
        
        System.out.print("Digite seu Nome de Usuario :");
        nomeUser = scan.next();
        System.out.print("digite sua senha :");
        senha = scan.next();
        
        //if(senha.equalsIgnoreCase(nomeUser)) , para verificar se ambos sao iguais com qualquer coisa digitada....
        if(senha.equalsIgnoreCase("miguel") && nomeUser.equalsIgnoreCase("miguel")){
          System.out.println("Nome e senha nao podem ser iguais");
        }else if(senha != nomeUser){
          valorValido = true;
          System.out.println("Correto!");
        }
        
      }while(!valorValido);
   }
}