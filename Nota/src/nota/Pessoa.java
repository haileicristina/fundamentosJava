package nota;
import java.util.Scanner;
public class Pessoa {
    public static void main(String[]args){
    //Nome > 3 caracteres
    //Idade entre 0 e 150
    //salário> 0 sexo: "T" ou "m"
    //estado civil: s, c, v, d
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;// atributos
        boolean valido = false;
        Scanner scan = new Scanner(System.in);
        do{//assim executa tudo pra depois chamar os erros
            System.out.println("Digite nome (até 3 caracteres): ");
            nome = scan.next();
            System.out.println("Digite idade: ");
            idade = scan.nextInt();
            System.out.println("Salário: ");
            salario = scan.nextDouble();
            System.out.println("Sexo(T ou M): ");
            sexo = scan.next();
            System.out.println("Estado civil(s, c, v, d): ");
            estadoCivil = scan.next();
           
            if(nome.length() >=3){// se quant caracteres nome for > 3
                valido = true;
                            
            }else{
                System.out.println("Nome inválido. Somente 3 caracteres. Digite novamente");
                nome = scan.next();
            }
            if(idade >0 && idade <=150){
                valido = true;
            }else{
                System.out.println("Idade inválida.Digite novamente(0 a 150)");
                idade = scan.nextInt();
            }
            if(salario > 0){
                valido = true;
            }else{
                System.out.println("Salario inválida.Digite novamente(0 a 150)");
                salario = scan.nextDouble();              
            }
            if(sexo.equalsIgnoreCase("M")|| sexo.equalsIgnoreCase("F")){
                valido = true;
            }else{
                System.out.println("Sexo cadastrado é: "+ sexo);
                
            }
            if(estadoCivil.length()>1){
                valido = true;
            }else{
                switch(estadoCivil){
                    case"s": //s, c, v, d
                    case"c": 
                    case"v": 
                    case"d": break;
                    default: System.out.println("Opção invalida. Digite novamente");
                        estadoCivil = scan.next();
                }
            }
        
        }while(!valido);
    }
    
}
