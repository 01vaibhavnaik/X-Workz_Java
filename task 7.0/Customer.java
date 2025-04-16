class Customer{
	public static void buy(String vegetable, int quality){
		System.out.println("Run Customer");
		Shop.sell(vegetable,quality);
	}
}