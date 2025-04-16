class Doctor{
	public static void treatment(String patientname,int age){
	System.out.println("Run Doctor");
	System.out.println(age);
	Nurse.assist(patientname);
	}
}