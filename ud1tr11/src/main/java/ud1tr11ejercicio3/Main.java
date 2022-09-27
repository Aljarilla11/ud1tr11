package ud1tr11ejercicio3;

import java.io.File;



public class Main {

	public static void main(String[] args) {
		  File miCarpeta = new File("C:\\Users\\alex\\eclipse-workspace\\ud1tr11");
		   
		   File[] misElementos = miCarpeta.listFiles();
		   
		   for (File elemento : miCarpeta.listFiles()) {
			   System.out.println(elemento);
		   }


	}

}