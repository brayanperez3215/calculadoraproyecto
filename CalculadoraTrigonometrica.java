
package ultracalculadora;

import static java.lang.Math.*;

    public class CalculadoraTrigonometrica {
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