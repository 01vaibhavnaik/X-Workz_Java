class WatterBall{
	String watterBallShape;
	int watterBallMl;
	int watterBallPrice;
	String watterBallColor;
	String watterBallQuality;
	String watterBallProduce;
	
	WatterBall(){
		//System.out.println("No-arg constructor");
	}
	WatterBall(String watterBallShape){
		this();
		this.watterBallShape=watterBallShape;
		//System.out.println("String constructor");
		
	}
	WatterBall(String watterBallShape,int watterBallMl){
		this(watterBallShape);
		this.watterBallMl=watterBallMl;
		//System.out.println("String,int constructor");
		
	}
	WatterBall(String watterBallShape,int watterBallMl,int watterBallPrice){
		this(watterBallShape,watterBallMl);
		this.watterBallPrice=watterBallPrice;
		//System.out.println("String,int,int constructor");
		
	}
	WatterBall(String watterBallShape,int watterBallMl,int watterBallPrice,String watterBallColor){
		this(watterBallShape,watterBallMl,watterBallPrice);
		this.watterBallColor=watterBallColor;
		//System.out.println("String,int,int,String constructor");
		
	}
	WatterBall(String watterBallShape,int watterBallMl,int watterBallPrice,String watterBallColor,String watterBallQuality){
		this(watterBallShape,watterBallMl,watterBallPrice,watterBallColor);
		this.watterBallQuality=watterBallQuality;
		//System.out.println("String,int,int,String,String constructor");
		
	}
	WatterBall(String watterBallShape,int watterBallMl,int watterBallPrice,String watterBallColor,String watterBallQuality ,String watterBallProduce){
		this(watterBallShape,watterBallMl,watterBallPrice,watterBallColor,watterBallQuality);
		this.watterBallProduce=watterBallProduce;
		//System.out.println("String,int,int,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Shape Of WatterBall "+this.watterBallShape);
		System.out.println("WatterBall Ml:"+this.watterBallMl);
		System.out.println("WatterBall Price:"+this.watterBallPrice);
		System.out.println("WatterBall Color:"+this.watterBallColor);
		System.out.println("WatterBall Quality:"+this.watterBallQuality);
		System.out.println("WatterBall Manufacture in Month Of:"+this.watterBallProduce);

	}
}
	
	
