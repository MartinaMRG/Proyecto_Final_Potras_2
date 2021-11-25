import java.io.*;
class MethodsLogin {   
    
	private static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
     
	 public static void muestraMenu(String myArray[])
    {
		int x, opc;
		
		System.out.println( "\t\t" + myArray[0] );
		for(x=1 ; x <myArray.length ; x++ )
		{
			System.out.println("\t" + x + ".-" + myArray[x] );
		}
    }
	 
    public static String leeString( String mensaje) throws IOException {
       String cadena="";
	   System.out.print(mensaje);
       cadena = leer.readLine();
       return (cadena);      
    }
	 public static int leeInt( String mensaje) throws IOException {
       int numero=0;
	   System.out.print(mensaje);
	   try{
       numero = Integer.parseInt(leer.readLine());
	   }
	   catch(Exception e)
	   {
		   System.out.print("Debe ingresar un numero");
	   }
       return (numero);      
    }
	
	public static double leeDouble (String mensaje) throws IOException {
		double numero=0;
		int flagError=0;
		while (flagError==0)
		{
			System.out.print(mensaje);
			try{
				numero=Double.parseDouble(leer.readLine());
				flagError=1;
			}
			catch(Exception e)
			{
				System.out.print("Debe ingresar entero");
				flagError=0;
			}
		}
		return(numero);
	}
	
	public static double sumaint( double numUno, double numDos )
	{
		return(numUno+numDos);
	}
	public static double divideDouble(double numUno, double numDos)
	{
		return(numUno/numDos);
	}
	public static int multiplicaInt( int numUno,int numDos)
	{
		return(dolar * tipocambio);
	}
}