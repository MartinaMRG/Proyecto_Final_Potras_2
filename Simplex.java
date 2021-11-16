//objetos y clases

class Simplex{
	//variables de instancia
	int NumVariables,ValFuncion;
	String variable;
	
	//constructor
	Simplex (int NumVariables, String variable, int ValFuncion)
	{
		//asigna this.variable de instancias
		this.NumVariables = NumVariables;
		this.variable = variable;
		this.ValFuncion = ValFuncion;
	}
	//muestra los datos
	public void muestradatos()
	{
		System.out.println("Numero de Variables:"+NumVariables);
		System.out.println("Variable:" +variable);
		System.out.println("Valor:" +ValFuncion);
	}
	//metodo set
	public void setvariable(String variable)
	{
		this.variable = variable;
	}
	public void setNumVariables(int NumVariables)
	{
		this.NumVariables = NumVariables;
	}
	public void setValFuncion(int ValFuncion)
	{
		this.ValFuncion = ValFuncion;
	}
	//metodos get
	public String getvariable()
	{
		return(this.variable);
	}
	public int getNumVariables()
	{
		return(this.NumVariables);
	}
	public int getValFuncion()
	{
		return(this.ValFuncion);
	}
	
}
