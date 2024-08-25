package programas;
//Paquete de datos e/s de datos por connsola
import java.util.Scanner;

//Clase principal
public class Programa05 {
    
    //Metodo principal
    public static void main(String[] args) {
        //Declarar variables
        double s1, s2, s3, s4, s5, totalS, sueldoP;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
                
        //Entrada de datos tipo DECIMAL
        System.out.print("Ingrese el sueldo Nro. 1: ");
        s1 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo Nro. 2: ");
        s2 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo Nro. 3: ");
        s3 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo Nro. 4: ");
        s4 = lectura.nextDouble();
        System.out.print("Ingrese el sueldo Nro. 5: ");
        s5 = lectura.nextDouble();
        
        //Proceso de datos
        totalS = s1 + s2 + s3 + s4 + s5;
        sueldoP = totalS / 5;
        
        //Salida de datos
        System.out.println("El total de sueldo es:      " + totalS);
        System.out.println("El promedio de sueldo es:   " + sueldoP);
    }
}