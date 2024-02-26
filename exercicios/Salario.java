import java.util.Scanner ;

public class Salario {
       
     public static void main(String[] args){
    
       Scanner scan = new Scanner(System.in);

        System.out.print("Qual e seu salario? : R$");
        double salario = scan.nextDouble();


        if(salario <= 280.00){
          double porcentagem = 0.20;
          System.out.println("Seu novo salario com 20% de aumento e: R$" + (salario +(salario * porcentagem)));
        }else if(salario >= 280.00 && salario <= 700.00){
          double porcentagem = 0.15;
          System.out.println("Seu novo salario com 15% de aumento e: R$" + (salario +(salario * porcentagem)));
        }else if(salario >= 700.00 && salario <= 1500){
          double porcentagem = 0.10;
          System.out.println("Seu novo salario com 10% de aumento e: R$"+ (salario +(salario * porcentagem)));
        }else if(salario >= 1500){
          double porcentagem = 0.05;
          System.out.println("Seu novo salario com 5% de aumento e: R$" + (salario + (salario * porcentagem)));
        }
     }
}
