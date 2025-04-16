class Station{
		static void send(String item){
		System.out.println("into station");
		DeliveryGuy.accept(item);
	}
}