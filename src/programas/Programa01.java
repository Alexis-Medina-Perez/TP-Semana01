package programas;
import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //Declarar variables
        String empleado;
        double ingreso, gasto, ahorroM, ahorroA;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos tipo TEXTO
        System.out.print("Nombre del empleado: ");
        empleado = lectura.next();
        
        //Entrada de datos tipo DECIMAL
        System.out.print("Ingresos del empleado: ");
        ingreso = lectura.nextDouble();
        System.out.print("Gastos del empleado: ");
        gasto = lectura.nextDouble();
        
        //Proceso de datos
        ahorroM = ingreso - gasto;
        ahorroA = ahorroM * 12;
        
        //Salida de datos
        System.out.println("Ahorro mensual: " + ahorroM);
        System.out.println("Ahorro anual: " + ahorroA);
    }
}
