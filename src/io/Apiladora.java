package io;

import java.util.LinkedList;

public class Apiladora{
		
	public static int apilar(LinkedList<Mesada> lista){
		
		int cantPilas = 1;
		/* Ordeno la lista segun el compareTo de Mesada (por largo).*/
		lista.sort(null); 
		
		for(int i=0; i < lista.size(); i++){
			
			/*Pongo al ultimo de la lista como pivote.*/
			Mesada pivote = new Mesada (lista.getLast());
			
			/*Recorro la lista desde el anteultimo hasta el primero inclusive.*/
			for(int j=lista.size()-2; j>=0 ; j--){ 
				
				/*Si el nodo j de la lista se puede apilar, cambio pivote y remuevo dicho nodo.*/
				if(pivote.puedeApilarse(lista.get(j))){ 
					pivote = lista.get(j);
					lista.remove(j);
				}
			}
			
			/*Remuevo el ultimo nodo (pivote inicial).*/
			lista.removeLast();
			
			/*Si quedo algun nodo en la lista, aumento la cantidad de pilas necesarias.*/
			if(lista.size()!=0)
				cantPilas++;
		}
		
		 /*Retorno pilas necesarias.*/
		return cantPilas;
	}
	
}
