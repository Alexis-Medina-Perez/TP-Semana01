package programas;
//Paquete de datos e/s de datos por connsola
import java.util.Scanner;

//Clase principal
public class Programa03 {
    
    //Metodo principal
    public static void main(String[] args) {
        //Declarar variables
        int vt1, vt2, vt3;
        double sm, pt, c;
        String vendedor;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos tipo TEXTO
        System.out.print("Nombre del vendedor: ");
        vendedor = lectura.next();
        
        //Entrada de datos tipo DECIMAL
        System.out.print("Sueldo mensual: ");
        sm = lectura.nextInt();
        System.out.print("Venta 1: ");
        vt1 = lectura.nextInt();
        System.out.print("Venta 2: ");
        vt2 = lectura.nextInt();
        System.out.print("Venta 3: ");
        vt3 = lectura.nextInt();
        
        //Proceso de datos
        c = (vt1 + vt2 + vt3) * 0.10;
        pt = sm + c;
        
        //Salida de datos
        System.out.println("La comisionn de la venta es:        " + c);
        System.out.println("El sueldo mensual del vendedor es:  " + pt);
    }
}
