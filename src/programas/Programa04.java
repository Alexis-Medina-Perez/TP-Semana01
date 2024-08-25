package programas;
//Paquete de datos e/s de datos por connsola
import java.util.Scanner;

//Clase principal
public class Programa04 {
    
    //Metodo principal
    public static void main(String[] args) {
        //Declarar variables
        int cantidad;
        double precio, subtotal, totalP, igv;
        String cliente, producto;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos tipo TEXTO
        System.out.print("Nombre del cliente: ");
        cliente = lectura.next();
        System.out.print("Producto: ");
        producto = lectura.next();
        
        //Entrada de datos tipo DECIMAL
        System.out.print("Precio sin IGV: ");
        precio = lectura.nextDouble();
        System.out.print("Cantidad: ");
        cantidad = lectura.nextInt();
        
        //Proceso de datos
        subtotal = precio * cantidad;
        igv = subtotal * 0.18;
        totalP = subtotal + igv;
        
        //Salida de datos
        System.out.println("El subtotal es:         " + subtotal);
        System.out.println("El IGV es:              " + igv);
        System.out.println("El total a pagar es:    " + totalP);
    }
}
