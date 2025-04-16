class NailPolishRunner{
	public static void main(String[] args){
		
		NailPolish nailpolish=new NailPolish();
		nailpolish.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish1=new NailPolish("OPI");
		nailpolish1.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish2=new NailPolish("Essie",8);
		nailpolish2.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish3=new NailPolish("Chanel",7,25);
		nailpolish3.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish4=new NailPolish("Zoya",6,70,"Dark Red");
		nailpolish4.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish5=new NailPolish("Revlon",2,250,"Coffee","Best");
		nailpolish5.Display();
		
		System.out.println("==============================================================================");
		
		NailPolish nailpolish6=new NailPolish("Sally Hansen",9,150,"Light Pink","Very Good","August");
		nailpolish6.Display();
	}
}
