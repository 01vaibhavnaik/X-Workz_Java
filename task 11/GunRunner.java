class GunRunner{
	public static void main(String[] args){
		
		Gun gun=new Gun();
		gun.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun1=new Gun("AWM");
		gun1.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun2=new Gun("AK-47",8);
		gun2.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun3=new Gun("AWM-Sniper",60,2.5);
		gun3.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun4=new Gun("M416",10,2,"Black");
		gun4.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun5=new Gun("M762",20,2.3,"Green","Best");
		gun5.Display();
		
		System.out.println("==============================================================================");
		
		Gun gun6=new Gun("Machin-Gun",90,15,"Matt Black","Very Good","April");
		gun6.Display();
	}
}