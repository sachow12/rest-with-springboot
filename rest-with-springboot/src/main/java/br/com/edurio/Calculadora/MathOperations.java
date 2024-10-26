package br.com.edurio.Calculadora;

public class MathOperations {
    public Double sum(Double numberOne, Double numberTwo)  {

        return numberOne + numberTwo;
    }

       public Double sub(Double numberOne, Double numberTwo)   {

        return numberOne - numberTwo;
    }
    public Double mult(Double numberOne, Double numberTwo)  {
        return numberOne * numberTwo;
    }
    public Double div(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double avg(Double numberOne, Double numberTwo) {

        return ((numberOne) + (numberTwo) / 2);
    }

    public Double sqrt(Double number){

        return Math.sqrt((number));


    }
}
