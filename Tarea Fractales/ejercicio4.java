
public class ejercicio4
{

    public int cantidadTrianguloSierpinski(int n)
    {
        if (n == 1)
        {
            return 1;
        }else
        {
            return (cantidadTrianguloSierpinski(n-1)*3)+2;
        }
        
        
    }
 
 
}
