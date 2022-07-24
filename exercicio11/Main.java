/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio11;

/**
 *
 * @author leona
 */
public class Main {
    
    /*
        Transforme cada uma das extensões pós-fixas em pré-fixas e desenhe a pilha
        passo a passo, conforme há a inclusão de um operador, como no exemplo:
    
    */
    
    //a) AB+C-
    /*
    R:
        +         -
        B         C
        A       A + B   (A + B)-C
    */
    
    //b) AB-C+DEF-+/
    /*
    R:
                            /
                            F
                            +                 /
                            -                 F
        -         +         E                 +                     /
        B         C         D               D - E                   F
        A       A - B   (A - B)+ C      (A - B) + C     (((A - B) + C) + (D - E))        (((A - B) + C) + (D - E))/ F     
    */
    
    //c) AB*C/DE/+
    /*
    R:
                            
                            
                            +                 
                            /                 
        *         /         E                 +                     
        B         C         D               D / E                   
        A       A * B   (A * B)/ C      (A * B) / C     (((A * B) / C) + (D / E))  + F      
    */
    
    //d) AB/CD*+
    /*
    R:
                            
                            
                  +                          
                  *                          
        /         D                                               
        B         C                                          
        A       A / B   (A / B)+(C * D)      
    */
    
}
