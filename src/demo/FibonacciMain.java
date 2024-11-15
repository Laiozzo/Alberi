package demo;

public class FibonacciMain {

//    Serie di fibonacci: 0,1,1,2,3,5,8,13,21,34

    static public void main(String[] args)
    {
        System.out.println(fibonacciRicorsivo(3));
    }

    static int fibonacci(int indice)
    {
        if(indice <= 1)
            return indice;

        int a   = 0;
        int b   = 1;
        int res = 0;

        for(int i=2; i<=indice; i++)
        {
            res = a+b;
            a   = b;
            b   = res;
        }

        return res;
    }

    static int fibonacciRicorsivo(int indice)
    {
//        System.out.println("ciao ho indice: " + indice);


        if(indice <= 1)
            return indice; // caso base

        return fibonacciRicorsivo(indice-1) + fibonacciRicorsivo(indice-2);
    }
}
