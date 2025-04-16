class RatPoisonRunner{
	
	public static void main(String[] args){
		String name="Sodium";
		int price=456;
		RatPoison ratpoison1=new RatPoison(name,price);
		System.out.println(" RatPoison1 Name:"+ratpoison1.name+" \n RatPoison1 Price:"+ratpoison1.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Warfarin";
		price=287;
		RatPoison ratpoison2=new RatPoison(name,price);
		System.out.println(" RatPoison2 Name:"+ratpoison2.name+" \n RatPoison2 Price:"+ratpoison2.price);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Alphachloralose";
		price=598;
		RatPoison ratpoison3=new RatPoison(name,price);
		System.out.println(" RatPoison3 Name:"+ratpoison3.name+" \n RatPoison3 Price:"+ratpoison3.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Flocoumafen";
		price=963;
		RatPoison ratpoison4=new RatPoison(name,price);
		System.out.println(" RatPoison4 Name:"+ratpoison4.name+" \n RatPoison4 Price:"+ratpoison4.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Zinc Phosphide";
		price=876;
		RatPoison ratpoison5=new RatPoison(name,price);
		System.out.println(" RatPoison4 Name:"+ratpoison5.name+" \n RatPoison5 Price:"+ratpoison5.price);
	}
}