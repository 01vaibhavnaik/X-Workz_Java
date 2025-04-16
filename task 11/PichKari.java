class PichKari{
	String pichkariColor;
	int pichkariPrice;
	String pichkariType;
	String pichkariBrand;
	int pichkariLength;
	String pichkariWaterCapacity;
	
	PichKari(){
		//System.out.println("No-arg constructor");
	}
	PichKari(String pichkariColor){
		this();
		this.pichkariColor=pichkariColor;
		//System.out.println("String constructor");
		
	}
	PichKari(String pichkariColor,int pichkariPrice){
		this(pichkariColor);
		this.pichkariPrice=pichkariPrice;
		//System.out.println("String,int constructor");
		
	}
	PichKari(String pichkariColor,int pichkariPrice,String pichkariType){
		this(pichkariColor,pichkariPrice);
		this.pichkariType=pichkariType;
		//System.out.println("String,int,String constructor");
		
	}
	PichKari(String pichkariColor,int pichkariPrice,String pichkariType,String pichkariBrand){
		this(pichkariColor,pichkariPrice,pichkariType);
		this.pichkariBrand=pichkariBrand;
		//System.out.println("String,int,String,String constructor");
		
	}
	PichKari(String pichkariColor,int pichkariPrice,String pichkariType,String pichkariBrand,int pichkariLength){
		this(pichkariColor,pichkariPrice,pichkariType,pichkariBrand);
		this.pichkariLength=pichkariLength;
		//System.out.println("String,int,String,String,int constructor");
		
	}
	PichKari(String pichkariColor,int pichkariPrice,String pichkariType,String pichkariBrand,int pichkariLength ,String pichkariWaterCapacity){
		this(pichkariColor,pichkariPrice,pichkariType,pichkariBrand,pichkariLength);
		this.pichkariWaterCapacity=pichkariWaterCapacity;
		//System.out.println("String,int,String,String,int,String constructor");
		
	}
	void Display(){
		System.out.println("PichKari Color:"+this.pichkariColor);
		System.out.println("PichKari Price:"+this.pichkariPrice);
		System.out.println("PichKari Type:"+this.pichkariType);
		System.out.println("PichKari Barnd:"+this.pichkariBrand);
		System.out.println("PichKari Length in cm:"+this.pichkariLength);
		System.out.println("PichKari Water Holding Capacity:"+this.pichkariWaterCapacity);

	}
}