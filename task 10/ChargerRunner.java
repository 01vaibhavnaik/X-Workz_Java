class ChargerRunner{
	
	public static void main(String[] args){
		String cmpName="Anker";
		String brand="Anker PowerPort";
		int watts=25;
		Charger charger1=new Charger(cmpName,brand,watts);
		System.out.println(" Charger1 Compony Name:"+charger1.cmpName+" \n Charger1 Brand:"+charger1.brand+"\n Charger1 Watts:"+charger1.watts);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		cmpName="Belkin";
		brand="Belkin BoostCharger";
		watts=40;
		Charger charger2=new Charger(cmpName,brand,watts);
		System.out.println(" Charger2 Compony Name:"+charger2.cmpName+" \n Charger2 Brand:"+charger2.brand+"\n Charger2 Watts:"+charger2.watts);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		cmpName="Xiomi";
		brand="MI Turbo Charger";
		watts=150;
		Charger charger3=new Charger(cmpName,brand,watts);
		System.out.println(" Charger3 Compony Name:"+charger3.cmpName+" \n Charger3 Brand:"+charger3.brand+"\n Charger3 Watts:"+charger3.watts);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		cmpName="OnePlus";
		brand="OnePlus Wrap Charger";
		watts=50;
		Charger charger4=new Charger(cmpName,brand,watts);
		System.out.println(" Charger4 Compony Name:"+charger4.cmpName+" \n Charger4 Brand:"+charger4.brand+"\n Charger4 Watts:"+charger4.watts);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		cmpName="Apple";
		brand="Mega Safe";
		watts=20;
		Charger charger5=new Charger(cmpName,brand,watts);
		System.out.println(" Charger4 Compony Name:"+charger5.cmpName+" \n Charger5 Brand:"+charger5.brand+"\n Charger5 Watts:"+charger5.watts);
	}
}