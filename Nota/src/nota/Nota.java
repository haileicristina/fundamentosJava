package nota;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        double nota;
        boolean validacao = false;
        // Solicitar nota entre 0 e 10
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Insira uma nota de 0 a 10: ");
            nota = scan.nextDouble();
            
        
            
        
            if(nota>=0 && nota<=10){
                validacao = true;
                System.out.println("Valor digitado:"+ nota);
                
            }else{
                System.out.println("Valor inválido. Digite um valor válido: ");
                System.out.println("Valor digitado:"+ nota);
            }
        }while(!validacao);
    }
}
    
        
        