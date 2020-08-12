package nota;
import java.util.Scanner;
public class Intervalo {
    public static void main(String []args){
     /* 
    //solicitar o intervalo inicial
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o intervalo inicial");
        int inicio = scan.nextInt();
        //solicitar o intervalo final
        System.out.println("Digite o intervalo final");
        int fim = scan.nextInt();
        int soma = inicio;
        
        for(int i = inicio; inicio<=fim;inicio++){
            System.out.println("Inicio = "+ inicio);
            System.out.println("Fim = "+ fim);
            soma +=inicio;
            System.out.println("Soma = "+ inicio +"+"+ inicio + " = "+ soma);
        }
        */
           //Soma de todos os algarismos
    
        System.out.println("Informe um número: ");
        int num = new Scanner(System.in).nextInt();
        int soma = 0;
        //123 -> dividirmos por 10, o resultado será 12, e sobra = 3
        //(123 / 10) = 12 -> (123 % 10) = 3
        //(12  / 10) = 1  -> (12  % 10) = 2
        //(1   / 10) = 0  -> (1   % 10) = 1

        while(num>0) {
            // 1) obter o módulo do número digitado
          //int modulo = num % 10;
            // 2) incrementar o módulo a nossa variavel soma
            soma += (num % 10);
            // 3) dividir o número por 10 e atribuirmos a nossa varial 'num'
            num /= 10;//num = num / 10;
            System.out.println("O valor de soma é: "  + soma);
        }
        System.out.println();
        System.out.println("A soma dos algarismos é: "+ soma);
        
                
    
    }
    
    
    
}
