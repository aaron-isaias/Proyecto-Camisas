
package com.mycompany.tienda;

import java.util.Scanner;

public class Tienda {
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Bienvenido a la tienda de camisas, Cuantas camisas deseas comprar?");
            System.out.println("1, camisa manga corta");
            int n1 = sn.nextInt();
            System.out.println("2, camisa casual manga larga");
            int n2 = sn.nextInt();
            System.out.println("3, camisa formal manga larga");
            int n3 = sn.nextInt();          
            
            Camisas cm = new Camisas();
            int suma = cm.camisaCas(n2) + cm.camisaCort(n1) + cm.camisaFor(n3);
            if(n1 <= 0 || n2 <= 0 || n3 <= 0) {
              System.out.println("El sistema no puede aceptar 0 compras ó numeros negativos, por favor vuelva a intentarlo");
            }
            else {
            System.out.println("El total de Camisas cortas es: $" +cm.camisaCort(n1));
            System.out.println("El total de Camisas Casuales de mangar larga es: $" + cm.camisaCas(n2));
            System.out.println("El total de Camisas Formales de mangar larga es: $" + cm.camisaFor(n3)); 
            System.out.println("El total de Camisas  es: " + cm.SumCam(n1, n2, n3));
            System.out.println("El total de la suma de las playeras es: $" + suma);
            if(cm.SumCam(n1, n2, n3) <= 2){
               System.out.println("El precio final no tiene descuento, por lo que el monto total es: $" + suma); 
            }
            if(cm.SumCam(n1, n2, n3) >= 3 && cm.SumCam(n1, n2, n3) <= 5) {
              System.out.println("El precio final tiene descuento del 5%, por lo que el monto total es: $" + (suma-(suma*0.05)));  
            }
            if(cm.SumCam(n1, n2, n3) >= 6) {
              System.out.println("El precio final tiene descuento del 8%, por lo que el monto total es: $" + (suma-(suma*0.08)));  
            }
        }
    }
}
