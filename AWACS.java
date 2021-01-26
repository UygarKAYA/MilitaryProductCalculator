package Project01;

public class AWACS extends AirForce {
	
	// AWACS --> Airborne Warning And Control System
	private String TypeofRadar;
	private int RangeofRadar;
	private int NumberofTarget;
	
	public AWACS(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofEngine, int Altitude, int FlightRange, String TypeofRadar, int RangeofRadar,int NumberofTarget) {
		super(Name,Manufacturer,Price,ProductBuyCount,TypeofEngine,Altitude,FlightRange);
		this.TypeofRadar=TypeofRadar;
		this.RangeofRadar=RangeofRadar;
		this.NumberofTarget=NumberofTarget;
	}
	
	public AWACS(String Name, double Price, int ProductBuyCount, String TypeofEngine, int Altitude,int FlightRange) {
		super(Name,Price,ProductBuyCount,TypeofEngine,Altitude,FlightRange);
		if (Name.equals("Hava SOJ")) {
			this.setManufacturer("TUSAŞ and ASELSAN");
			this.setTypeofEngine("Turbofan");
			this.setAltitude(51000);
			this.setFlightRange(8800);
			this.TypeofRadar="AESA";
			this.RangeofRadar=450;
			this.NumberofTarget=2500;
		}
		
		else if (Name.equals("Barış Kartalı") || Name.equals("HIK") || Name.equals("E-7")) {
			this.setManufacturer("Boeing");
			this.setTypeofEngine("Turbofan");
			this.setAltitude(41000);
			this.setFlightRange(5665);
			this.TypeofRadar="MESA";
			this.RangeofRadar=400;
			this.NumberofTarget=1500;
		}
	}
	
	public String getTypeofRadar() {
		return TypeofRadar;
	}

	public void setTypeofRadar(String TypeofRadar) {
		this.TypeofRadar = TypeofRadar;
	}

	public int getRangeofRadar() {
		return RangeofRadar;
	}

	public void setRangeofRadar(int RangeofRadar) {
		this.RangeofRadar = RangeofRadar;
	}

	public int getNumberofTarget() {
		return NumberofTarget;
	}

	public void setNumberofTarget(int NumberofTarget) {
		this.NumberofTarget = NumberofTarget;
	}
	
	public void setAltitude(int Altitude) {
		if (Altitude>0 && Altitude<=60000) 
			super.getAltitude();
		else {
			System.out.println("--------------------------------------------------\nNote: AWACS Altitude can be maximum 60.000 ft");
			super.setAltitude(0);
		}
	}

	public String toString() {
		return super.toString()+"\nType of Radar: " + this.TypeofRadar + "\nRange of Radar: " + this.RangeofRadar + " km" 
				+ "\nNumber of Target: " + this.NumberofTarget + "\nThis Military Product has been purchased " + getProductBuyCount() + " times. "
				+"\n--------------------------------------------------\nThe amount of AWACS Plane Price is "+this.CalculateTotal(getPrice(),getProductBuyCount())+" $"+"\n--------------------------------------------------";
	}
}