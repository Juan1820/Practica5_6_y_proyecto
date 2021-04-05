
package parcial1;

import java.util.Arrays;
import java.util.Scanner;


public class Practica6 {
    private double num[];
    private double resultado;
    private int posicion;
    private int pocision=-1;
    
    
   public void IngresarNumeros(){
       Scanner ver= new Scanner(System.in);
       num = new double[10];
      
       for(int i =0; i<10; i++){
           System.out.println("ingrese los 10 numeros");
           num [i] = ver.nextInt();
       }
       System.out.print(Arrays.toString(num));
       
   }
     public void buscador(){
         Scanner ver= new Scanner(System.in);
          System.out.print("que dato desea buscar en el arreglo");
            int buscar = ver.nextInt();
         for (int inicio = 0; inicio < 10; inicio++) {
             
             if(buscar==num[inicio]){
             pocision = inicio;
             }
         }
         if(pocision>=0){
             System.out.println("El indice de valor "+ buscar + " es "+ pocision);
         }
         else{
             System.out.println(pocision);
         }
   }
    
    public static void main(String[] args) {
        Practica6 eje = new Practica6();
        eje.IngresarNumeros();
        eje.buscador();
    }
}
            
