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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraAritmética miCalculadora;
        miCalculadora=new CalculadoraAritmética();
        CalculadoraTrigonométrica miCalculadora2=new CalculadoraTrigonométrica ();
        
        System.out.println("Seleccione operación:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Residuar\n6.Seno\n7.Coseno\n8.Tangente\n9.Cotangente\n10.Secante\n11.Cosecante");
        int opción=7;
        switch (opción){
            case 1:{
                miCalculadora.operando1=3;
                miCalculadora.operando2=4;
                System.out.println(miCalculadora.sumar());
            }break;
            case 2:{
                miCalculadora.operando1=3;
                miCalculadora.operando2=4;
                System.out.println(miCalculadora.restar());
            }break;
            case 3:{
                miCalculadora.operando1=3;
                miCalculadora.operando2=4;
                System.out.println(miCalculadora.multiplicar());
            }break;
            case 4:{
                miCalculadora.operando1=3;
                miCalculadora.operando2=4;
                System.out.println(miCalculadora.dividir());
            }break;
            case 5:{
                miCalculadora.operando1=3;
                miCalculadora.operando2=4;
                System.out.println(miCalculadora.residuar());
            }break;
            case 6:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.senar());
            }break;
            case 7:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.cosenar());
            }break;
            case 8:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.tangentar());
            }break;
            case 9:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.cotangentar());
            }break;
            case 10:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.secantar());
            }break;
            case 11:{
                miCalculadora2.ángulo=45;
                System.out.println(miCalculadora2.cosecantar());
            }
            default:{
                System.out.println("Error");
            }
        } 
        }
    }
   