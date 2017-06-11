class Calculation{
int z,x,y;
public  Calculation(int i, int j) {
	// TODO Auto-generated constructor stub
	this.x=i;
	this.y=j;
	System.out.println("system"+this.x+this.y);
}

public void addition(int x, int y){
z = x+y;
System.out.println("The sum of the given numbers:"+z);
}
public void Substraction(int x,int y){
z = x-y;
System.out.println("The difference between the given numbers:"+z);
}
}


public class My_Calculation extends Calculation{
public My_Calculation(){
	super(5,10);	
}	
	
public void multiplication(){
z = x*y;
System.out.println("The product of the given numbers:"+z);

}

public static void main(String args[]){
int a = 20, b = 10;
My_Calculation demo = new My_Calculation();
demo.multiplication();
}
}