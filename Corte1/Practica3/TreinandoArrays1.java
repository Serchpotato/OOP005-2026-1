package treinandoarrays1;
import java.util.Scanner;

public class TreinandoArrays1 {

    public int [] data ;
    public int n ;
    public Scanner Scanner;

// Constructor : crea vector de t a m a o n
    public TreinandoArrays1( int n ) {
       this . n = n ;
       this . data = new int[n];
    }
    
    public void print( String name ) {
    System.out.print(name + " = [ " ) ;
       for (int i = 0; i < n ; i ++) {
           System . out . print ( data [ i ]) ;
           if(i < n - 1) System . out . print ( " , " ) ;
       }
       System.out.println(" ] ") ;
       
       
}    public void IngresarDatos(){
       System.out.println("Ingrese " + data.length + " números:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            // 2. Usar scanner.nextInt() para guardar en el arreglo
            data[i] = Scanner.nextInt(); 
        }
        System.out.println("Arreglo cargado");
    }
        
    public static void main(String[] args) {
        TreinandoArrays1 ob1 = new TreinandoArrays1(8);
        obj.IngresarDatos();
        ob1.print("Hola");
        System.out.println(ob1.data[0]);
        System.out.println(ob1.data[1]);
        System.out.println(ob1.data[2]);
        System.out.println(ob1.data[3]);
    }
}