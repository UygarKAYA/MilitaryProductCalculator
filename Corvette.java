package Project01;

public class Corvette extends NavyForce {
	
	private String BowGun; // Bow Gun --> Gemi Baþ Topu
	private String SSM;   // SSM ---> Surface to Surface Missile
	private boolean HelicopterDeck;
	
	public Corvette(String Name, String Manufacturer,double Price, int ProductBuyCount, String CombatSystem, int DisplacementTonnage,double Velocity, String BowGun, String SSM, boolean HelicopterDeck) {
		super(Name,Manufacturer,Price,ProductBuyCount,CombatSystem,DisplacementTonnage,Velocity);
		this.BowGun=BowGun;
		this.SSM=SSM;
		this.HelicopterDeck=HelicopterDeck;
	}

	public Corvette(String Name,double Price, int ProductBuyCount, double Velocity) {
		super(Name,Price,ProductBuyCount,Velocity);
		if (Name.endsWith("ada")) {
			this.setManufacturer("Istanbul Naval Shipyard");
			this.setCombatSystem("GENESÝS");
			this.setDisplacementTonnage(2300);
			this.setVelocity(29);
			this.BowGun="76 mm Oto Melara";
			this.SSM="Atmaca";
			this.HelicopterDeck=true;
		}
		else if (Name.startsWith("TCG B")) {
			this.setManufacturer("French Defence Industry");
			this.setCombatSystem("G-MSYS");
			this.setDisplacementTonnage(1325);
			this.setVelocity(23);
			this.BowGun="100 mm CADAM";
			this.SSM="Exocet";
			this.HelicopterDeck=false;
		}	
	}
	
	public String getBowGun() {
		return BowGun;
	}

	public void setBowGun(String BowGun) {
		this.BowGun = BowGun;
	}

	public String getSSM() {
		return SSM;
	}

	public void setSSM(String SSM) {
		this.SSM = SSM;
	}

	public boolean isHelicopterDeck() {
		return HelicopterDeck;
	}

	public void setHelicopterDeck(boolean HelicopterDeck) {
		this.HelicopterDeck = HelicopterDeck;
	}
	
	public String toString() {
		return super.toString() + "\nType of Bow Gun: " + this.BowGun + "\nName of SSM: " + this.SSM + "\nHelicopter Deck: " + this.HelicopterDeck + 
			   "\nThis Military Product has been purchased " + getProductBuyCount()+" times."
			   +"\n--------------------------------------------------\nThe amount of Corvette Price is "+this.CalculateTotal(getName(),getManufacturer(),getPrice(),getProductBuyCount())+" $"+"\n--------------------------------------------------";
	}
}