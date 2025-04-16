class WatterBallRunner{
	public static void main(String[] args){
		
		WatterBall watterBall=new WatterBall();
		watterBall.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall1=new WatterBall("Round");
		watterBall1.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall2=new WatterBall("Circular",30);
		watterBall2.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall3=new WatterBall("Oval",60,250);
		watterBall3.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall4=new WatterBall("Round",100,200,"Blue");
		watterBall4.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall5=new WatterBall("ShapeLess",200,250,"Red","Best");
		watterBall5.Display();
		
		System.out.println("==============================================================================");
		
		WatterBall watterBall6=new WatterBall("Heart",90,200,"Green","Very Good","March");
		watterBall6.Display();
	}
}