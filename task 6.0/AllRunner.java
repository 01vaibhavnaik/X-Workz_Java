class AllRunner{
	public static void main(String[] args){
		
		String open="open the ladder";
		Ladder.open(open);
		
		int ladderNo=1;
		Ladder.LadderNo(ladderNo);
		
		char good='y';
		Ladder.LadderQuality(good);
		
		String declare="Yes";
		int mtrs=2;
		Ladder.stretch(declare,mtrs);
			
		boolean Declare=true;
		int LNO=5;
		Ladder.closes(Declare,LNO);
		
		String OName="Rishi";
		long PhNo=624826767;
		String add="bangalore";
		Ladder.owner(OName,PhNo,add);
		
		String check="broked";
		int no=2;
		String task="close";
		Ladder.close(check,no,task);
		
/////////////////////////////////////////////////////////////////////////////

		String open1="good";
		Paper.PaperQuality(open1);
		
		int pgNo=10;
		Paper.PageNo(pgNo);
		
		String qty="good";
		Paper.pageQuality(qty);
		
		String declare1="Yes";
		int date=4;
		Paper.pageExp(declare1,date);
			
		boolean Declares=true;
		String page="yes";
		Paper.paper(Declares,page);
		
		String OwName="vai";
		long PhNO=6248267;
		String address="bangalore";
		Paper.owner(OwName,PhNO,address);
		
		String Check="no";
		int No=2;
		String tore="yes";
		Paper.close(Check,No,tore);
		
		
//////////////////////////////////////////////////////////////////////////////////////
		
		String open2="good";
		Beer.BeerQuality(open2);
		
	    int BNo=5;
		Beer.BeerNo(BNo);
		
		qty="good";
		Beer.BeerQualitys(qty);
		
		declare1="No";
		date=4;
		Beer.BeerExp(declare1,date);
			
		Declares=true;
		String beer="yes";
		Beer.beer(Declares,beer);
		
		OwName="roah";
		PhNO=69648267;
		address="mangalore";
		Beer.beerowner(OwName,PhNO,address);
		
		Check="no";
		No=9;
		String beers="yes";
		Beer.closebeer(Check,No,beers);
		
		
//////////////////////////////////////////////////////////////////////////////////////

		open2="good";
		Dmart.DmartQuality(open2);
		
	    int DNo=25;
		Dmart.DmartLocNo(DNo);
		
		qty="good";
		Dmart.DmartProduct(qty);
		
		declare1="mon-sat";
		date=4;
		Dmart.Dmartdate(declare1,date);
			
		Declares=true;
		String prod="yes";
		Dmart.Dmart(Declares,prod);
		
		OwName="abhi";
		PhNO=696482377;
		address="goa";
		Dmart.Dmartowner(OwName,PhNO,address);
		
		String close="sun";
		No=8;
		String dmt="mon";
		Dmart.Dmartclose(close,No,dmt);
		
//////////////////////////////////////////////////////////////////////////////////////

		open2="good";
		FoodItems.FoodQuality(open2);
		
	    int FNo=7;
		FoodItems.FoodLoc(FNo);
		
		qty="good";
		FoodItems.FoodTypes(qty);
		
		declare1="mon-sat";
		date=4;
		FoodItems.FoodMFD(declare1,date);
			
		Declares=true;
		prod="yes";
		FoodItems.Food(Declares,prod);
		
		OwName="sohan";
		PhNO=696482377;
		address="mumbai";
		FoodItems.Foodowner(OwName,PhNO,address);
		
		close="sun";
		No=8;
		dmt="mon";
		FoodItems.Foodclose(close,No,dmt);
		
		
//////////////////////////////////////////////////////////////////////////////////////		
		
		open2="good";
		TeddyBear.BearQuality(open2);
		
	    int TNo=7;
		TeddyBear.BearLocNo(TNo);
		
		qty="good";
		TeddyBear.BearProduct(qty);
		
		declare1="mon-sat";
		date=4;
		TeddyBear.Beardate(declare1,date);
			
		Declares=true;
		prod="yes";
		TeddyBear.Bear(Declares,prod);
		
		OwName="kartik";
		PhNO=696482377;
		address="mumbai";
		TeddyBear.Bearowner(OwName,PhNO,address);
		
		close="sun";
		No=8;
		dmt="mon";
		TeddyBear.Bearclose(close,No,dmt);
		
	}

}