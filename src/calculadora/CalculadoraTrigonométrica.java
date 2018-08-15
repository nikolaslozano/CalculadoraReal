/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public class CalculadoraTrigonométrica {
    double ángulo;
    
    double senar(){
        double r;
        r=Math.sin(ángulo);
        return r;
    }
    double cosenar(){
        double r;
        r=Math.cos(ángulo);
        return r;
    }
    double tangentar(){
        double r;
        r=Math.tan(ángulo);
        return r;
    }
    double cotangentar(){
        double r;
        r=1/Math.tan(ángulo);
        return r;
    }
    double secantar(){
        double r;
        r=1/Math.cos(ángulo);
        return r;
    }
    double cosecantar(){
        double r;
        r=1/Math.sin(ángulo);
        return r;
    }
    
    
}
