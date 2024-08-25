package programas;
//Paquete de datos e/s de datos por connsola
import java.util.Scanner;

//Clase principal
public class Programa06 {
    
    //Metodo principal
    public static void main(String[] args) {
        //Declarar variables
        String empleado, cargo;
        double ingresoM, gastoM, ahorroM, ahorroB, ahorroS, ahorroA;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
                
        //Entrada de datos tipo DECIMAL
        System.out.print("Ingrese el nombre del empleado: ");
        empleado = lectura.next();
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = lectura.next();
        System.out.print("Ingreso mensual del empleado: ");
        ingresoM = lectura.nextDouble();
        System.out.print("Gasto mensual del empleado: ");
        gastoM = lectura.nextDouble();
        
        //Proceso de datos
        ahorroM = ingresoM - gastoM;
        ahorroB = ahorroM * 2;
        ahorroS = ahorroM * 6;
        ahorroA = ahorroM * 12;
        
        //Salida de datos
        System.out.println("El ahorro mensual es:   " + ahorroM);
        System.out.println("El ahorro bimestral es: " + ahorroB);
        System.out.println("El ahorro semestral es: " + ahorroS);
        System.out.println("El ahorro anual es:     " + ahorroA);
    }
}