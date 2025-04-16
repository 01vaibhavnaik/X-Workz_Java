class BucketRunner{
	public static void main(String[] args){
		
		Bucket bucket=new Bucket();
		bucket.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket1=new Bucket("Plastic");
		bucket1.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket2=new Bucket("Metal",800);
		bucket2.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket3=new Bucket("Plastic",500,'M');
		bucket3.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket4=new Bucket("Fiber",700,'L',"White");
		bucket4.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket5=new Bucket("Carbon",20000,'S',"Blue","Best");
		bucket5.Display();
		
		System.out.println("==============================================================================");
		
		Bucket bucket6=new Bucket("Aluminium",6000,'M',"Silver","Very Good","November");
		bucket6.Display();
	}
}
