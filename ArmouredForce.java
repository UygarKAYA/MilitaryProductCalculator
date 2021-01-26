package Project01;

public class ArmouredForce extends MilitaryProduct {
	
	private String TypeofArmoured;
	private String MainGun;
	private int NumberofCrew;
	
	public ArmouredForce(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofArmoured, String MainGun, int NumberofCrew) {
		super(Name,Manufacturer,Price,ProductBuyCount);
		this.TypeofArmoured=TypeofArmoured;
		this.MainGun=MainGun;
		if (NumberofCrew>0 && NumberofCrew<=13) 
			this.NumberofCrew = NumberofCrew;
		else { 
			System.out.println("Note: Number of Crew should be 1 to 13"+"\n--------------------------------------------------");
			this.NumberofCrew=0;
		}
	}

	public ArmouredForce(String Name, double Price, int ProductBuyCount,int NumberofCrew) {
		super(Name,Price,ProductBuyCount);
		if (NumberofCrew>0 && NumberofCrew<=13) 
			this.NumberofCrew = NumberofCrew;
		else { 
			System.out.println("Note: Number of Crew should be 1 to 13"+"\n--------------------------------------------------");
			this.NumberofCrew=0;
		}
	}
	
	public String getTypeofArmoured() {
		return TypeofArmoured;
	}

	public void setTypeofArmoured(String TypeofArmoured) {
		this.TypeofArmoured = TypeofArmoured;
	}

	public String getMainGun() {
		return MainGun;
	}

	public void setMainGun(String MainGun) {
		this.MainGun = MainGun;
	}

	public int getNumberofCrew() {
		return NumberofCrew;
	}

	public void setNumberofCrew(int NumberofCrew) {
		if (NumberofCrew>0 && NumberofCrew<=13) 
			this.NumberofCrew = NumberofCrew;
		else { 
			System.out.println("Note: Number of Crew should be 1 to 13"+"\n--------------------------------------------------");
			this.NumberofCrew=0;
		}
	}
	
	public String toString() {
		return super.toString()+"\nNumber of Crew: "+this.NumberofCrew+"\nType of Armour: "+this.TypeofArmoured+"\nMain Gun: " + this.MainGun;		
	}
}