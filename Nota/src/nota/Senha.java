package nota;
import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        String usuario;
        String senha;
        boolean valido = false;
       
        Scanner scan = new Scanner(System.in);
                
        //ler nome de usuário e senha
        do{
            System.out.println("Login: ");
            usuario = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
            if(usuario.equalsIgnoreCase(senha)){
                System.out.println("Senha igual usuário. Digite novamente: ");
            }else{
                valido = true;// negação de true é false(sai loop)
                System.out.println("Senha e usuário válido");
            }
        }while(!valido);// negação de falso é true
        
        //validacao: não aceite a senha = usuario
        
        //se senha = usuario{ mostrar msg erro e pedir info
        
    }
    
}
