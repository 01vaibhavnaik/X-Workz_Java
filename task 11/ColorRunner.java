class ColorRunner{
	public static void main(String[] args){
		
		Color color=new Color();
		color.Display();
		
		System.out.println("==============================================================================");
		
		Color color1=new Color("CrimsonEdge");
		color1.Display();
		
		System.out.println("==============================================================================");
		
		Color color2=new Color("IndigoPulse",80);
		color2.Display();
		
		System.out.println("==============================================================================");
		
		Color color3=new Color("LavenderLuxe",70,25);
		color3.Display();
		
		System.out.println("==============================================================================");
		
		Color color4=new Color("TealTide",60,70,"Red");
		color4.Display();
		
		System.out.println("==============================================================================");
		
		Color color5=new Color("RubyRise",20,90,"Blue","Best");
		color5.Display();
		
		System.out.println("==============================================================================");
		
		Color color6=new Color("Olive Orbit",50,150,"Pink","Very Good","April");
		color6.Display();
	}
}
