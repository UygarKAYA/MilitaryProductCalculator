package Project01;

public class MilitaryTankerAircraft extends AirForce {
	
	private String TypeofPump; // Pump ---> Fuel Transfer Pump.
	private String TypeofFuel; 
	private int FuelQuantity;
	
	public MilitaryTankerAircraft(String Name, String Manufacturer, double Price, int ProductBuyCount, String TypeofEngine, int Altitude, int FlightRange, String TypeofPump, String TypeofFuel, int FuelQuantity) {
		super(Name,Manufacturer,Price,ProductBuyCount,TypeofEngine,Altitude,FlightRange);
		this.TypeofPump=TypeofPump;
		this.TypeofFuel=TypeofFuel;
		this.FuelQuantity=FuelQuantity;
	}
	
	public MilitaryTankerAircraft(String Name,double Price, int ProductBuyCount, int FlightRange, int Altitude) {
		super(Name,Price,ProductBuyCount,FlightRange,Altitude);
		if (Name.equals("KC-135R")) {
			this.setManufacturer("Boeing");
			this.setFlightRange(2419);
			this.setTypeofEngine("Turbofan");
			this.setAltitude(50000);
			this.TypeofPump="Flaying Boom";
			this.TypeofFuel="Jet Fuel";
			this.FuelQuantity=90719;
		}
	}

	public String getTypeofPump() {
		return TypeofPump;
	}

	public void setTypeofPump(String TypeofPump) {
		this.TypeofPump = TypeofPump;
	}

	public String getTypeofFuel() {
		return TypeofFuel;
	}

	public void setTypeofFuel(String TypeofFuel) {
		this.TypeofFuel = TypeofFuel;
	}

	public int getFuelQuantity() {
		return FuelQuantity;
	}

	public void setFuelQuantity(int FuelQuantity) {
		this.FuelQuantity = FuelQuantity;
	}
	
	public void setAltitude(int Altitude) {
		if (Altitude>0 && Altitude<=80000) 
			super.getAltitude();
		else {
			System.out.println("--------------------------------------------------\nNote: Military Tanker Aircraft Altitude can be maximum 80.000 ft");
			super.setAltitude(0);
		}
	}
	
	public String toString() {
		return super.toString()+"\nType of Pump: " +this.TypeofPump+"\nType of Fuel: "+this.TypeofFuel+"\nFuel Quantity: "+this.FuelQuantity 
				+" kg"+"\nThis Military Product has been purchased "+getProductBuyCount() + " times."
						+ "\n--------------------------------------------------\nThe amount of Military Fighter Plane Price is " +this.CalculateTotal()+" $"+"\n--------------------------------------------------"; 
	}
}