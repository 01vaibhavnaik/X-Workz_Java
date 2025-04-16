class Bucket{
	String bucketType;
	int bucketPrice;
	char bucketSize;
	String bucketColor;
	String bucketQuality;
	String bucketProduce;
	
	Bucket(){
		//System.out.println("No-arg constructor");
	}
	Bucket(String bucketType){
		this();
		this.bucketType=bucketType;
		//System.out.println("String constructor");
		
	}
	Bucket(String bucketType,int bucketPrice){
		this(bucketType);
		this.bucketPrice=bucketPrice;
		//System.out.println("String,int constructor");
		
	}
	Bucket(String bucketType,int bucketPrice,char bucketSize){
		this(bucketType,bucketPrice);
		this.bucketSize=bucketSize;
		//System.out.println("String,int,int constructor");
		
	}
	Bucket(String bucketType,int bucketPrice,char bucketSize,String bucketColor){
		this(bucketType,bucketPrice,bucketSize);
		this.bucketColor=bucketColor;
		//System.out.println("String,int,char,String constructor");
		
	}
	Bucket(String bucketType,int bucketPrice,char bucketSize,String bucketColor,String bucketQuality){
		this(bucketType,bucketPrice,bucketSize,bucketColor);
		this.bucketQuality=bucketQuality;
		//System.out.println("String,int,char,String,String constructor");
		
	}
	Bucket(String bucketType,int bucketPrice,char bucketSize,String bucketColor,String bucketQuality ,String bucketProduce){
		this(bucketType,bucketPrice,bucketSize,bucketColor,bucketQuality);
		this.bucketProduce=bucketProduce;
		//System.out.println("String,int,char,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("Type Of Bucket "+this.bucketType);
		System.out.println("Bucket Price:"+this.bucketPrice);
		System.out.println("Bucket Size:"+this.bucketSize);
		System.out.println("Bucket Color:"+this.bucketColor);
		System.out.println("Bucket Quality:"+this.bucketQuality);
		System.out.println("Bucket Manufacture in Month Of:"+this.bucketProduce);

	}
}
	
	
