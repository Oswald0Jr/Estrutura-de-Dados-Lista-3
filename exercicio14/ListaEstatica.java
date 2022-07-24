/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio14;

/**
 *
 * @author leona
 */
public abstract class ListaEstatica {
    
    public int prim;
    public int ultimo;
    
    abstract public void insere(Produto p);
    abstract public void limpaLista();
    abstract public String busca(String s);
    abstract public void remove(String r);
    abstract public void imprimeLista();
    
}
