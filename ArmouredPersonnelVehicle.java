package Project01;

public class ArmouredPersonnelVehicle extends ArmouredForce {
	
	private boolean isAmphibious;
	private int NumberofSmokeLauncer;
	
	public ArmouredPersonnelVehicle(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofArmoured, String MainGun, int NumberofCrew, boolean isAmphibious, int NumberofSmokeLauncer) {
		super(Name,Manufacturer,Price,ProductBuyCount,TypeofArmoured,MainGun,NumberofCrew);
		this.isAmphibious=isAmphibious;
		if (NumberofSmokeLauncer>0 && NumberofSmokeLauncer<=30)
			this.NumberofSmokeLauncer=NumberofSmokeLauncer;
		else {
			System.out.println("Note: Number of Smoke should be 0 to 30 & Avarage Number of Smoke is 12"+"\n--------------------------------------------------");
			this.NumberofSmokeLauncer=12;
		}
	}
	
	public ArmouredPersonnelVehicle(String Name, double Price, int ProductBuyCount, int NumberofCrew) {
		super(Name,Price,ProductBuyCount,NumberofCrew);
		if (Name.startsWith("PARS") || Name.startsWith("ZMA")) {
			this.setManufacturer("FNSS");
			if (Name.startsWith("PARS")) {
				this.setTypeofArmoured("STANAG 7162");
				this.setMainGun("25 mm SEBER");
				this.NumberofSmokeLauncer=24;
			}	
			else if (Name.startsWith("ZMA")) {
				this.setTypeofArmoured("Balistic Aluminium Plete");
				this.setMainGun("25 mm NEFER");
				this.NumberofSmokeLauncer=12;
			}
			this.isAmphibious=true;
		}
		
		else if (Name.startsWith("Cobra")) {
			this.setManufacturer("OTOKAR");
			this.setTypeofArmoured("Balistic Aluminium Plete");
			this.setMainGun("7.62 mm SARP");
			this.NumberofSmokeLauncer=10;
			this.isAmphibious=true;
		}
		else if (Name.startsWith("Kirpi 2")) {
			this.setManufacturer("BMC");
			this.setTypeofArmoured("STANAG 4569");
			this.setMainGun("7.62 mm SARP");
			this.NumberofSmokeLauncer=14;
			this.isAmphibious=false;
		}
	}
	
	public boolean isAmphibious() {
		return isAmphibious;
	}

	public void setAmphibious(boolean isAmphibious) {
		this.isAmphibious = isAmphibious;
	}

	public int getNumberofSmokeLauncer() {
		return NumberofSmokeLauncer;
	}

	public void setNumberofSmokeLauncer(int NumberofSmokeLauncer) {
		if (NumberofSmokeLauncer>0 && NumberofSmokeLauncer<=30)
			this.NumberofSmokeLauncer=NumberofSmokeLauncer;
		else {
			System.out.println("Note: Number of Smoke should be 0 to 30 & Avarage Number of Smoke is 12"+"\n--------------------------------------------------");
			this.NumberofSmokeLauncer=12;
		}
	}
	
	public String toString() {
		return super.toString()+"\nNumber of Smoke Launcer: " + this.NumberofSmokeLauncer + "\nIs Amphibious: " + this.isAmphibious
				+ "\nThis Military Product has been purchased "+ getProductBuyCount()+" times."
				+"\n--------------------------------------------------\nThe amount of Armoured Personnel Vehicle Price is " 
				+ this.CalculateTotal()+" $"+"\n--------------------------------------------------";
	}
}