class FestivalRunner{
	
	public static void main(String[] args){
		String name="Holi";
		int time=2;
		String date="14/03/25";
		Festival festival1=new Festival(name,time,date);
		System.out.println(" Festival1 Name:"+festival1.name+" \n Festival1 Timeing:"+festival1.time+"\n Festival1 Date:"+festival1.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Carnival";
		time=10;
		date="25/03/25";
		Festival festival2=new Festival(name,time,date);
		System.out.println(" Festival2 Name:"+festival2.name+" \n Festival2 Timeing:"+festival2.time+"\n Festival2 Date:"+festival2.date);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Ganesh Chaturti";
		time=11;
		date="25/05/25";
		Festival festival3=new Festival(name,time,date);
		System.out.println(" Festival3 Name:"+festival3.name+" \n Festival3 Timeing:"+festival3.time+"\n Festival3 Date:"+festival3.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Diwali";
		time=1;
		date="2/10/25";
		Festival festival4=new Festival(name,time,date);
		System.out.println(" Festival4 Name:"+festival4.name+" \n Festival4 Timeing:"+festival4.time+"\n Festival4 Date:"+festival4.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Christmas";
		time=1;
		date="2/12/25";
		Festival festival5=new Festival(name,time,date);
		System.out.println(" Festival4 Name:"+festival5.name+" \n Festival5 Timeing:"+festival5.time+"\n Festival5 Date:"+festival5.date);
	}
}