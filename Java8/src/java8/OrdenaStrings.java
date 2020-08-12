package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import jdk.nashorn.internal.objects.NativeArray;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa com código");
        palavras.add("caelum");
        Comparator<String> comparador = new ComparadorPorTamanho();
        //para ordenar utiliza classe auxiliar do java util
        // comparador ordenará pela classe ComparadorPorTamanho
       // Collections.sort(palavras, comparador);
        //atualização do java 8
        palavras.sort(comparador); // sort da interface List
        System.out.println(palavras);
        
        Collections.sort(palavras);// sort ordenada de A a Z       
        System.out.println(palavras);
        
        
        // Quando deseja imprimir uma grande lista
       /* for(String p: palavras){
            System.out.println(p);//mostra por linha
        }*/
        
        // outro jeito de imprimir uma grande lista
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
       
    }
    
}
//implementa a interface Consumer
class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
//classe irá ordenar por tamanho de string
class ComparadorPorTamanho implements Comparator <String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.length()< s2.length()){
            return -1;
        }
        if(s1.length()> s2.length()){
            return 1;
        }
        
        return 0;
    }
}
