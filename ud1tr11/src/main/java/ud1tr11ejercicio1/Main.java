package ud1tr11ejercicio1;

import java.io.File;



public class Main {

	public static void main(String[] args) {
		  File miCarpeta = new File("C:\\Windows");
		   
		   File[] misElementos = miCarpeta.listFiles();
		   
		   for (File elemento : miCarpeta.listFiles()) {
			   System.out.println(elemento);
		   }


	}

}

