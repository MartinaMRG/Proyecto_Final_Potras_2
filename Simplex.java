/*objects and class */

class Simplex{
	//Instance variables
	int numVariables,valFunction,valRestriction;
	String variable;
	
	//Buildel
	Simplex (int numVariables, String variable, int valFunction,int valRestriction)
		//assgin the instance variables
		{
		this.numVariables = numVariables;
		this.variable = variable;
		this.valFunction = valFunction;
		this.valRestriction = valRestriction;
	    }
	//Show data
	public void sampleData()
	{
		System.out.println("Number of Variables:"+numVariables);
		System.out.println("Variable:" +variable);
		System.out.println("Value:" +valFunction);
		System.out.println("Restriction:"+valRestriction);
	}
	//Set method
	public void setvariable(String variable)
	{
		this.variable = variable;
	}
	public void setnumVariables(int numVariables)
	{
		this.numVariables = numVariables;
	}
	public void setvalFunction(int valFunction)
	{
		this.valFunction = valFunction;
	}
	public void setvalRestriction(int valRestriction)
	{
		this.valRestriction = valRestriction;
	}
	//get method
	public String getvariable()
	{
		return(this.variable);
	}
	public int getnumVariables()
	{
		return(this.numVariables);
	}
	public int getvalFunction()
	{
		return(this.valFunction);
	}
	public int getvalRestriction()
	{
		return(this.valRestriction);
	}
	
}

class Tabla{
	int columns,rows,valueAt;

	Tabla(int columns,int rows, int valueAt){
		this.columns = columns;
		this.rows = rows;
		this.valueAt= valueAt;
	}
    public void sampleData1()
	{
		System.out.println("Number of columns:"+columns);
		System.out.println("Number of rows:" +rows);
		System.out.println("Number of variable:" +valueAt);
	}
	public void setcolumns(int columns)
	{
		this.columns = columns;
	}
	public void setrows(int rows)
	{
		this.rows = rows;
	}
	public void setvalueAt(int valueAt)
	{
		this.valueAt= valueAt;
	}

	public int getcolumns()
	{
		return(this.columns);
	}
	public int getrows()
	{
		return(this.rows);
	}
	public int getValueAt()
	{
		return(this.valueAt);
	}
}
