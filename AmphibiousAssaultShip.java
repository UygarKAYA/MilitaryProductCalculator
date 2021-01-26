package Project01;

public class AmphibiousAssaultShip extends NavyForce {
	
	// Amphibious Assault Ship Duty is Amphibious Landing Operation;therefore, they have Fighter Plane, Tanks or Armour Personnel Vehicle and LCM.
	private int NumberOfF35B;  // F-35 B Model has a VTOL Technology, VTOL ---> Vertical Take off
	private int NumberOfZAHA; // ZAHA ---> Armour Amphibious Attack Vehicle
	private int NumberOfLCM; // LCM ---> Landing Craft Mechanized
	
	public AmphibiousAssaultShip(String Name, String Manufacturer,double Price, int ProductBuyCount, String CombatSystem, int DisplacementTonnage, double Velocity, int NumberOfF35B, int NumberOfZAHA, int NumberOfLCM) {
		super(Name, Manufacturer,Price, ProductBuyCount, CombatSystem, DisplacementTonnage, Velocity);
		if (NumberOfF35B>=0 && NumberOfF35B<=6)
			this.NumberOfF35B=NumberOfF35B;
		else {
			System.out.println("Note: Number of F-35B should be 0 to 6 & Average F-35B Number is 3"+"\n--------------------------------------------------");
			this.NumberOfF35B=3;
		}
		if (NumberOfZAHA>=0 && NumberOfZAHA<=27)
			this.NumberOfZAHA=NumberOfZAHA;
		else {
			System.out.println("Note: Number of ZAHA should be 0 to 27 & Average ZAHA Number is 12"+"\n--------------------------------------------------");
			this.NumberOfZAHA=12;
		}	
		if (NumberOfLCM>=0 && NumberOfLCM<=4)
			this.NumberOfLCM=NumberOfLCM;
		else {
			System.out.println("Note: Number of LCM should be 0 to 4 & Average LCM Number is 2"+"\n--------------------------------------------------");
			this.NumberOfLCM=2;
		}	
	}
	
	public AmphibiousAssaultShip(String Name, double Price, int ProductBuyCount, double Velocity, int NumberOfF35B, int NumberOfZAHA, int NumberOfLCM) {
		super(Name,Price,ProductBuyCount,Velocity);
		if (Name.equals("TCG Anadolu") || Name.equals("TCG Trakya") || Name.equals("L-401") || Name.equals("L-402")) {
			this.setManufacturer("SEDEF Shipyard");
			this.setCombatSystem("ADVENT");
			this.setDisplacementTonnage(28000);
			this.setVelocity(21);
		}	
		if (NumberOfF35B>=0 && NumberOfF35B<=6) 
			this.NumberOfF35B=NumberOfF35B;	
		else {
			System.out.println("Note: Number of F-35B should be 0 to 6 & Average F-35B Number is 3"+"\n--------------------------------------------------");
			this.NumberOfF35B=3;
		}
		if (NumberOfZAHA>=0 && NumberOfZAHA<=27)
			this.NumberOfZAHA=NumberOfZAHA;
		else {
			System.out.println("Note: Number of ZAHA should be 0 to 27 & Average ZAHA Number is 12"+"\n--------------------------------------------------");
			this.NumberOfZAHA=12;
		}	
		if (NumberOfLCM>=0 && NumberOfLCM<=4)
			this.NumberOfLCM=NumberOfLCM;
		else {
			System.out.println("Note: Number of LCM should be 0 to 4 & Average LCM Number is 2"+"\n--------------------------------------------------");
			this.NumberOfLCM=2;	
		}	
	}
	
	public int getNumberOfF35() {
		return NumberOfF35B;
	}
	
	public void setNumberOfF35(int NumberOfF35B) {
		if (NumberOfF35B>=0 && NumberOfF35B<=6)
			this.NumberOfF35B=NumberOfF35B;
		else {
			System.out.println("Note: Number of F-35B should be 0 to 6 & Average F-35B Number is 3"+"\n--------------------------------------------------");
			this.NumberOfF35B=3;
		}
	}
	
	public int getNumberOfZAHA() {
		return NumberOfZAHA;
	}

	public void setNumberOfZAHA(int NumberOfZAHA) {
		if (NumberOfZAHA>=0 && NumberOfZAHA<=27)
			this.NumberOfZAHA=NumberOfZAHA;
		else {
			System.out.println("Note: Number of ZAHA should be 0 to 27 & Average ZAHA Number is 12"+"\n--------------------------------------------------");
			this.NumberOfZAHA=12;
		}	
	}

	public int getNumberOfLCM() {
		return NumberOfLCM;
	}

	public void setNumberOfLCM(int NumberOfLCM) {
		if (NumberOfLCM>=0 && NumberOfLCM<=4)
			this.NumberOfLCM=NumberOfLCM;
		else {
			System.out.println("Note: Number of LCM should be 0 to 4 & Average LCM Number is 2"+"\n--------------------------------------------------");
			this.NumberOfLCM=2;
		}	
	}
	
	public String toString() {
		return super.toString() + "\nNumber of F-35B: " + this.NumberOfF35B + "\nNumber of ZAHA: " + this.NumberOfZAHA 
			   + "\nNumber of LCM: " + this.NumberOfLCM + "\nThis Military Product has been purchased " + getProductBuyCount() + " times. "
			   		+ "\n--------------------------------------------------\nThe amount of Amphibious Assault Ship Price is " +this.CalculateTotal(getManufacturer(),getPrice(),getProductBuyCount())+" $"+"\n--------------------------------------------------"; 
	}		   
}