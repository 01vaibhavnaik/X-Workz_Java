class PrintCountryName{
	public static void Print(){
		String[] Name={"INDIA","Australia","Antarctic","Europe","New Zeland","RUSSIA","Africa"};
		for(String name:Name){
			//name.endsWith("A")||name.endsWith("a")
			if(name.charAt(name.length()-1)=='a'||name.charAt(name.length()-1)=='A'){
			   System.out.println(name);
			}
		}
	}
	
}

class PrintCountry{
	public static void main(String[] args){
		PrintCountryName.Print();
	}
}