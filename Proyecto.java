/**
 * @author: Blas Rosas Samuel
 * @author: Espinoza Vazquez Gabriela
 * @author: Hernández Estudillo Itzel Mitzi
 * @author: Nava Avalos Betzabe Malinali
 * @author: Ramírez Gamboa Martina Margarita
 * @author: Sánchez Guerrero Irvin Marino

 * @about: Realizacion del proyecto del metodo simplex
 */

 import java.io.*;
 import java.util.*;

 class MetodoSimplex{
     public static void main(String args[]) throws IOException{
         //declarar el arreglo de los objetos
		 Simplex arraySimplex[] = new Simplex[10];
         int NumVariables;
		 String variable;
         int ValFuncion=0;
		 int x=0, y;
         String otravariable,otroF;
         //preguntar cuantas variables se van a ocupar
		 System.out.println("\tVARIABLES QUE SE OCUPARAN EN EL METODO SIMPLEX");
		 NumVariables=MetodosIngresar.leeInt("Cuantas variables necesita:");
         do{
		    
            variable=MetodosIngresar.leeString("Variable:");
            ValFuncion=MetodosIngresar.leeInt("Valor de Funcion:");
			//crear al objeto
		    arraySimplex[x]=new Simplex (NumVariables,variable,ValFuncion);
			// cambiar al siguiente renglon 
	        x++;
            otravariable=MetodosIngresar.leeString("Desea colocar otra variable S/N:");
            
	    }while(otravariable.equals("S")|| otravariable.equals("s"));

        //preguntar los valores para la funcion objetivo
		 System.out.println("METODO SIMPLEX");
		 System.out.println("Numero de variables:" +NumVariables);
    System.out.println("Variables\tValores Funcion");
		 for(y=0; y<x; y++)
	   {
			System.out.println(arraySimplex[y].getvariable()+"\t\t"+
                               arraySimplex[y].getValFuncion());
	   }
     }
 }