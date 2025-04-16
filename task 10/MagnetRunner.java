class MagnetRunner{
	
	public static void main(String[] args){
		//
		Magnet magnet1=new Magnet("Round","Green");
		System.out.println(" Magnet1 Shape: "+magnet1.magnetShape+"  \n Magnet1 Color:"+magnet1.magnetColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		 
		
		String magnetShape="Oval";
		String magnetColor="White";
		Magnet magnet2=new Magnet(magnetShape,magnetColor);
		System.out.println(" Magnet2 Magnet Shape:"+magnet2.magnetShape+" \n Magnet2 Magnet Color:"+magnet2.magnetColor);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		magnetShape="Square";
		magnetColor="Green";
		Magnet magnet3=new Magnet(magnetShape,magnetColor);
		System.out.println(" Magnet3 Magnet Shape:"+magnet3.magnetShape+" \n Magnet3 Magnet Color:"+magnet3.magnetColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		magnetShape="Triangular";
		magnetColor="Purple";
		Magnet magnet4=new Magnet(magnetShape,magnetColor);
		System.out.println(" Magnet4 Magnet Shape:"+magnet4.magnetShape+" \n Magnet4 Magnet Color:"+magnet4.magnetColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		magnetShape="Round";
		magnetColor="Black";
		Magnet magnet5=new Magnet(magnetShape,magnetColor);
		System.out.println(" Magnet4 Magnet Shape:"+magnet5.magnetShape+" \n Magnet5 Magnet Color:"+magnet5.magnetColor);
	}
}