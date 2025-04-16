class Egg{
	String eggType;
	int eggPrice;
	int eggSize;
	String eggColor;
	String eggQuality;
	String eggProduce;
	
	Egg(){
		//System.out.println("No-arg constructor");
	}
	Egg(String eggType){
		this();
		this.eggType=eggType;
		//System.out.println("String constructor");
		
	}
	Egg(String eggType,int eggPrice){
		this(eggType);
		this.eggPrice=eggPrice;
		//System.out.println("String,int constructor");
		
	}
	Egg(String eggType,int eggPrice,int eggSize){
		this(eggType,eggPrice);
		this.eggSize=eggSize;
		//System.out.println("String,int,int constructor");
		
	}
	Egg(String eggType,int eggPrice,int eggSize,String eggColor){
		this(eggType,eggPrice,eggSize);
		this.eggColor=eggColor;
		//System.out.println("String,int,int,String constructor");
		
	}
	Egg(String eggType,int eggPrice,int eggSize,String eggColor,String eggQuality){
		this(eggType,eggPrice,eggSize,eggColor);
		this.eggQuality=eggQuality;
		//System.out.println("String,int,int,String,String constructor");
		
	}
	Egg(String eggType,int eggPrice,int eggSize,String eggColor,String eggQuality ,String eggProduce){
		this(eggType,eggPrice,eggSize,eggColor,eggQuality);
		this.eggProduce=eggProduce;
		//System.out.println("String,int,int,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Which Type Of Egg "+this.eggType);
		System.out.println("Egg Price:"+this.eggPrice);
		System.out.println("Egg Length in cm:"+this.eggSize);
		System.out.println("Egg Color:"+this.eggColor);
		System.out.println("Egg Quality:"+this.eggQuality);
		System.out.println("Egg Produce in Month Of:"+this.eggProduce);

	}
}
	
	
