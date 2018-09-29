package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Archivo {
	
	public static LinkedList<Mesada> leerArchivo(String path) throws IOException{
		
		FileReader fr = new FileReader (path);
		Scanner sc = new Scanner(fr);
		
		int size = sc.nextInt();
		
		/*Creamos la lista.*/
		LinkedList<Mesada> ll = new LinkedList<>();
		
		/*Cargamos la lista leyendo del archivo.*/
		for(int i=0; i < size; i++)
			ll.add(new Mesada(sc.nextDouble(),sc.nextDouble()));
		
		sc.close();
		
		return ll;
		
	}
	
	public static void escribirArchivo(int cantPilas, String path) throws IOException{
		PrintWriter pw = new PrintWriter(path);
		pw.println(cantPilas);
		pw.close();
	}
}
