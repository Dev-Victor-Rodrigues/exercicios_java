import java.util.Scanner ;

public class Desconto {
       
    public static void main(String[] args){
       
      Scanner scan = new Scanner(System.in);

      System.out.print("Quantos voce cobra por hora trabalhada: ");
      double ganhoPorHora = scan.nextDouble();

      System.out.print("Quantas horas voce trabalha: ");
      double horaTrabalhada = scan.nextDouble();
 
      double salarioBruto = ganhoPorHora * horaTrabalhada;
      int desconto;

      if(salarioBruto <= 900.00){
         desconto = 0;
      }else if(salarioBruto > 900.00 && salarioBruto <= 1500){
         desconto = 5;
      }else if(salarioBruto <=2500){
         desconto = 10;
      }else{
         desconto = 20;
      }

       double ir = salarioBruto * (desconto / 100.0);
       double pagarInss = (salarioBruto / 100.0) * 10;
       double pagarFgts = (salarioBruto  / 100.0) * 11;
       double totalDesconto = ir + pagarInss;
       double salarioLiquido = salarioBruto - totalDesconto;
      
       
       System.out.println("Seu salario Bruto: R$" + salarioBruto);
       System.out.println("Ir: " + ir);
       System.out.println("inss: " + pagarInss);
       System.out.println("fgts: " + pagarFgts);
       System.out.println("Desconto total: " + totalDesconto);
       System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}