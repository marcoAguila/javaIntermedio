public class Main{
    public static void main(String args[]){
        ArbolBin<Integer> arbol = new ArbolBin<>();
        int dato = 1;
        for(int cont=1; cont<=8; cont++){
            arbol.addAmplitud(dato);
            dato++;
        }
        int res = arbol.contarNodosConUnSoloHijo();
        System.out.print(res);
    }
}