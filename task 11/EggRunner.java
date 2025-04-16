class EggRunner{
	public static void main(String[] args){
		
		Egg egg=new Egg();
		egg.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg1=new Egg("Hen");
		egg1.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg2=new Egg("PeaHen",200);
		egg2.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg3=new Egg("Penguin",5000,15);
		egg3.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg4=new Egg("Sparrow",70,5,"White");
		egg4.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg5=new Egg("Robin",200,7,"Yellow","Good");
		egg5.Display();
		
		System.out.println("==============================================================================");
		
		Egg egg6=new Egg("Ostrich",6000,25,"White","Good","November");
		egg6.Display();
	}
}