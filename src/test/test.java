package test;

import java.io.IOException;

public class test {
	
	static String path = "C:\\Users\\richi\\Desktop\\"; //Su directorio.
	static String nomArchEntrada = "entrada.in";
	static String nomArchSalida = "salida.out";
	
	public static void main(String []args) throws IOException{ 
		int cantidadPilas = io.Apiladora.apilar(io.Archivo.leerArchivo(path + nomArchEntrada));
		io.Archivo.escribirArchivo(cantidadPilas, path + nomArchSalida);
		System.out.println("Las pilas necesarias son:" + cantidadPilas);
		
	}
}
