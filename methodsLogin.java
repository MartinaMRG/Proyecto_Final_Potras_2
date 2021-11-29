import java.io.*;
class methodsLogin{   
    
	private static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     
	 public static void muestraMenu(String myArray[])
    {
		int x, opc;
		
		System.out.println( "\t\t" + myArray[0] );
		for(x=1 ; x <myArray.length ; x++ )
		{
			System.out.println("\t" + x + ".-" + myArray[x] );
		}
    }
	 
    public static String readString( String message) throws IOException {
       String chain = " ";
	   System.out.print(message);
       chain = read.readLine();
       return (chain);      
    }
	 public static int leeInt( String message) throws IOException {
       int num=0;
	   System.out.print(message);
	   try{
       num = Integer.parseInt(read.readLine());
	   }
	   catch(Exception e)
	   {
		   System.out.print("You must enter a number...");
	   }
       return (num);      
    }
	
	public static double leeDouble (String message) throws IOException {
		double numb=0;
		int flagError=0;
		while (flagError==0)
		{
			System.out.print(message);
			try{
				numb=Double.parseDouble(read.readLine());
				flagError=1;
			}
			catch(Exception e)
			{
				System.out.print("You must enter a whole number...");
				flagError=0;
			}
		}
		return(numb);
	}
	
	public static double sumint( double numOne, double numTwo )
	{
		return(numOne+numTwo);
	}
	public static double divideDouble(double numOne, double numTwo)
	{
		return(numOne/numTwo);
	}
	public static int multiplyInt( int numOne,int numTwo)
	{
		return(numOne * numTwo);
	}
}