class Color{
	String colorBrand;
	int colorgram;
	double colorPrice;
	String colorColor;
	String colorQuality;
	String colorProduce;
	
	Color(){
		//System.out.println("No-arg constructor");
	}
	Color(String colorBrand){
		this();
		this.colorBrand=colorBrand;
		//System.out.println("String constructor");
		
	}
	Color(String colorBrand,int colorgram){
		this(colorBrand);
		this.colorgram=colorgram;
		//System.out.println("String,int constructor");
		
	}
	Color(String colorBrand,int colorgram,double colorPrice){
		this(colorBrand,colorgram);
		this.colorPrice=colorPrice;
		//System.out.println("String,int,double constructor");
		
	}
	Color(String colorBrand,int colorgram,double colorPrice,String colorColor){
		this(colorBrand,colorgram,colorPrice);
		this.colorColor=colorColor;
		//System.out.println("String,int,double,String constructor");
		
	}
	Color(String colorBrand,int colorgram,double colorPrice,String colorColor,String colorQuality){
		this(colorBrand,colorgram,colorPrice,colorColor);
		this.colorQuality=colorQuality;
		//System.out.println("String,int,double,String,String constructor");
		
	}
	Color(String colorBrand,int colorgram,double colorPrice,String colorColor,String colorQuality ,String colorProduce){
		this(colorBrand,colorgram,colorPrice,colorColor,colorQuality);
		this.colorProduce=colorProduce;
		//System.out.println("String,int,double,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Color Company"+this.colorBrand);
		System.out.println("Color In Gram:"+this.colorgram);
		System.out.println("Color Price:"+this.colorPrice+" Rs");
		System.out.println("Color Color:"+this.colorColor);
		System.out.println("Color Quality:"+this.colorQuality);
		System.out.println("Color Manufacture in Month Of:"+this.colorProduce);

	}
}
	
	
