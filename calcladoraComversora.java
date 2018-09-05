/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltraCalculadora;

/**
 *
 * @author bspg3
 */
public class calcladoraComversora {
    
public double valor;

public double MtoCm() {
double unidad;
unidad = valor * 100;
return unidad;
}

public double MtoKm() {
double unidad;
unidad = valor / 1000;
return unidad;
}

public double Metoft() {
double unidad;
unidad = valor * 3.280839895;
return unidad;
}

public double MtoIn() {
double unidad;
unidad = valor * 39.3700787402;
return unidad;
}

public double MetoYd() {
double unidad;
unidad = valor * 1.093612983;
return unidad;
}

public double CmtoM() {
double unidad;
unidad = valor / 100;
return unidad;
}

public double CmtoKm() {
double unidad;
unidad = valor * 0.0001;
return unidad;
}

public double CmtoIn() {
double unidad;
unidad = valor * 0.39370078;
return unidad;
}

public double CmtoFt() {
double unidad;
unidad = valor * 0.0328084;
return unidad;
}

public double CmtoYd() {
double unidad;
unidad = valor * 0.0109361;
return unidad;
}

public double KmtoCm() {
double unidad;
unidad = valor * 100000;
return unidad;

}

public double KmtoM() {
double unidad;
unidad = valor * 1000;
return unidad;
}

public double KmtoIn() {
double unidad;
unidad = valor * 39370.078;
return unidad;
}

public double Kmtoft() {
double unidad;
unidad = valor * 3280.841666667;
return unidad;
}

public double KmtoYd() {
double unidad;
unidad = valor * 1093.61;
return unidad;
}
//volumen

public double KgtoG() {
double unidad;

unidad = valor * 1000;
return unidad;
}

public double KgtoLb() {
double unidad;
unidad = valor * 2.20462;
return unidad;
}

public double KgtoT() {
double unidad;
unidad = valor * 0.001;
return unidad;
}

public double GtoKg() {
double unidad;
unidad = valor / 1000;
return unidad;
}

public double GtoLb() {
double unidad;
unidad = valor * 0.00220462;
return unidad;
}

public double Gtot() {

double unidad;
unidad = valor * 0.000001;
return unidad;
}

public double TtoKg() {
double unidad;
unidad = valor * 1000;
return unidad;
}

public double TtoG() {
double unidad;
unidad = valor * 1000000;
return unidad;
}

public double Ttolb() {
double unidad;
unidad = valor * 2204.62;
return unidad;
}

//Temperatura
public double CtoF() {
double unidad;
unidad = (valor * 1.8) + 32;
return unidad;
}

public double CtoK() {
double unidad;
unidad = valor + 273.15;
return unidad;
}

public double KtoC() {
double unidad;
unidad = valor - 273.15;
return unidad;
}

public double KtoF() {
double unidad;
unidad = (valor * 1.8) - 459.67;
return unidad;
}

public double FtoK() {
double unidad;
unidad = (valor * 0.551) + 255.377;
return unidad;
}

public double FtoC() {
double unidad;
unidad = (valor * 0.5556) - 17.7778;
return unidad;

}


}
