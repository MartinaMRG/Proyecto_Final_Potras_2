import java.io.*;
class MetodosIngresar {   
    
	private static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
     
    public static String leeString( String mensaje) throws IOException {
       String cadena="";
	   System.out.print(mensaje);
       cadena = leer.readLine();
       return (cadena);      
    }
	 public static int leeInt( String mensaje) throws IOException {
       int numero;
	   System.out.print(mensaje);
       numero = Integer.parseInt(leer.readLine());
       return (numero);      
    }
}