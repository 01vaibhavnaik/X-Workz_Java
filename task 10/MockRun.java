class Mock{
	
	
	public  void mockIntrn(){
		System.out.println("non-static method");
		mock();
	}
	
	static void mock(){
		System.out.println("static method");
	}
	
}
class MockRun{
	public static void main(String[] args){
		Mock mock=new Mock();
		System.out.println(mock);
		
	}
}