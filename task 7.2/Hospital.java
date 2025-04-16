class Hospital{
	public static void checkUp(String patientname,int age,long phNo,String email,String sickness){
	System.out.println("Run Hospital");
	System.out.println(phNo);
	System.out.println(email);
	System.out.println(sickness);
	Doctor.treatment(patientname,age);
	}
}