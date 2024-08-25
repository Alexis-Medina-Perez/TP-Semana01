package programas;
//Paquete de datos e/s de datos por connsola
import java.util.Scanner;

//Clase principal
public class Programa02 {
    
    //Metodo principal
    public static void main(String[] args) {
        //Declarar variables
        String empleado;
        double ht, th, sb, d, sn;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos tipo TEXTO
        System.out.print("Nombre del empleado: ");
        empleado = lectura.next();
        
        //Entrada de datos tipo DECIMAL
        System.out.print("Horas trabajadas: ");
        ht = lectura.nextInt();
        System.out.print("Tarifa por hora: ");
        th = lectura.nextDouble();
        
        //Proceso de datos
        sb = ht * th;
        d = sb * 0.13;
        sn = sb - d;
        
        //Salida de datos
        System.out.println("Sueldo bruto: " + sb);
        System.out.println("Descuento: " + d);
        System.out.println("Sueldo neto: " + sn);
    }
}
