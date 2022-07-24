/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio9;

/**
 *
 * @author leona
 */
public class Main {
    
    public static void main(String[] args) {
        
        ListaEncadeada lista = new ListaEncadeada();
    
        Lista l1 = new Lista(1, 1);
        Lista l2 = new Lista(2, 15);
        lista.insereFim(new No(l1));
        lista.insereFim(new No(l2));
        lista.remove("3");
        Lista l3 = new Lista(3, 4);
        lista.insereFim(new No(l3));
        lista.remove("7");
        lista.imprimeLista();
        Lista l4 = new Lista(4, 10);
        lista.insereFim(new No(l4));
        Lista l5 = new Lista(5, 9);
        lista.insereFim(new No(l5));
        Lista l6 = new Lista(6, 5);
        lista.insereFim(new No(l6));
        Lista l7 = new Lista(7, 7);
        lista.insereFim(new No(l7));
        
    }

}
