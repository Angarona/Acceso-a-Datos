System.out.println("Escribe el nombre: ");
		nombre = s.next();
		
		System.out.println("Escriba la antiguedad: ");
		antiguedad = s.nextDouble();import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UD2_8 {

	public static void main(String[] args) {
		/*
		UD2.8 Adaptación de los ejemplos vistos en los materiales con las clases ObjectInputStream y
		ObjectOuputStream. Realiza una clase UD2_8 que pida al usuario datos de varios profesores
		(nombre y la antigüedad) y los inserte en el fichero antiguedad.dat_obj.dat. Si el fichero no
		existe se creará con los nuevos datos introducidos, en caso contrario se añadirán por el final.
		Antes de finalizar el código se recorrerá el fichero para visualizar su contenido. Prueba varias
		veces la ejecución de la clase.
		*/
		Scanner s = new Scanner(System.in);
		int cantidad;
		String nombre = "";
		double antiguedad;
		do {
			System.out.println("Escribe la cantidad de profesores que quieres añadir.");
			while(!s.hasNextInt()) {
				System.out.println("Eso no es un numero.");
				s.next();
			}
			cantidad = s.nextInt();
		}
		while (cantidad <= 0);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("src\\Ficheros\\antiguedad.dat_obj.dat"));
		String [] nombres = new String[cantidad] ;
		double [] antiguedades = new double [cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Escribe el nombre: ");
			nombre = s.next();
			
			System.out.println("Escriba la antiguedad: ");
			antiguedad = s.nextDouble();
		}
		
		
		

	}

}
