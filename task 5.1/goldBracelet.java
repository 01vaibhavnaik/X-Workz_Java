class goldBracelet{
	public static void braceletQuality(){
		System.out.println("Method 25");
	}
	public static void braceletColor(){
		System.out.println("Method 26");
	}
	public static void braceletDetails(){
		braceletQuality();
		braceletColor();
		silverBracelet.braceletQuality();
		silverBracelet.braceletColor();
	}
}