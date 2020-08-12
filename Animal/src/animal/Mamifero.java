package animal;
public abstract class Mamifero extends Animal{
    private String mama;
    public String setAmamentar(){
        return mama;
    }
    public void setAmamentar(String alimento){
        this.mama = alimento;
    }
    
    
}
