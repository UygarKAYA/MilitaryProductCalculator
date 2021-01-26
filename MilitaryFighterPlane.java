package Project01;

public class MilitaryFighterPlane extends AirForce {
	
	/*
	Type of Missile
 	AAM ---> Air to Air Missile 
	ALM ---> Air to Land Missile
	ASM ---> Air to Surface Missile
	*/
	
	private String MissileName;
	private String TypeofMissile;
	private int NumberofMissile;
	
	public MilitaryFighterPlane(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofEngine, int Altitude, int FlightRange,  String MissileName, String TypeofMissile, int NumberofMissile) {
		super(Name,Manufacturer,Price,ProductBuyCount,TypeofEngine,Altitude,FlightRange);
		this.MissileName=MissileName;
		this.TypeofMissile=TypeofMissile;
		if (NumberofMissile>0 && NumberofMissile<=16)
			this.NumberofMissile=NumberofMissile;
		else {
			System.out.println("Note: Number of Missile should be 0 to 16 & Average number of Missile is 8"+"\n--------------------------------------------------");
			this.NumberofMissile=8;
		}
	}
	
	public MilitaryFighterPlane(String Name, double Price, int ProductBuyCount, int FlightRange,int Altitude, String MissileName, int NumberofMissile) {
		super(Name,Price,ProductBuyCount,FlightRange,Altitude);
		if (Name.equals("F-16") || Name.equals("F16")) {
			this.setManufacturer("Lockheed Martin");
			this.setTypeofEngine("Turbojet");
			this.setAltitude(50000);
			this.setFlightRange(4220);
		}
		else if (Name.equals("F-4") || Name.equals("F4")) {
			this.setManufacturer("McDonnell Douglas");
			this.setTypeofEngine("Turbojet");
			this.setAltitude(60000);
			this.setFlightRange(2888);
		}
		else if (Name.equals("TF-X") || Name.equals("MMU")) {
			this.setManufacturer("TUSAÞ");
			this.setTypeofEngine("Turbojet");
			this.setAltitude(55000);
			this.setFlightRange(4800);
		}
		this.MissileName=MissileName;
		if (MissileName.startsWith("SOM") || MissileName.startsWith("MK") || MissileName.startsWith("AGM"))
			this.TypeofMissile="Air to Land Missile";
		else if (MissileName.equals("Harpoon") || MissileName.equals("Atmaca")) 
			this.TypeofMissile="Air to Surface Missile";
		if (Name.equals("TF-X") || Name.equals("MMU")) {
			 if (MissileName.endsWith("doðan") || MissileName.startsWith("AIM") || MissileName.equals("ASRAAM"))
				 	this.TypeofMissile="Air to Air Missile";
		}
		if (Name.equals("F-4") || Name.equals("F4")) {
			if (MissileName.endsWith("doðan") || MissileName.startsWith("AIM") || MissileName.equals("20 mm Vulcan"))
					this.TypeofMissile="Air to Air Missile";
		}
		if (Name.equals("F-16") || Name.equals("F16")) {
			if (MissileName.endsWith("doðan") || MissileName.startsWith("AIM"))
					this.TypeofMissile="Air to Air Missile";
		}
		if (NumberofMissile>0 && NumberofMissile<=16)
			this.NumberofMissile=NumberofMissile;
		else {
			System.out.println("Note: Number of Missile should be 0 to 16 & Average number of Missile is 8"+"\n--------------------------------------------------");
			this.NumberofMissile=8;
		}
	}

	public String getMissileName() {
		return MissileName;
	}

	public void setMissileName(String MissileName) {
		this.MissileName = MissileName;
	}

	public String getTypeofMissile() {
		return TypeofMissile;
	}

	public void setTypeofMissile(String TypeofMissile) {
		this.TypeofMissile = TypeofMissile;
	}

	public int getNumberofMissile() {
		return NumberofMissile;
	}
	
	public void setNumberofMissile(int NumberofMissile) {
		if (NumberofMissile>=0 && NumberofMissile<=16)
			this.NumberofMissile=NumberofMissile;
		else {
			System.out.println("Note: Number of Missile should be 0 to 16 & Average number of Missile is 8"+"\n--------------------------------------------------");
			this.NumberofMissile=8;
		}
	}
	
	public void setAltitude(int Altitude) {
		if (Altitude>0 && Altitude<=100000) 
			super.getAltitude();
		else {
			System.out.println("--------------------------------------------------\nNote: Military Fighter PLane Altitude can be maximum 100.000 ft");
			super.setAltitude(0);
		}
	}
	
	public String toString() {
		return super.toString()+"\nName of Missile: " + this.MissileName + "\nType of Missile: " + this.TypeofMissile + "\nNumber of Missile: " + this.NumberofMissile 
			   +"\nThis Military Product has been purchased " + getProductBuyCount() + " times."
				+"\n--------------------------------------------------\nThe amount of Military Fighter Plane Price is "+this.CalculateTotal(getPrice(),getProductBuyCount())+" $"+"\n--------------------------------------------------";
	}
}