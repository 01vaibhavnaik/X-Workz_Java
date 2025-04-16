class HoliRunner{
	public static void main(String[] args){
		
		Holi holi=new Holi();
		holi.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi1=new Holi("Blue");
		holi1.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi2=new Holi("Red",20);
		holi2.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi3=new Holi("Pink",50,"Powder");
		holi3.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi4=new Holi("Voilet",70,"Liquid","holi");
		holi4.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi5=new Holi("Bule",20,"Powder","holi",50);
		holi5.Display();
		
		System.out.println("==============================================================================");
		
		Holi holi6=new Holi("Green",60,"Powder","holi",90,"March");
		holi6.Display();
	}
}