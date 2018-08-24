/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraproyecto;


import static java.lang.Math.*;

public class Trigonometrica extends Calculadora {
    
    


    void cambiar(){
    operando1=(float)Math.toRadians(operando1);
            
            }    
            
    void seno(){
         cambiar();
        resultado=(float)Math.sin(operando1);
      
        
    }
    
     void coseno(){
          cambiar();
        resultado=(float)Math.cos(operando1);
        
    }
     void tangente(){
         cambiar();
         resultado=(float)Math.tan(operando1);
         
     }
 
}
