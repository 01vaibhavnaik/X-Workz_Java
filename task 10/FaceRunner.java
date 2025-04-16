class FaceRunner{
	
	public static void main(String[] args){
		String faceShape="Round";
		String faceColor="Dark";
		Face face1=new Face(faceShape,faceColor);
		System.out.println(" Face1 Face Shape:"+face1.faceShape+" \n Face1 Face Color:"+face1.faceColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		faceShape="Oval";
		faceColor="Fair";
		Face face2=new Face(faceShape,faceColor);
		System.out.println(" Face2 Face Shape:"+face2.faceShape+" \n Face2 Face Color:"+face2.faceColor);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		faceShape="Square";
		faceColor="Dark Chocolate";
		Face face3=new Face(faceShape,faceColor);
		System.out.println(" Face3 Face Shape:"+face3.faceShape+" \n Face3 Face Color:"+face3.faceColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		faceShape="Triangular";
		faceColor="White";
		Face face4=new Face(faceShape,faceColor);
		System.out.println(" Face4 Face Shape:"+face4.faceShape+" \n Face4 Face Color:"+face4.faceColor);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		faceShape="Round";
		faceColor="Fair";
		Face face5=new Face(faceShape,faceColor);
		System.out.println(" Face4 Face Shape:"+face5.faceShape+" \n Face5 Face Color:"+face5.faceColor);
	}
}