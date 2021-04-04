
package parcial1;

import java.util.Scanner;

public class Parcial1 {
     private int resultado;
    private int num[];
    private int suma,Promedio;
    
    public void Promediar(){
    Scanner leer = new Scanner(System.in);
        num = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introdusca 10 numeros a promediar");
            num [i] = leer.nextInt();
            
        }
        suma = num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9];
        Promedio = suma/10;
        System.out.println(Promedio);
    }
    public static void main(String[] args) {
   Parcial1 eje = new Parcial1();
   eje.Promediar();
    }
    
}
