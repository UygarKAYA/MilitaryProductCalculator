package Project01;

public class AirForce extends MilitaryProduct {
	
	private String TypeofEngine; // Engine Type --> TurboJet, TurboFan, TurboŞaft, TurboProp
	private int Altitude;       // in the world, the Maximum Altitude is 123.520 feet
	private int FlightRange;
	
	public AirForce(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofEngine, int Altitude, int FlightRange) {
		super(Name,Manufacturer,Price,ProductBuyCount);
		this.TypeofEngine=TypeofEngine;
		if (Altitude>=0 && Altitude<=123520) 
			this.Altitude = Altitude;
		else {
			System.out.println("Note: Altitude should be 0 to 123.520 ft & Average Altitude is 40.000 ft"+"\n--------------------------------------------------");
			this.Altitude=40000;
		}
		this.FlightRange=FlightRange;
	}
	
	public AirForce(String Name, double Price, int ProductBuyCount, String TypeofEngine, int Altitude,int FlightRange) {
		super(Name,Price,ProductBuyCount);
		this.TypeofEngine=TypeofEngine;
		if (Altitude>=0 && Altitude<=123520)
			this.Altitude = Altitude;
		else {
			System.out.println("Note: Altitude should be 0 to 123.520 ft & Average Altitude is 40.000 ft"+"\n--------------------------------------------------");
			this.Altitude=40000;
		}
		this.FlightRange=FlightRange;
	}
	
	public AirForce(String Name,double Price, int ProductBuyCount, int FlightRange, int Altitude) {
		super(Name,Price,ProductBuyCount);
		if (Altitude>=0 && Altitude<=123520)
			this.Altitude = Altitude;
		else {
			System.out.println("Note: Altitude should be 0 to 123.520 ft & Average Altitude is 40.000 ft"+"\n--------------------------------------------------");
			this.Altitude=40000;
		}
		this.FlightRange=FlightRange;
	}

	public String getTypeofEngine() {
		return TypeofEngine;
	}

	public void setTypeofEngine(String TypeofEngine) {
		this.TypeofEngine = TypeofEngine;
	}
	
	public int getAltitude() {
		return Altitude;
	}

	public void setAltitude(int Altitude) {
		if (Altitude>=0 && Altitude<=123520)
			this.Altitude = Altitude;
		else {
			System.out.println("Note: Altitude should be 0 to 123.520 ft & Average Altitude is 40.000 ft"+"\n--------------------------------------------------");
			this.Altitude=40000;
		}
	}
	
	public int getFlightRange() {
		return FlightRange;
	}
	
	public void setFlightRange(int FlightRange) {
		this.FlightRange=FlightRange;
	}
	
	public String toString() {
		return super.toString()+"\nType of Engine: " + this.TypeofEngine + "\nFlight Range: " + this.FlightRange + " km" 
				+ "\nAltitude: " + this.Altitude + " ft" ; 
	}
}