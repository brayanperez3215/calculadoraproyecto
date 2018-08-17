/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraproyecto;

/**
 *
 * @author Estudiantes
 */
public class CalculadoraAritmetica {
        int operador1;
        int operador2;
        
        int sumar(){
            int r;
            r=operador1+operador2;
            return r;
        }
        int restar(){
            int r;
            r=operador1-operador2;
            return r;
        }
        int multiplicar(){
            int r;
            r=operador1*operador2;
            return r;
        }
        int dividir(){
            int r;
            r=operador1/operador2;
            return r;
        }
}
