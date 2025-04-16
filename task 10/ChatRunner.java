class ChatRunner{
	
	public static void main(String[] args){
		String name="Chaitanya";
		int message=2;
		String date="14/03/25";
		Chat chat1=new Chat(name,message,date);
		System.out.println(" Chat1 Name:"+chat1.name+" \n Chat1 Timeing:"+chat1.message+"\n Chat1 Date:"+chat1.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Roshan";
		message=10;
		date="2/03/25";
		Chat chat2=new Chat(name,message,date);
		System.out.println(" Chat2 Name:"+chat2.name+" \n Chat2 Timeing:"+chat2.message+"\n Chat2 Date:"+chat2.date);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Rishi";
		message=12;
		date="25/01/25";
		Chat chat3=new Chat(name,message,date);
		System.out.println(" Chat3 Name:"+chat3.name+" \n Chat3 Timeing:"+chat3.message+"\n Chat3 Date:"+chat3.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Omkar";
		message=1;
		date="12/03/25";
		Chat chat4=new Chat(name,message,date);
		System.out.println(" Chat4 Name:"+chat4.name+" \n Chat4 Timeing:"+chat4.message+"\n Chat4 Date:"+chat4.date);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Mom";
		message=0;
		date="2/02/25";
		Chat chat5=new Chat(name,message,date);
		System.out.println(" Chat4 Name:"+chat5.name+" \n Chat5 Timeing:"+chat5.message+"\n Chat5 Date:"+chat5.date);
	}
}