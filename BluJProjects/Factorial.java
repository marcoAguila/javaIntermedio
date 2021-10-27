
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
    public int factorialN(int numero)
    {
        int res;
        if(numero==0 || numero == 1){
            res = 1;
        }
        else{
            res = numero * factorialN(numero -1);
        }
        return res;
    }
    
    //ejercicio 3
    public int cantidadDigitosPares(int numero){
        int res = 0;
        int aux;
        while (numero>0)
        {
            aux = numero%10;
            if (aux%2 == 0)
            {
                res++;
            }
            numero = numero/10;
        }
        return res;
    }
    
     public int cantidadDigitosParesRecursivo(int numero){
        int res = 0;
        int aux;
        if (numero<10 && numero > 0){
            if(numero%2 == 0){
                res = res +1;        
            }
        }
        else
        {
            aux = numero%10;
            if (aux%2 == 0)
            {
                res++;
            }
            res = res + cantidadDigitosParesRecursivo(numero/10);
        }        
        return res;
    }
        
    //ejercicio 4
    public String esMalvadoUOdiosoNR(int numero){
        int res = 0;
        int aux;
        String a;
        while (numero>0)
        {
            aux = numero%10;
            if (aux%2 == 1)
            {
                res++;
            }
            numero = numero/10;
        }
        if(res % 2 == 0){
            a = "Es MALVADO";
        }
        else{
            a = "Es ODIOSO";
        }
        return a;
    }
    
    
    public String esMalvadoUOdioso(int numero){
        String a = "";
        int cantidadDeDigito1 = contarNumero1EnUnNumero(numero);
        
        if(cantidadDeDigito1 % 2 == 0){
            a = "Es MALVADO";
        }
        else{
            a = "Es ODIOSO";
        }                
        return a;                
    }    
     public int contarNumero1EnUnNumero(int numero){
        int cantidadDeDigito1 = 0;        
        if(numero<2)
        {
            if(numero%2 == 1){
                cantidadDeDigito1 = 1;  
            }            
        }
        else
        {
            if(numero%2 == 1){
                cantidadDeDigito1 = 1 + contarNumero1EnUnNumero(numero/10);
            }            
        }        
        return cantidadDeDigito1;                
    }
    
    
    //ejercicio 5 TAREA 1
     public int multiplicar(int m, int n){
        int res;
        if(n == 1){
            res = m;
        }else{
            res = m + multiplicar(m, n-1);
        }
        return res;
    }
    
    //ejercicio 6 TAREA 1
     public int dividir(int dividendo, int divisor){
        int res;        
        if(dividendo < divisor){
            res = 0;
        }else{
            res = 1 + dividir(dividendo - divisor, divisor);
        }
        return res;
    }
    
    
    
    
}
