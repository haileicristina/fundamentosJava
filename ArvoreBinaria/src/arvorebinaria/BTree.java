package arvorebinaria;

/**
 Árvore binária
 * Inserir sequencia de dados:
 * 50,35,30,45,48,55,60,65
 * Nó Cod. direita e Nó Esquerda
 * Exemplo: raiz -> 50 -> dir -> esq
 * 35 maior ou menor que 50?
 * 35 inserido a esq
 * 45 a direita
 * 55 maior a direita
 * 60 maior que 50 vai a direita
 * 65 maior que 50 vai a direita
 * folhas = 30,48, 65
 */
public class BTree {
    public No raiz;
   // Construtor
    public BTree(){
        raiz = null; //arvore vazia
    }
    //Metodo
    public void inserir(int valor){
        //1) Instanciar o Nó
        No temp = new No();
        temp.cod = valor;
        temp.esq = null;
        temp.dir = null;
        //2) Arvore vazia? Se sim, raiz aponta Nó e Sair
        if(raiz == null){
            raiz = temp;
            System.out.println("Ineriu raiz"+ valor);
            return; // sair
        }
        //3) Caso não estej vazia Inserir Nó
        No t = raiz; //aponta para a raiz
        while(true){
            //1) Nó já existe? se sim sair!!!
            if(valor == t.cod){
                System.out.println("valor: "+ valor+ "existe");
                return; //Sair
            }
            //2) Verificar se valor é menor ou maior
            if(valor< t.cod){
                // lado esquerdo
                if(t.esq == null){
                    t.esq = temp; // conectou Esquerda!!
                    System.out.println("Esq"+ valor);
                    return; // sair
                }
                t = t.esq; // t anda para lado esquerdo
            }else{
                //lado direito
                if(t. dir == null){
                    t.dir = temp; // conectou Direita!
                    System.out.println("Dir"+ valor);
                    return; // sair
                }
                t= t.dir; // anda lado direito
                
            }
        }
    }
    
    
    
}
