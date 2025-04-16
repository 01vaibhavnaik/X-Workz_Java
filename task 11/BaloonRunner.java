class BaloonRunner{
	public static void main(String[] args){
		
	Baloon baloon=new Baloon("White",'S',20,"Round","Nitrogen");
	baloon.Display();
	
	System.out.println("=====================================================================");
	
	Baloon baloon1=new Baloon("Brown",'M',50,"Heart","Oxygen");
	baloon1.Display();
	
	System.out.println("=====================================================================");
	
	Baloon baloon3=new Baloon("Red",'L',70,"Square","CarbonDioxide");
	baloon3.Display();
	
	System.out.println("=====================================================================");

	Baloon baloon4=new Baloon("Green",'M',40,"Triangle","Nitrogen");
	baloon4.Display();
	}
}