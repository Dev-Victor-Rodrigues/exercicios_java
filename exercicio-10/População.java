import java.util.Scanner;

public class População {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
 
        boolean valido = false;

        double populacao_A;
        double  populacao_B;
        double taxaA;
        double taxaB;

      do{
          
         System.out.print("Entre com a população A: ");
         populacao_A = scan.nextDouble();

         if(populacao_A > 0){
             valido = true;
          }else{
             System.out.println("População A precisa ser maior que zero");
          }
          
       } while (!valido);

// espaco

         valido = false;
       do{
          
         System.out.print("Entre com a população B:");
         populacao_B = scan.nextDouble();

         if(populacao_B > 0){
             valido =  true;
          }else{
             System.out.println("População B precisa ser maior que zero");
          }
          
       } while (!valido);

//espaco

        valido = false;

       do{
          
         System.out.print("Entre com a Taxa de crescimento da  população :");
         taxaA = scan.nextDouble();

         if(taxaA > 0){
             valido = true;
          }else{
             System.out.println("A taxa de crecimento da População A precisa ser maior que zero");
          }
          
       } while (!valido);

//espaco

      valido = false;

       do{
          
         System.out.print("Entre com a Taxa de crescimento da  população :");
         taxaB = scan.nextDouble();

         if(taxaB > 0){
             valido = true;
          }else{
             System.out.println("A taxa de crecimento da População B precisa ser maior que zero");
          }
          
       } while (!valido);

//espaco
        
      int  contador = 0;
  
       while (populacao_A < populacao_B){
         populacao_A +=(populacao_A / 100) * taxaA;
          populacao_B +=(populacao_B /100) * taxaB;

          contador++;
       
      }
        System.out.println("população A: " + populacao_A);
        System.out.println("população B: " + populacao_B);
        System.out.println("Qtd de anos:  " + contador + " Anos");
    }
}