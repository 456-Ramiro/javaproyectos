
public class Operaciones {
	
	private int num1;
	private int num2;
	
	public Operaciones(){		
		num1=0;
		num2=0;
	}
	public Operaciones(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public int suma()
	{
		return num1+num2;
	}
	public int resta()
	{
		return num1-num2;
	}
	public int multiplicar()
	{
		return num1*num2;
	}
	public int dividir()
	{
		return num1/num2;
	}	

}
