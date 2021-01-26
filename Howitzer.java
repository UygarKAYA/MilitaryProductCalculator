package Project01;

public class Howitzer extends ArmouredForce{
	
	private String NameofAmmunition;
	private int NumberofAmmunition;
	private int GunneryRange;
		
	public Howitzer(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofArmoured, String MainGun, int NumberofCrew,String NameofAmmunition, int NumberofAmmunition,int GunneryRange) {
		super(Name,Manufacturer,Price,ProductBuyCount,TypeofArmoured,MainGun,NumberofCrew);
		this.NameofAmmunition=NameofAmmunition;
		if (NumberofAmmunition>0 && NumberofAmmunition<=50) 
			this.NumberofAmmunition = NumberofAmmunition;
		else {
			System.out.println("Note: Ammunition Count should be 0 to 50 & Avarage Ammunition Count is 30"+"\n--------------------------------------------------");
			this.NumberofAmmunition=30;
		}
		if (GunneryRange>=5 && GunneryRange<=70) // M-109 has a 70km Range, but Engineers study in order to increase the range such as 100 km and it is the max range in the world
			this.GunneryRange = GunneryRange;
		else {
			System.out.println("Note: Range should be 5 to 70 & Avarage Range is 40"+"\n--------------------------------------------------");
			this.GunneryRange=40;
		}
	}
	public Howitzer(String Name, double Price, int ProductBuyCount, int NumberofCrew) {
		super(Name,Price,ProductBuyCount,NumberofCrew);
		if (Name.equals("T-155 Fýrtýna") || Name.equals("T-155")) {
			this.setManufacturer("Ministry of National Defence - 1.Major Maintenance Factory");
			this.setMainGun("155 mm L-52");
			this.setNumberofCrew(5);
			this.setTypeofArmoured("Steel Armour Plate");
			this.NameofAmmunition="MKE MOD 274";
			this.NumberofAmmunition=48;
			this.GunneryRange=40;
		}
		else if (Name.equals("Yavuz") || Name.equals("Panter")) {
			this.setManufacturer("MKEK");
			this.setMainGun("155 mm L-39");
			this.setNumberofCrew(5);
			this.setTypeofArmoured("Steel Armour Plate");
			this.NameofAmmunition="M549A1 (RAP/HE)";
			this.NumberofAmmunition=18;
			this.GunneryRange=30;
		}
	}	
	
	public String getNameofAmmunition() {
		return NameofAmmunition;
	}

	public void setNameofAmmunition(String NameofAmmunition) {
		this.NameofAmmunition = NameofAmmunition;
	}
	
	public int getNumberofAmmunition() {
		return NumberofAmmunition;
	}

	public void setNumberofAmmunition(int NumberofAmmunition) {
		if (NumberofAmmunition>0 && NumberofAmmunition<=50)
			this.NumberofAmmunition = NumberofAmmunition;
		else {
			System.out.println("Note: Ammunition Count should be 0 to 50 & Avarage Ammunition Count is 30"+"\n--------------------------------------------------");
			this.NumberofAmmunition=30;
		}
	}

	public int getGunneryRange() {
		return GunneryRange;
	}

	public void setGunneryRange(int GunneryRange) {
		if (GunneryRange>=5 && GunneryRange<=70) // M-109 has a 70km Range, but Engineers study in order to increase the range such as 100 km and it is the max range in the world
			this.GunneryRange = GunneryRange;
		else {
			System.out.println("Note: Range should be 5 to 70 & Avarage Range is 40"+"\n--------------------------------------------------");
			this.GunneryRange=40;
		}
	}
	
	public String toString() {
		return super.toString()+"\nName of Ammunition: " + this.NameofAmmunition + "\nNumber of Ammunition: " + this.NumberofAmmunition
				+"\nRange: " + this.GunneryRange + " km" + "\nThis Military Product has been purchased " + getProductBuyCount() 
				+" times."+"\n--------------------------------------------------\nThe amount of Howitzer Price is "+this.CalculateTotal()+" $"+"\n--------------------------------------------------"+"\n--------------------------------------------------";
	}
}