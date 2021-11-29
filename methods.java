import java.io.*;
class methods{

public static void showArray(String myArray[])
{
		int x;
		System.out.println( "\t\t" + myArray[0] );
		for(x=1 ; x <myArray.length ; x++ )
		{
			System.out.println("\t" + x + ".-" + myArray[x] );
		}
}

public static void cls(){
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex){}
}

public static void pausa()
	{
		try{ 
          Thread.sleep(5000); 
        } 
        catch(InterruptedException e )
        { 
          System.out.println("Interrupted pause"); 
        }
	}
	
}