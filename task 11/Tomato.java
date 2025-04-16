class Tomato{
	String tomatoLocation;
	int tomatoKg;
	int tomatoPrice;
	String tomatoColor;
	String tomatoQuality;
	String tomatoProduce;
	
	Tomato(){
		//System.out.println("No-arg constructor");
	}
	Tomato(String tomatoLocation){
		this();
		this.tomatoLocation=tomatoLocation;
		//System.out.println("String constructor");
		
	}
	Tomato(String tomatoLocation,int tomatoKg){
		this(tomatoLocation);
		this.tomatoKg=tomatoKg;
		//System.out.println("String,int constructor");
		
	}
	Tomato(String tomatoLocation,int tomatoKg,int tomatoPrice){
		this(tomatoLocation,tomatoKg);
		this.tomatoPrice=tomatoPrice;
		//System.out.println("String,int,int constructor");
		
	}
	Tomato(String tomatoLocation,int tomatoKg,int tomatoPrice,String tomatoColor){
		this(tomatoLocation,tomatoKg,tomatoPrice);
		this.tomatoColor=tomatoColor;
		//System.out.println("String,int,int,String constructor");
		
	}
	Tomato(String tomatoLocation,int tomatoKg,int tomatoPrice,String tomatoColor,String tomatoQuality){
		this(tomatoLocation,tomatoKg,tomatoPrice,tomatoColor);
		this.tomatoQuality=tomatoQuality;
		//System.out.println("String,int,int,String,String constructor");
		
	}
	Tomato(String tomatoLocation,int tomatoKg,int tomatoPrice,String tomatoColor,String tomatoQuality ,String tomatoProduce){
		this(tomatoLocation,tomatoKg,tomatoPrice,tomatoColor,tomatoQuality);
		this.tomatoProduce=tomatoProduce;
		//System.out.println("String,int,int,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Location Of Tomato "+this.tomatoLocation);
		System.out.println("Tomato Kg:"+this.tomatoKg);
		System.out.println("Tomato Price:"+this.tomatoPrice);
		System.out.println("Tomato Color:"+this.tomatoColor);
		System.out.println("Tomato Quality:"+this.tomatoQuality);
		System.out.println("Tomato Manufacture in Month Of:"+this.tomatoProduce);

	}
}
	
	
