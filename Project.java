/**
 * @author: Blas Rosas Samuel
 * @author: Espinoza Vazquez Gabriela
 * @author: Hernandez Estudillo Itzel Mitzi
 * @author: Nava Avalos Betzabe Malinali
 * @author: Ramírez Gamboa Martina Margarita
 * @author: Sánchez Guerrero Irvin Marino
 *
 * @about: Realization of the simplex method project
 */
import java.io.*;
import java.sql.DatabaseMetaData.*;
import java.util.*;
import java.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext.*;
import java.com.sun.java.swing.table.*;

 class simplexMethod{
     public static void main(String args[]) throws IOException{
         /**
          * @about: declare the array of objects
          */
		 Simplex arraySimplex[] = new Simplex[10];
         int numVariables;
		 String variable;
         int valFunction=0,valRestriction=0;
		 int x=0, y=0;
         String anothervariable,otherF;

		 String menu[]={"**STEPS OF THE SIMPLEX METHOD**:",
                         "1) Simplex method tutorial.",
                         "2) Add values for the Mathematical Model.",
                         "3) Show Mathematical Model.",
                         "4) Show Standard Model.",
                         "5) Show Simplex Table.",
                         "6) Members' information."};
         do{
             opc=0;
			while (opc <=0 || opc>menu.length-1)
			{
				Metodos.cls();
				MetodosIngresar.muestraMenu(menu);
		        opc=MetodosIngresar.leeInt("\tSelect an option: ");
		    }
            switch(opc)
		    {
                case 1:
                Metodos.cls();
				System.out.println("\t"+menu[1]);
                System.out.println("***STEPS OF THE SIMPLEX METHOD***");
                System.out.println("As a first pass, the mathematical model must be carried out");
                System.out.println("The next steps are:
                                   1.- Read carefully the problem you want to do.
                                   2.- Know if it should be maximized or minimized.
                                   3.- Start with the solution of the problem.
                                   4.- Find the variables.
                                   5.- Create the objective function with the data of the problem to be solved.
                                   6.- Create the restrictions with the data that the problem gives us.
                                   7.- Determine if the problem ends in 0.");

                System.out.println("To carry out the first step is simple, 
                                   you just have to read carefully and attentively 
                                   the text of the problem you want to solve.");  

                System.out.println("In order to know if the problem should be maximized or minimized, 
                                  you can find it in writing or knowing if the person wants to decrease or 
                                  increase something.");

                System.out.println("Once you have already found what is required of the problem and have found 
                                    what you want to fix and get the correct results, a solution is given.");

                System.out.println("Now you start with the variables, you place the number of variables and of 
                                   course you can place the name of the variables to know who you represent within 
                                   the problem to solve.");

                System.out.println("Then the objective function is created, which is represented by the number 
                                   of variables that have just been found, since this quantity represents the exact 
                                   number of what each of the represented variables is equivalent.");

                System.out.println("Then comes the reconstruction of the restrictions and they are also the ones that 
                                   were found when reading the text of the problem but in these it is important to know that 
                                   we can mix one type of solution with another, for example:
 
                                   If the problem asks for amounts of pesos and others ask for dollar amounts, they can be solved 
                                   together since they can only be solved when the types of pesos are the same.");   

                System.out.println("And finally, you must realize if the problem has a solution or not.

                                   When a problem does have a solution, all the variables belong to the cinjjoint of Z.");

                System.out.println("Finally the mathematical model is finished.");   

                System.out.println("Now the realization of the model in standard form will be explained.")  

                System.out.println("To begin with the construction of the model in standard form, the following steps 
                                    must be followed:

                                    1.- Have the mathematical model finished
                                    2.- Place the variables again
                                    3.- Place the function again with negative values
                                    4.- Pass the restrictions to equalities
                                    5.- The realization of the simplex table that is presented by some necessary points.");

                System.out.println("To start with the standard model it is necessary to have the original mathematical model");

                System.out.println("To replace the variables, they must be called with exactly the same name as the original mathematical model.");

                System.out.println("For the placement of the objective function the quantities and variables with them but in 
                                   this step it changes since if in the original mathematical model they are positive values, 
                                   now in the standard they become negative values to be able to make the tables.");

                System.out.println("Then the realization of the equalities restrictions is done in the final result of each one of them.");

                System.out.println("Step 1: Now the simplex table will be carried out as a first step and it is built with the values of the constraints 
                                   and the objective function that it represents Z.");

                System.out.println("Step 2: After having the simplex table comes step 2 and what it does is that the input column of the table 
                                    must be identified.");

                System.out.println("Step 3: You must identify the private value and in order to find the private value you must divide the solution 
                                    column between the input column and identify which is the smallest positive value.");

                System.out.println("Pass 4: The private value must be 1 and to do that, a division must be made between the input column by 
                                    the private value");

                System.out.println("Step 5: The different values of the private must be made 0 and in order to make the value 0, 
                                   the inverse of the interest values must be multiplied by the line of the private and then add 
                                   the product plus the line of interest.");

                System.out.println("Step 6: The simplex table must be updated with the data that we have just taken or obtained.");

                System.out.println("Once the new table is filled with the new values and if there are still negative values in row Z, 
                                   then the entire procedure must be carried out once more from step 2 until finally the row Z no 
                                   longer has any more. negative values, since once it no longer has negative values, it means that 
                                   finally the standard model ends and we obtain the values of each of the variables that we obtained.");                                                                                                 
                
                System.out.println("End of Standard model.");
                Metodo.pausa();
                break;

    case 2:
    Metodos.cls();
	System.out.println("\t"+menu[2]);

    //ask how many variables are going to be occupied
	System.out.println("\t***VARIABLES TO BE COVERED IN THE SIMPLEX METHOD***");
	numVariables=methodsLogin.readInt("How many variables do you need: ");

    //mostrar un mensaje si realiza mal el modelo matematico
	if(numVariables == numVariables){
		System.out.println("**Correct**");
	  }
	    else
	    {
		   System.out.println("Incorrect...");
	    }
	  
	    if(valFunction == valFunction){
		   System.out.println("**Correct**");
	    }
		else
	    {
		  System.out.println("Incorrect...");
	    }
	    if(valRestriction == valRestriction){
		    System.out.println("**Correct**");
	    }
	    else
	    {
		    System.out.println("Incorrect...");
	    }
		
		System.out.println("THE MATHEMATICAL MODEL IS INCORRECT...");
		 
         do{
		    
            variable=methodsLogin.readString("Variable: ");
            ValFunction=methodsLogin.readInt("Function Value: ");
            valRestriccion=methodsLogin.readInt("Restriction Value: ");
			//create the object
		    arraySimplex[x]=new Simplex (NumVariables,variable,ValFunction,valRestriction);
			// change to the next line
		 x++;
		 anothervariable=methodsLogin.readString("You want to put another variable [Y/N]: ");
	    }
        while(anothervariable.equals("y")|| anothervariable.equals("Y"));
		if(anothervariable == x)
		 {
			 System.out.println("**Complete variables**");
		 }
		 else
		 {
			 System.out.println("Variables are missing...");
		 }
         break;

         case 3:
         methods.cls();
		System.out.println("\t"+menu[3]);

        //ask the values for the target function and print
        System.out.println("***SHOW THE MATH MODEL***");
		 System.out.println("-SIMPLEX METHOD-");

         //mostrar un mensaje si realiza mal el modelo matematico
	if(numVariables == numVariables){
		System.out.println("**Correct**");
	  }
	    else
	    {
		   System.out.println("Incorrect...");
	    }
	  
	    if(valFunction == valFunction){
		   System.out.println("**Correct**");
	    }
		else
	    {
		  System.out.println("Incorrect...");
	    }
	    if(valRestriction == valRestriction){
		    System.out.println("**Correct**");
	    }
	    else
	    {
		    System.out.println("Incorrect...");
	    }
		
		System.out.println("THE MATHEMATICAL MODEL IS INCORRECT...");
		 System.out.println("Number of variables: " +numVariables);
         System.out.println("Variables\tValues Function\tValue of Constraint");
		 for(y=0; y<x; y++)
	   {
			System.out.println(arraySimplex[y].getvariable()+"\t\t"+
                               arraySimplex[y].getvalFunction()+"\t\t"+
							   arraySimplex[y].getvalRestriction());
	   }
       break;

       case 4:
       methods.cls();
       System.out.println("\t"+menu[4]);

       System.out.printl("***SHOW THE MODEL IN STANDARD FORM***");
	   System.out.println("-METHOD IN STANDARD SHAPE-");
	   System.out.println("Number of variables: " +numVariables);
       System.out.println("Variables\tValues Function\tValue of Constraint");
	   for(y=0; y<x; y++)
	   {
			System.out.println(arraySimplex[y].getvariable()+"\t\t"+
                               " - "+arraySimplex[y].getvalFunction()+"\t\t"+
							   arraySimplex[y].getvalRestriction());
	   }
	   break;

  case 5:
    methods.cls();
    System.out.println("\t"+menu[4]);

    System.out.println("***SIMPLEX TABLES***");

class data{
    int rows,columns;
	int variable,valFuntion,valRestriction,numVariables;
	data[][]=
	 {
		 this.arraySimplex[y].getvariable,
		 this.arraySimplex[y].getvalFunction,
		 this.arraySimplex[y].getvalRestriction,
		 this.arraySimplex[y].getnumVariables
	 }
	int j;
	for(i=0; i<data; i++){
		 for(j=0; j<data[0].length; j++)
         {
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
				Table();
			}
        }
	}

    for (int i=0; i<valRestriction; i++) {
        for( int y=0; y<numVariables; y++) {
            try{
                data[i][y] = arraySimplex[y].getvalRestriction();
            } catch ( Excepción e) {
                data[i][y] = 0;
            }
        }
        
        if (arraySimplex[y].getvalRestriction()*a ! =  1 ){ //Objective Function
            if (numVariables (arraySimplex[y].getDesigualdad()) ==  1 ){
                data[i][b] = 1;
                if ( arraySimplex[y].getDesigualdad() ==  0 ){
                    data[0][b] = promlado;
                    valorfila[i] =  1;
                }
                b + =  1;
            
                if (numVariables (arraySimplex[y].getDesigualdad()) ==  2 ){
                    data[i][b] =  - 1 ;
                    data[i][b +  1 ] = 1;
                    b + = 2;
                }
            }
            
        data[i][width - 2] = arraySimplex[y].getvalRestriction();	
        data[i][width - 1] = arraySimplex[y].getvalRestriction().getpromlado();
        }
    }
//There are no negative values
public  double  evidence(){
    double negative =  true;
    for ( int i = 0; i<data[0].length; i++) {
        if(data [0][i]<0){
            negative = false;
            break;
        }
    }
    return negative;
}

//Calculate pivot value
public  int  ColumPivote(){
    int index= 0;
    double less = data[0][index];
    
    for (int i=0; i<data[0].length - 2; i++){
        if (data[0][i]<=less && data[0][i]<0){
            less = data[0][i];
            index = i;
        }
    }
    return index;
}	

//Row provote calculate
public  int  rowsPrivote (int columPrivote){
    double values[] = [valRestriction - 1];
    int index[] = new int [valRestriction - 1];
    int count= 0,value0;
    for(int i = 0; i<valRestriction - 1; i++) {
        if (data[i + 1 ][columPrivote] > 0 && data[i + 1][data[0].length - 2] ! = 0){

            index[count] = i + 1;
            value[count] = Match.abs(data[i + 1][data[0].arraySimplex[y].getlongitud - 2]/data[i + 1][columPrivote]);
            msm (" " + double.setString(data[i + 1][data[0].length - 2]) + "/" + double.setString(data[i + 1][columPrivote]) + "=" + double.setString (value[count]));
            count + = 1;
        }
    }
    double less = value[0];
    int rowPrivo = 1;
    for(int i = 0; i<count; i++){
        if (value [i] <= less && value [i] ! = 0){
            less = value [i];
            rowPrivo = index[i];
        }
    }
    System.out.println( "The pivot row is:" + rowPrivo);
    return rowPrivo;

}

// Make 1 the private value
public  void  simplificacion ( int  filaPrivo , double  varPrivote ) {
    for (int i = 0; i<data[0].length; i++){
        data [filaPrivo][i] = data[filaPrivo][i]/varPrivote;
    }
}

//Table
public  void  simplificar(int filaPrivo, int columPrivote){
    for(int i = 0; i<data.length; i++){
        if(data[i][columPrivote]! = 0 && i ! = filaPrivo){
            if (data[i][columPrivo]>0){
                // si es valor positivo
                factor double = data[i][columPrivo] * - 1;
                if(int j = 0; j < tabla[0].length; j++){
                    datos[i][j] = dats[filaPivo][j] * factor + data[i][j];
                }
            } 
            else {
                // si es valor negativo
                factor double = data[i][columPrivo] * - 1;
                for(int j = 0; j < data[0].length; j++){
                    data[i][j] = data[filaPrivo][j] * factor +data[i][j];
                }
            }
        }
    }
}
//Result of the table
public  void  result(){
    System.out.println("Number of variables:"+numVariables );
    result = [numVariables];
    int k = 0 ;
    for(int i = 0; i < data.length; i++){
        for(int j = 0; j < numVariables; j++){
            if(data[i][j] == 1){
                result[j] = data[i][data[0].length - 2];
                k = j;
            }
        }
    }
    promlado = data[0][data[0].length - 2];
    System.out.println(" ");
    for (int i = 0; i<result.length; i++){
        System.out.println("x" + (i + 1) + "=" + result[i]);
    }
}

//Prited of table
public  void  imprimir (String title){
    System.out.println(" ");
    System.out.println("->"+title);
    for(int i = 0; i < data.length; i++){
        System.out.println("  ");
        for (int j = 0; j < data[0].length; j++){
            System.out.println(arraySimplex[y].getdatos(data[i][j]) +" ,");
        }
    }
    System.out.println(" ");
    }
}
    break;

case 6:
Metodos.cls();
System.out.println("\t"+menu[6]);  
	System.out.printl("***TEAM MEMBERS***");
	
	  System.out.println("Members' names:")

      System.out.println("Blas Rosas Samuel");
	  System.out.println("Emails:");
	  System.out.println("gaby09_espinoza06@hotmail.com");
	  System.out.println("sblasr001@alumno.uaemex.mx");

	  System.out.println("Espinoza Vazquez Gabriela");
	  System.out.println("Emails:");
	  System.out.println("gaby09_espinoza06@hotmail.com");
	  System.out.println("gespinozav001@alumno.uaemex.mx");
	  
	  System.out.println("Hernandez Estudillo Itzel Mitzi");
      System.out.println("Emails:");
	  System.out.println("ihernandeze001@alumno.uaemex.mx");
	  System.out.println("Kim.Jirin@hotmail.com");
	  
	  System.out.println("Ramírez Gamboa Martina Margarita");
      System.out.println("Emails:");
	  System.out.println("mar.magi845@gmail.com");
	  System.out.println("mramirezg001@alumno.uaemex.mx");
	  
	  System.out.println("Sánchez Guerrero Irvin Marino");
      System.out.println("Emails:");
	  System.out.println("isanchezg001@alumno.uaemex.mx");
	  System.out.println("Kim.Jirin@hotmail.com");
	  
	  System.out.println("Nava Avalos Betzabe Malinali");
      System.out.println("Emails:");
	  System.out.println("bnavaa001@alumno.uaemex.mx");
	  System.out.println("betzaabby@gmail.com");
	  
	  System.out.println("Software version:");
	  System.out.println("Language Support for Java(TM) by Red Hat");
	  System.out.println("Version 1.0.0");
	  
	  System.out.println("Repository link:");
	  System.out.println("https://github.com/MartinaMRG/Proyecto_Final_Potras_2");
	  
	  System.out.println("Start date:");
	  System.out.println("November 9, 21");
	  
	  System.out.println("End Date:");
	  System.out.println("November 30, 21");
      break;

            } 
        }
     }
}