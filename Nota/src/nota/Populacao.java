package nota;
import java.util.Scanner;
public class Populacao {
    public static void main(String []args){
        //popA = 8000 taxacresc = 3%
        //popB = 200000 taxa cresc = 1.5%
        //anos popA >= popB? mantida taxa de crescimento
        Scanner scan = new Scanner(System.in);
        int popA = 8000;
        int popB = 200000;    
       
       /*int anos = 0;
      System.out.println("Digite Quantidade de anos: ");
      anos = scan.nextInt();
      
     
          
        
          while(popA < popB){
              popA += (popA / 100) *3;
              popB += (popB/100) * 1.5;
              anos++;          
          }
          System.out.println("Quantidade anos: "+ anos);
          System.out.println("Taxa de Crescimento A "+ popA * anos);
          System.out.println("Taxa de Crescimento B "+ popB * anos);*/
        
       System.out.println("Digite Quantidade de anos: "); // lendo do teclado
      int anos = scan.nextInt();
       for(int ler= anos; ler<=anos; ler++){
           //popA = popA+(popA/100)*3;
           popA+=(popA/100)*3;
           popB+=(popB/100)*1.5;
           
           
           
           if(popA< popB){
               anos++;
               
           }
           else{
               System.out.println("PopA= "+popA*ler);
               System.out.println("PopB = " +popB*ler);
               System.out.println("Qtd. Anos: "+ anos);
           }
           
       }
       
        
            
          
           
       
              
              
              
          
          
      
   
     
        
        
    }
    
}
