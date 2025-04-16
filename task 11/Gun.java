class Gun{
	String gunType;
	int gunBullet;
	double gunPrice;
	String gunColor;
	String gunQuality;
	String gunProduce;
	
	Gun(){
		//System.out.println("No-arg constructor");
	}
	Gun(String gunType){
		this();
		this.gunType=gunType;
		//System.out.println("String constructor");
		
	}
	Gun(String gunType,int gunBullet){
		this(gunType);
		this.gunBullet=gunBullet;
		//System.out.println("String,int constructor");
		
	}
	Gun(String gunType,int gunBullet,double gunPrice){
		this(gunType,gunBullet);
		this.gunPrice=gunPrice;
		//System.out.println("String,int,double constructor");
		
	}
	Gun(String gunType,int gunBullet,double gunPrice,String gunColor){
		this(gunType,gunBullet,gunPrice);
		this.gunColor=gunColor;
		//System.out.println("String,int,double,String constructor");
		
	}
	Gun(String gunType,int gunBullet,double gunPrice,String gunColor,String gunQuality){
		this(gunType,gunBullet,gunPrice,gunColor);
		this.gunQuality=gunQuality;
		//System.out.println("String,int,double,String,String constructor");
		
	}
	Gun(String gunType,int gunBullet,double gunPrice,String gunColor,String gunQuality ,String gunProduce){
		this(gunType,gunBullet,gunPrice,gunColor,gunQuality);
		this.gunProduce=gunProduce;
		//System.out.println("String,int,double,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Gun Name"+this.gunType);
		System.out.println("bullet mm:"+this.gunBullet);
		System.out.println("Gun Price:"+this.gunPrice+" lkh");
		System.out.println("Gun Color:"+this.gunColor);
		System.out.println("Gun Quality:"+this.gunQuality);
		System.out.println("Gun Manufacture in Month Of:"+this.gunProduce);

	}
}
	
	
