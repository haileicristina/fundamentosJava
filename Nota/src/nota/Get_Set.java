package nota;

public class Get_Set {
    public static void main(String []args){
        //criar personagem
        // dar qtd.vida
        //diminuir a vida se atingido
        Persona personagem = new Persona();
        personagem.setVida(10);
        personagem. setAvatar("Roy");
        personagem.setAtingido(true);
        System.out.println(personagem.getAvatar()+" Vidas: "+ personagem.getVida());
        System.out.println(personagem.getAtingido());
        personagem.Dano();
    }
    
}
