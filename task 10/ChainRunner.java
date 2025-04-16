class ChainRunner{
	
	public static void main(String[] args){
		String type="Gold";
		String color="Gold";
		long price=2500;
		Chain chain1=new Chain(type,color,price);
		System.out.println(" Chain1 Type:"+chain1.type+" \n Chain1 Color:"+chain1.color+"\n Chain1 Price:"+chain1.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		type="Platinum";
		color="Platinum";
		price=40000;
		Chain chain2=new Chain(type,color,price);
		System.out.println(" Chain2 Type:"+chain2.type+" \n Chain2 Color:"+chain2.color+"\n Chain2 Price:"+chain2.price);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		type="Bronz";
		color="Brown";
		price=15000;
		Chain chain3=new Chain(type,color,price);
		System.out.println(" Chain3 Type:"+chain3.type+" \n Chain3 Color:"+chain3.color+"\n Chain3 Price:"+chain3.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		type="Diomond";
		color="Glassy Look";
		price=500000;
		Chain chain4=new Chain(type,color,price);
		System.out.println(" Chain4 Type:"+chain4.type+" \n Chain4 Color:"+chain4.color+"\n Chain4 Price:"+chain4.price);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		type="Silver";
		color="slverf";
		price=20000;
		Chain chain5=new Chain(type,color,price);
		System.out.println(" Chain4 Type:"+chain5.type+" \n Chain5 Color:"+chain5.color+"\n Chain5 Price:"+chain5.price);
	}
}