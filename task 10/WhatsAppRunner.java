class WhatsAppRunner{
	
	public static void main(String[] args){
		String name="Chaitanya";
		long phNumber=456789876;
		WhatsApp whatsapp1=new WhatsApp(name,phNumber);
		System.out.println(" WhatsApp1 Name:"+whatsapp1.name+" \n WhatsApp1 Phone Number:"+whatsapp1.phNumber);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Mom";
		phNumber=287653450;
		WhatsApp whatsapp2=new WhatsApp(name,phNumber);
		System.out.println(" WhatsApp2 Name:"+whatsapp2.name+" \n WhatsApp2 Phone Number:"+whatsapp2.phNumber);

		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Roshan";
		phNumber=59876578;
		WhatsApp whatsapp3=new WhatsApp(name,phNumber);
		System.out.println(" WhatsApp3 Name:"+whatsapp3.name+" \n WhatsApp3 Phone Number:"+whatsapp3.phNumber);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Deepak";
		phNumber=963567890;
		WhatsApp whatsapp4=new WhatsApp(name,phNumber);
		System.out.println(" WhatsApp4 Name:"+whatsapp4.name+" \n WhatsApp4 Phone Number:"+whatsapp4.phNumber);
		
		System.out.println("--------------------------------------------------------------\n--------------------------------------------------------------");
		
		name="Rishi";
		phNumber=87654250;
		WhatsApp whatsapp5=new WhatsApp(name,phNumber);
		System.out.println(" WhatsApp4 Name:"+whatsapp5.name+" \n WhatsApp5 Phone Number:"+whatsapp5.phNumber);
	}
}