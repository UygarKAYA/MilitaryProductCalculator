package Project01;

public class NavyForce extends MilitaryProduct {
	
	private String CombatSystem;
	private int DisplacementTonnage;
	private double Velocity;
	
	public NavyForce(String Name, String Manufacturer,double Price, int ProductBuyCount, String CombatSystem, int DisplacementTonnage, double Velocity) {
		super(Name,Manufacturer,Price,ProductBuyCount);
		this.CombatSystem=CombatSystem;
		this.DisplacementTonnage=DisplacementTonnage;
		if (Velocity>=0 && Velocity<=62)
			this.Velocity = Velocity;
		else 
			System.out.println("Note: Velocity should be 0 to 62"+"\n--------------------------------------------------");
	}
	
	public NavyForce(String Name, double Price, int ProductBuyCount, double Velocity) { 
		super(Name,Price,ProductBuyCount);
		if (Velocity>=0 && Velocity<=62)
			this.Velocity = Velocity;
		else 
			System.out.println("Note: Velocity should be 0 to 62"+"\n--------------------------------------------------");
	}
	
	public String getCombatSystem() {
		return CombatSystem;
	}

	public void setCombatSystem(String CombatSystem) {
		this.CombatSystem = CombatSystem;
	}

	public int getDisplacementTonnage() {
		return DisplacementTonnage;
	}

	public void setDisplacementTonnage(int DisplacementTonnage) {
		this.DisplacementTonnage = DisplacementTonnage;
	}

	public double getVelocity() {
		return Velocity;
	}
	
	public void setVelocity(double Velocity) {
		if (Velocity>=0 && Velocity<=62)
			this.Velocity = Velocity;
		else 
			System.out.println("Note: Velocity should be 0 to 62"+"\n--------------------------------------------------");
	}
		
	public String toString() {
		return super.toString() + "\nDisplacement: " + this.DisplacementTonnage + " ton"  + "\nVelocity: " + this.Velocity + " kts"
			   + "\nCombat Management System: " + this.CombatSystem;
	}
}