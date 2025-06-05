package es.vedruna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    //SUMAR

    @Test
    public void sumar(){
        System.out.println("sumar");
        double number1= 5.0;
        double number2= 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.sumar(number1,number2);
        Assertions.assertEquals(expResult,result);

    }



    //RESTAR



    @Test
    public void restar(){
        System.out.println("restar");
        double number1= 5.0;
        double number2= 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.restar(number1,number2);
        Assertions.assertEquals(expResult,result);

    }


    //MULTIPLICAR


    @Test
    public void multiplicar(){
        System.out.println("multiplicar");
        double number1= 9.0;
        double number2= 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 18.0;
        double result = instance.multiplicar(number1,number2);
        Assertions.assertEquals(expResult,result);

    }


    //DIVIDIR


    @Test
    public void dividir(){
        System.out.println("dividir");
        double number1= 10.0;
        double number2= 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.dividir(number1,number2);
        Assertions.assertEquals(expResult,result);

    }


}