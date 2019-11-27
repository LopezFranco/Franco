package cafeteria;

import cafeteria.Bebidas;
import Cafe.cafeExpreso;
import Cafe.cafeNormal;
import Cafe.cafeRistreto;
import Te.Negro;
import Te.Rojo;
import Te.Verde;
import java.util.Scanner;

public class Cafeteria {
    private static int Bebidas;

    public static void main(String[] args) {

        int i;
        int tipoCafe, tipoTe; 
        int azucar = 0, leche = 0;
        double iva = 0.21, total = 0, precio = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a Starbuck");
        System.out.println("¿Cuantas bebidas desean?");

        Bebidas pedido[] = new Bebidas[sc.nextInt()];

        for (i = 0; i < pedido.length; i++) {   
            System.out.println("Que bebida desea? \n1.Cafe \n2.Te");
            Bebidas = sc.nextInt();
            
            if (Bebidas == 1) {
                
                System.out.println("Seleccione el tipo de cafe \n1.Expresso \n2.Ristretto \n3.Normal");
                tipoCafe = sc.nextInt();
                
                System.out.println("Indique cantidad de azucar");
                azucar = sc.nextInt();
                
                System.out.println("Indique cantidad de leche");
                leche = sc.nextInt();
                
                if (tipoCafe == 1) {
                    pedido[i] = new cafeExpreso(azucar, leche) {};

                } else if (tipoCafe == 2) {
                    pedido[i] = new cafeRistreto(azucar, leche) {};

                } else if (tipoCafe == 3) {
                    pedido[i] = new cafeNormal(azucar, leche) {};
                } else {
                    System.out.println("Opcion no valida");
                }
            } 
            else if (Bebidas == 2) {
                
                System.out.println("Seleccione el tipo de te \n1.Verde \n2.Rojo \n3.Negro");
                tipoTe = sc.nextInt();
                
                System.out.println("Indique cantidad de azucar");
                azucar = sc.nextInt();
                
                System.out.println("Indique cantidad de leche");
                leche = sc.nextInt();
                
                
                if (tipoTe == 1) {
                    pedido[i] = new Verde(azucar, leche);

                } else if (tipoTe == 2) {
                    pedido[i] = new Rojo(azucar, leche) {};
                } 
                else if (tipoTe == 3) {
                    pedido[i] = new Negro(azucar, leche) {};
                } 
                /*else {
                    System.out.println("Opcion no valida");
                }*/
            } 
            else {
                System.out.println("Opcion no valida.");
            } 
            
            precio = precio + pedido[i].precio() + (azucar * 5) + (leche * 5);
            total = total + pedido[i].precio() + (azucar * 5) + (leche * 5) * iva;

            System.out.println(pedido[i].descripcion() + " con " + azucar + " de azucar y " + leche + " de leche");
            System.out.println("SubTotal: " + precio);
            System.out.println("Total: " + total);

        }

    }
}



