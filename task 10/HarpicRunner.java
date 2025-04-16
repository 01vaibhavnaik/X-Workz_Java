class HarpicRunner{
	
	public static void main(String[] args){
		String uses="BathRoom";
		int ml=10;
		int price=250;
		Harpic harpic1=new Harpic(uses,ml,price);
		System.out.println(" Harpic1 Uses:"+harpic1.uses+" \n Harpic1 Ml:"+harpic1.ml+"\n Harpic1 Price:"+harpic1.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		uses="Toilet";
		ml=20;
		price=400;
		Harpic harpic2=new Harpic(uses,ml,price);
		System.out.println(" Harpic2 Uses:"+harpic2.uses+" \n Harpic2 Ml:"+harpic2.ml+"\n Harpic2 Price:"+harpic2.price);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		uses="Bath Room";
		ml=50;
		price=150;
		Harpic harpic3=new Harpic(uses,ml,price);
		System.out.println(" Harpic3 Uses:"+harpic3.uses+" \n Harpic3 Ml:"+harpic3.ml+"\n Harpic3 Price:"+harpic3.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		uses="BathRoom";
		ml=20;
		price=500;
		Harpic harpic4=new Harpic(uses,ml,price);
		System.out.println(" Harpic4 Uses:"+harpic4.uses+" \n Harpic4 Ml:"+harpic4.ml+"\n Harpic4 Price:"+harpic4.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		uses="Toilet";
		ml=250;
		price=200;
		Harpic harpic5=new Harpic(uses,ml,price);
		System.out.println(" Harpic4 Uses:"+harpic5.uses+" \n Harpic5 Ml:"+harpic5.ml+"\n Harpic5 Price:"+harpic5.price);
	}
}