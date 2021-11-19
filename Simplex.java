//objetos y clases

class Simplex{
	//variables de instancia
	int NumVariables,ValFuncion,valRestriccion;
	String variable;
	
	//constructor
	Simplex (int NumVariables, String variable, int ValFuncion,int valRestriccion)
	{
		//asigna this.variable de instancias
		this.NumVariables = NumVariables;
		this.variable = variable;
		this.ValFuncion = ValFuncion;
		this.valRestriccion = valRestriccion;
	}
	//muestra los datos
	public void muestradatos()
	{
		System.out.println("Numero de Variables:"+NumVariables);
		System.out.println("Variable:" +variable);
		System.out.println("Valor:" +ValFuncion);
		System.out.println("Restriccion:"+valRestriccion);
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
	public void setvalRestriccion(int valRestriccion)
	{
		this.valRestriccion = valRestriccion;
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
	public int getvalRestriccion()
	{
		return(this.valRestriccion);
	}
	
}
