class BakeryRunner{
	public static void main(String[] args){
		String itemname="cake";
		int quant=4;
		Bakery.buy(itemname,quant);
		
		boolean yn=true;
		Bakery.open(yn);
		
		boolean ny=false;
		Bakery.open(ny);
		
		String name="Rishi";
		Bakery.owner(name);
		
		String cname="vaibhav";
		Bakery.cashier(cname);
	}
}