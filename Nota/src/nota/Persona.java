
package nota;

public class Persona {
    // atributos
    private String avatar;
    private int vida;
    private boolean atingido;
    
    //Métodos Get e Set
    public String getAvatar(){
        return avatar;
    }
    public void setAvatar(String avatar){
        //this.atributo = parâmetro;
        this.avatar = avatar;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public boolean getAtingido(){
        return atingido;
    }
    public void setAtingido(boolean atingido){
        this.atingido = atingido;
    }
    public void Dano(){
        int valor = 0;
        while(atingido){
            if(vida>valor){
                vida --;
            System.out.println("Você foi atingido!!! "+
                " Restam "+ vida+" vidas");
            }
            
        }
       
            
            
        
        
    }
    
}
