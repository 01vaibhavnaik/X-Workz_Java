class Baloon{
	
	String baloonColor;
	char baloonSize;
	int baloonPrice;
	String baloonShape;
	String baloonGas;
	
	
	
	Baloon(){
		//System.out.println("No-arg conts");
	}
	Baloon(String baloonColor){
		this();
		this.baloonColor=baloonColor;
		//System.out.println("String conts");
	}
	Baloon(String baloonColor,char baloonSize){
		this(baloonColor);
		this.baloonSize=baloonSize;
		//System.out.println("String,char conts");
	}
	
	Baloon(String baloonColor,char baloonSize,int baloonPrice){
		this(baloonColor,baloonSize);
		this.baloonPrice=baloonPrice;
		//System.out.println("String,char,int conts");
	}
	Baloon(String baloonColor,char baloonSize,int baloonPrice,String baloonShape){
		this(baloonColor,baloonSize,baloonPrice);
		this.baloonShape=baloonShape;
		//System.out.println("String,char,int,String conts");
	}
	Baloon(String baloonColor,char baloonSize,int baloonPrice,String baloonShape,String baloonGas){
		this(baloonColor,baloonSize,baloonPrice,baloonShape);
		this.baloonGas=baloonGas;
		//System.out.println("String,char,int,String,String conts");
	}
	
	void Display(){
		System.out.println("Baloon Color:"+this.baloonColor);
		System.out.println("Baloon Size:"+this.baloonSize);
		System.out.println("Baloon Price:"+this.baloonPrice);
		System.out.println("Baloon Shape:"+this.baloonShape);
		System.out.println("Baloon Gas:"+this.baloonGas);
		
	}
}