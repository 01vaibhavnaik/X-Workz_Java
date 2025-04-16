class Holi{
	String holiColor;
	int price;
	String holiType;
	String holiBrand;
	int holiGram;
	String holiMonth;
	
	Holi(){
		//System.out.println("No-arg constructor");
	}
	Holi(String holiColor){
		this();
		this.holiColor=holiColor;
		//System.out.println("String constructor");
		
	}
	Holi(String holiColor,int price){
		this(holiColor);
		this.price=price;
		//System.out.println("String,int constructor");
		
	}
	Holi(String holiColor,int price,String holiType){
		this(holiColor,price);
		this.holiType=holiType;
		//System.out.println("String,int,String constructor");
		
	}
	Holi(String holiColor,int price,String holiType,String holiBrand){
		this(holiColor,price,holiType);
		this.holiBrand=holiBrand;
		//System.out.println("String,int,String,String constructor");
		
	}
	Holi(String holiColor,int price,String holiType,String holiBrand,int holiGram){
		this(holiColor,price,holiType,holiBrand);
		this.holiGram=holiGram;
		//System.out.println("String,int,String,String,int constructor");
		
	}
	Holi(String holiColor,int price,String holiType,String holiBrand,int holiGram ,String holiMonth){
		this(holiColor,price,holiType,holiBrand,holiGram);
		this.holiMonth=holiMonth;
		//System.out.println("String,int,String,String,int constructor");
		
	}
	void Display(){
		System.out.println("Holi Color:"+this.holiColor);
		System.out.println("Holi Price:"+this.price);
		System.out.println("Holi Type:"+this.holiType);
		System.out.println("Holi Barnd:"+this.holiBrand);
		System.out.println("Holi Quantity:"+this.holiGram);
		System.out.println("Holi Month:"+this.holiMonth);

	}
}