/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltraCalculadora;

import static java.lang.Math.*;

public class calculadoraTrigonometrica {
    
    public double ang;

public void convertir(double angulo1) {
ang = Math.toRadians(angulo1);
}

public double seno() {
return sin(ang);

}

public double coseno() {

return cos(ang);

}

public double tangente() {
return tan(ang);
}


    
}
