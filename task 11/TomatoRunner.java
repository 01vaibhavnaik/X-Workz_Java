class TomatoRunner{
	public static void main(String[] args){
		
		Tomato tomato=new Tomato();
		tomato.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato1=new Tomato("Goa");
		tomato1.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato2=new Tomato("Bangalore",3);
		tomato2.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato3=new Tomato("Mangalore",6,250);
		tomato3.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato4=new Tomato("Pune",7,200,"Red");
		tomato4.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato5=new Tomato("Goa",2,60,"Red","Best");
		tomato5.Display();
		
		System.out.println("==============================================================================");
		
		Tomato tomato6=new Tomato("Kerala",5,70,"Green","Very Good","November");
		tomato6.Display();
	}
}
