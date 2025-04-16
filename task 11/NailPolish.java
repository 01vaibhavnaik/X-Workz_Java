class NailPolish{
	String nailpolishBrand;
	int nailpolishLength;
	double nailpolishPrice;
	String nailpolishColor;
	String nailpolishQuality;
	String nailpolishProduce;
	
	NailPolish(){
		//System.out.println("No-arg constructor");
	}
	NailPolish(String nailpolishBrand){
		this();
		this.nailpolishBrand=nailpolishBrand;
		//System.out.println("String constructor");
		
	}
	NailPolish(String nailpolishBrand,int nailpolishLength){
		this(nailpolishBrand);
		this.nailpolishLength=nailpolishLength;
		//System.out.println("String,int constructor");
		
	}
	NailPolish(String nailpolishBrand,int nailpolishLength,double nailpolishPrice){
		this(nailpolishBrand,nailpolishLength);
		this.nailpolishPrice=nailpolishPrice;
		//System.out.println("String,int,double constructor");
		
	}
	NailPolish(String nailpolishBrand,int nailpolishLength,double nailpolishPrice,String nailpolishColor){
		this(nailpolishBrand,nailpolishLength,nailpolishPrice);
		this.nailpolishColor=nailpolishColor;
		//System.out.println("String,int,double,String constructor");
		
	}
	NailPolish(String nailpolishBrand,int nailpolishLength,double nailpolishPrice,String nailpolishColor,String nailpolishQuality){
		this(nailpolishBrand,nailpolishLength,nailpolishPrice,nailpolishColor);
		this.nailpolishQuality=nailpolishQuality;
		//System.out.println("String,int,double,String,String constructor");
		
	}
	NailPolish(String nailpolishBrand,int nailpolishLength,double nailpolishPrice,String nailpolishColor,String nailpolishQuality ,String nailpolishProduce){
		this(nailpolishBrand,nailpolishLength,nailpolishPrice,nailpolishColor,nailpolishQuality);
		this.nailpolishProduce=nailpolishProduce;
		//System.out.println("String,int,double,String,String,String constructor");
		
	}
	void Display(){
		System.out.println("NailPolish Brand"+this.nailpolishBrand);
		System.out.println("NailPolish cm:"+this.nailpolishLength);
		System.out.println("NailPolish Price:"+this.nailpolishPrice+" Rs");
		System.out.println("NailPolish Color:"+this.nailpolishColor);
		System.out.println("NailPolish Quality:"+this.nailpolishQuality);
		System.out.println("NailPolish Manufacture in Month Of:"+this.nailpolishProduce);

	}
}
	
	
