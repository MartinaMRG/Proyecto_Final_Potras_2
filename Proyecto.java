/*
 * @author: Blas Rosas Samuel
 * @author: Espinoza Vazquez Gabriela
 * @author: Hernandez Estudillo Itzel Mitzi
 * @author: Nava Avalos Betzabe Malinali
 * @author: Ramírez Gamboa Martina Margarita
 * @author: Sánchez Guerrero Irvin Marino

 * @about: Realization of the simplex method project
 */

 import java.io.*;
 import java.util.*;
 import com.sun.java.swing.table.*;

 class simplexMethod{
     public static void main(String args[]) throws IOException{
         //declare the array of objects
		 Simplex arraySimplex[] = new Simplex[10];
         int numVariables;
		 String variable;
         int valFunction=0,valRestriction=0;
		 int x=0, y=0;
         String anothervariable,otherF;
         //ask how many variables are going to be occupied
		 System.out.println("\tVARIABLES TO BE COVERED IN THE SIMPLEX METHOD");
		 numVariables=methodsLogin.readInt("How many variables do you need:");
		 
         do{
		    
            variable=methodsLogin.readString("Variable:");
            ValFunction=methodsLogin.readInt("Function Value:");
            valRestriccion=methodsLogin.readInt("Restriction Value:");
			//create the object
		    arraySimplex[x]=new Simplex (NumVariables,variable,ValFunction,valRestriction);
			// change to the next line
		 x++;
		 anothervariable=MethodsLogin.readString("You want to put another variable S/N:");
            
	    }while(anothervariable.equals("S")|| anothervariable.equals("s"));
		if(anothervariable == x)
		 {
			 System.out.println("Complete variables");
		 }
		 else
		 {
			 System.out.println("Variables are missing");
		 }
         
        //ask the values for the target function and print
		 System.out.println("SIMPLEX METHOD");
		 System.out.println("Number of variables:" +numVariables);
         System.out.println("Variables\tValues Function\tValue of Constraint");
		 for(y=0; y<x; y++)
	   {
			System.out.println(arraySimplex[y].getvariable()+"\t\t"+
                               arraySimplex[y].getvalFunction()+"\t\t"+
							   arraySimplex[y].getvalRestriction());
	   }
	   System.out.println("METHOD IN STANDARD SHAPE");
	   System.out.println("Number of variables:" +numVariables);
       System.out.println("Variables\tValues Function\tValue of Constraint");
	   for(y=0; y<x; y++)
	   {
			System.out.println(arraySimplex[y].getvariable()+"\t\t"+
                               " - "+arraySimplex[y].getvalFunction()+"\t\t"+
							   arraySimplex[y].getvalRestriction());
	   }
	   
    }
           
}

class data{
    int i,j,rows,columns;
	int variable,valFuntion,valRestriction,numVariables;
	object data[][]={
	 {
		 this.arraySimplex[y].getvariable,
		 this.arraySimplex[y].getvalFunction,
		 this.arraySimplex[y].getvalRestriction,
		 this.arraySimplex[y].getnumVariables
	 }
	int i, j;
	 for(i=0; i<data; i++){
		 for(j=0; j<data[0].length; j++){
		 System.out.println(data[i][j] + " ");
		 System.out.println();
		 }
		// Returns the number of columns
		  public int getColumns() { 
		   return( data[0].length ); 
		  } 
		  //returns number of rows
		  public int getRows() { 
			return( data.length );
		  }
        
		  public Object getValueAt( int rows,int columns ) { 
			return( data[rows][columns] ); 

			public void setvalueAt(Object values,int columns,int rows){
				data[columns][rows]=values;
				Tabla();
			}


	}
}		 
     