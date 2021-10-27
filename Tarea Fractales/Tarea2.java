public class Tarea2{
   public int calcularCuadros(int n)
   {
       if (n==1)
       {
           return 4;
        }
        else
        {
            return ((calcularCuadros(n-1))-2)*5+2;
        }
    }
}
