class BarRunner{
	
	public static void main(String[] args){
		String brandName="Magic Moment";
		long ml=200;
		long price=2500;
		Bar bar1=new Bar(brandName,ml,price);
		System.out.println(" Bar1 Brand name:"+bar1.brandName+" \n Bar1 Color:"+bar1.ml+"\n Bar1 Price:"+bar1.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		brandName="Royal Stack";
		ml=300;
		price=4000;
		Bar bar2=new Bar(brandName,ml,price);
		System.out.println(" Bar2 Brand name:"+bar2.brandName+" \n Bar2 Color:"+bar2.ml+"\n Bar2 Price:"+bar2.price);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		brandName="Vodka";
		ml=500;
		price=5000;
		Bar bar3=new Bar(brandName,ml,price);
		System.out.println(" Bar3 Brand name:"+bar3.brandName+" \n Bar3 Color:"+bar3.ml+"\n Bar3 Price:"+bar3.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		brandName="Rum";
		ml=900;
		price=5000;
		Bar bar4=new Bar(brandName,ml,price);
		System.out.println(" Bar4 Brand name:"+bar4.brandName+" \n Bar4 Color:"+bar4.ml+"\n Bar4 Price:"+bar4.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		brandName="Beer";
		ml=400;
		price=200;
		Bar bar5=new Bar(brandName,ml,price);
		System.out.println(" Bar4 Brand name:"+bar5.brandName+" \n Bar5 Color:"+bar5.ml+"\n Bar5 Price:"+bar5.price);
	}
}