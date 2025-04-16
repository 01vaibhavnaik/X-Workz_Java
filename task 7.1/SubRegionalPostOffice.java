class SubRegionalPostOffice{
	public static void delivers(String customername, String address){
		System.out.println("Run SubRegionalPostOffice");
		RegionalPostOffice.deliver(customername,address);
		
	}
}