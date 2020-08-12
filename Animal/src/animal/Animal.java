package animal;
public abstract class Animal {
    /*classes abstratas não poem ser instanciadas 
    por si mesma somente via classes filhas*/
    private String nome;
    private String som;
    
    // métodos get e set
    
    public String getNome(){
        return nome;
    }
    public void setNome(String name){
        //this.atributo = parâmetro
        this.nome = name;
    }
    
    public String getSom(){
        return som;
    }
    public void setSom(String murta){
        this.som = murta;
    }
    
    
}
