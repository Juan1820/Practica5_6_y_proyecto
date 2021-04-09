
package parcial1;

import java.util.Scanner;


public class Proyecto {
    private int CodigoCliente[];
    private String Nombre[];
    private String ApellidoPaterno[];
    private String ApellidoMaterno[]; 
    private String Telefono[];
    private String Direccion[];
    private int Edad[];
    private int cartera,resp;
    private int n=0;
    
    
    public void TamañoCartera(){
    Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a tiendas Loxxo ");
        System.out.println("De que tamaño sera la cartera");
        cartera = leer.nextInt();
        System.out.println("La cartera sera de "+ cartera);
        CodigoCliente = new int[cartera];
        Nombre = new String[cartera];
        ApellidoPaterno = new String[cartera];
        ApellidoMaterno = new String[cartera];
        Telefono = new String[cartera];
        Direccion = new String[cartera];
        Edad = new int[cartera];
    }
    
    public void Menu(){
         Scanner leer = new Scanner(System.in);
        do {      
            try {
                System.out.println("----Menu----");
                System.out.println("Agregar clientes__1 ");
                System.out.println("Mostrar cientes__2 ");
                System.out.println("Buscar clientes__3 ");
                System.out.println("Salir__ 4 ");
                System.out.println("Cual sera su movimiento ");
                resp = Integer.parseInt(leer.nextLine());
                
                switch(resp){
                    case 1:             
                        do{
                           
                        if(n<= cartera){
                            System.out.println("el espacio en la cartera es de "+ (cartera-n));
                            System.out.println("Ingrese el codigo a registrar");
                            CodigoCliente[n] = leer.nextInt();
                            System.out.println("Ingrese el Nombre a registrar");
                            Nombre[n] = leer.next();
                            System.out.println("Ingrese el apellido Paterno");
                            ApellidoPaterno[n]=leer.next();
                            System.out.println("Ingrese el apellido Materno");
                            ApellidoMaterno[n]= leer.next();
                            System.out.println("Ingrese el Telefono ");
                            Telefono[n]= leer.next();
                            System.out.println("Ingrese la Direccion ");
                            Direccion[n]= leer.next();
                            System.out.println("Ingrese la Edad");
                            Edad[n]=leer.nextInt();
                             
                        
                        
                        n++;
                       
                        }
                        
                        }while(n==cartera);
                        
                        break;
                    case 2:
                          for (int j = 0; j < cartera; j++) {
                        System.out.println("Codigo del cliente es "+CodigoCliente[j]);
                        System.out.println("El Nombre es "+Nombre[j]);
                        System.out.println("El apellido paterno es "+ApellidoPaterno[j]);
                        System.out.println("El apellido materno es "+ApellidoMaterno[j]);
                        System.out.println("Su telefono es "+Telefono[j]);
                        System.out.println("Su direccion es "+Direccion[j]);
                        System.out.println("Su edad es "+Edad[j]);
                        
                          }
                        break;
                    case 3:
                        do {
                            try {
                                System.out.println("Buscar por codigo__1 ");
                                System.out.println("Buscar por nombre__ 2 ");
                                System.out.println("Volver al menu anterior__3 ");
                                 resp = Integer.parseInt(leer.nextLine());
                                switch(resp){
                                
                                    case 1:
                                        System.out.println("Ingrese el codigo a buscar");
                                        int Buscador = leer.nextInt();
                                       for(int inicio =0; inicio<cartera;inicio++){
                                           if(Buscador==CodigoCliente[inicio]){
                                            System.out.println("Codigo del cliente es "+CodigoCliente[inicio]);
                                            System.out.println("El Nombre es "+Nombre[inicio]);
                                            System.out.println("El apellido paterno es "+ApellidoPaterno[inicio]);
                                            System.out.println("El apellido materno es "+ApellidoMaterno[inicio]);
                                            System.out.println("Su telefono es "+Telefono[inicio]);
                                            System.out.println("Su direccion es "+Direccion[inicio]);
                                            System.out.println("Su edad es "+Edad[inicio]);
                                           }
                                           if(Buscador!=CodigoCliente[inicio]){
                                               System.out.println("El codigo no existe");
                                           }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el Nombre a buscar");
                                        String BuscadorNombre = leer.next();
                                        for(int i =0; i<cartera;i++){
                                            if(Nombre[i]==BuscadorNombre){
                                                
                                                System.out.println("El Nombre es "+Nombre[i]);
                                                System.out.println("Codigo del cliente es "+CodigoCliente[i]);
                                                System.out.println("El apellido paterno es "+ApellidoPaterno[i]);
                                                System.out.println("El apellido materno es "+ApellidoMaterno[i]);
                                                System.out.println("Su telefono es "+Telefono[i]);
                                                System.out.println("Su direccion es "+Direccion[i]);
                                                System.out.println("Su edad es "+Edad[i]);
                                            } else {
                                            }
                                        
                                        }
                                        break;
                                    case 3: 
                                        System.out.println("volviste al menu principal");
                                        break;
                                }
                            } 
                            catch (Exception e) {
                                
                            }
                            
                        } while (resp>3);
                        break;
                    case 4:
                         System.out.println("terminar proceso ");
                        break;
                       
                           
                }
            } 
            catch (Exception e) {
                System.out.println("Captura no valida");
            }
            
        } while (resp!=4);
    
    }
    public static void main(String[] args) {
        Proyecto eje = new Proyecto();
        eje.TamañoCartera();
        eje.Menu();
    }
}
