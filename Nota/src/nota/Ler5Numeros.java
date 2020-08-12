package nota;
import java.util.Scanner;
public class Ler5Numeros {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        //boolean valido = false;
        int ler;
        int count = 0;
        
        int soma=0; int media;
        
        while(count<5){
            System.out.println("Necessário dgitar um valor: ");
            ler = scan.nextInt();
            count++;
           
            soma+=ler;
            
        }
        media = soma/5;
        System.out.println("Soma = "+ soma);
        System.out.println("Media: "+ media);
        /*int maior = Integer.MIN_VALUE;
        while(count<5){
            System.out.println("Necessário dgitar um valor: ");
            ler = scan.nextInt();
            count++;
            if(ler> maior){
                maior = ler;
            }
        }
        System.out.println("Maior valor = "+ maior);*/
        
        
       /* for(int i = 0; i<5; i++){
            System.out.println("Necessário dgitar um valor: ");
            ler = scan.nextInt();
            
            if(ler >maior){
                maior = ler;
            }
        }
            System.out.println("Maior valor = "+ maior);*/
        
        
        
        
        
    }
    
}
