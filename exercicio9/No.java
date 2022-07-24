/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio9;

/**
 *
 * @author leona
 */
public class No {
    
    Object obj;
    
    No proximo;
    
    public No(Object o){
        obj = o;
    }

    public Object getObj(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No n){
        proximo = n;
    }
    public No getProximo(){
        return proximo;
    }
    
}
