class AnkletRunner{
	
	public static void main(String[] args){
		String color="Platinum";
		double gram=20.6;
		long price=2500;
		Anklet anklet1=new Anklet(color,gram,price);
		System.out.println(" Anklet1 Gram:"+anklet1.color+" \n Anklet1 Gram:"+anklet1.gram+"\n Anklet1 Price:"+anklet1.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		color="Gold";
		gram=30.2;
		price=40000;
		Anklet anklet2=new Anklet(color,gram,price);
		System.out.println(" Anklet2 Gram:"+anklet2.color+" \n Anklet2 Gram:"+anklet2.gram+"\n Anklet2 Price:"+anklet2.price);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		color="Silver";
		gram=50;
		price=6000;
		Anklet anklet3=new Anklet(color,gram,price);
		System.out.println(" Anklet3 Gram:"+anklet3.color+" \n Anklet3 Gram:"+anklet3.gram+"\n Anklet3 Price:"+anklet3.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		color="Bronze";
		gram=9.03;
		price=5000;
		Anklet anklet4=new Anklet(color,gram,price);
		System.out.println(" Anklet4 Gram:"+anklet4.color+" \n Anklet4 Gram:"+anklet4.gram+"\n Anklet4 Price:"+anklet4.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		color="Diamond";
		gram=4.3;
		price=20000;
		Anklet anklet5=new Anklet(color,gram,price);
		System.out.println(" Anklet4 Gram:"+anklet5.color+" \n Anklet5 Gram:"+anklet5.gram+"\n Anklet5 Price:"+anklet5.price);
	}
}