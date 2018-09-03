
package ultracalculadora;


public class CalculadoraAritmetica {
    public double operando1;
    public double operando2;

    public double sumar() {
      double r;
        r = operando1 + operando2;
        return r;
    }

    public double restar() {
        double r;
        r = operando1 - operando2;
        return r;
    }

    public double multiplicar() {
        double r;
        r = operando1 * operando2;
        return r;
    }

    public double dividir() {
        double r;
        
        r= (operando1 *1.0 /operando2);
        return r;
    }

}
