package nota;
import java.util.Scanner;
public class MeioFor {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com qtd número da lista: ");
        int lista = scan.nextInt();
        int tamLista[]  = new int[lista];
               
        int count =0;
        int numeros;
        // quantos numeros quer entrar
        
    // inserir números
       /* while(count< lista){
            System.out.println("Entre com número: ");
            numeros = scan.nextInt();
            count++;
            System.out.println("Números da lista: "+ numeros);
            
        }
        System.out.println("Lista = "+ lista);*/
        
        for(int i = 0; i<tamLista.length; i++){
            System.out.println("Entre com o"+(i+1) +" º número: ");
            tamLista[i] = scan.nextInt();
            
        }
        for(int i = 0; i<tamLista.length; i++){
            int numero = tamLista[i];
            System.out.println("Posição "+ (i+1) + " número: "+numero +" ");
            
           
            
            
                    
        }
        
        
        
            
            
        
    }
}

