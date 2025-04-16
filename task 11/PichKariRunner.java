class PichKariRunner{
	public static void main(String[] args){
		
		PichKari pichkari=new PichKari();
		pichkari.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari1=new PichKari("Red");
		pichkari1.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari2=new PichKari("Blue",200);
		pichkari2.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari3=new PichKari("Pink",500,"Plastic");
		pichkari3.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari4=new PichKari("Voilet",70,"Metal","Pichkari");
		pichkari4.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari5=new PichKari("Bule",200,"Plastic","Pichkari",40);
		pichkari5.Display();
		
		System.out.println("==============================================================================");
		
		PichKari pichkari6=new PichKari("Green",600,"Metal","pichkari",90,"500 ml");
		pichkari6.Display();
	}
}