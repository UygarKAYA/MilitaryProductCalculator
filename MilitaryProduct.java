package Project01;

public class MilitaryProduct {
	
	private String Name;
	private String Manufacturer;
	private double Price;
	private int ProductBuyCount;
	
	public MilitaryProduct(String Name, String Manufacturer, double Price, int ProductBuyCount) {
		this.Name=Name;
		this.Manufacturer=Manufacturer;
		if (Price>0)
			this.Price=Price;
		else {
			System.out.println("WARNING: Military Product's Price Cannot Be Negative or 0"+"\n--------------------------------------------------");
			this.Price=0;
		}	
		if (ProductBuyCount>0) 
			this.ProductBuyCount=ProductBuyCount;
		else {
			System.out.println("WARNING: Military Products Buy Count Cannot Be Negative or 0"+"\n--------------------------------------------------");
			ProductBuyCount=0;
		}
	}
	
	public MilitaryProduct(String Name, double Price, int ProductBuyCount) {
		this.Name=Name;
		if (Price>0)
			this.Price=Price;
		else {
			System.out.println("WARNING: Military Product's Price Cannot Be Negative or 0"+"\n--------------------------------------------------");
			this.Price=0;
		}	
		if (ProductBuyCount>0) 
			this.ProductBuyCount=ProductBuyCount;
		else {
			System.out.println("WARNING: Military Products Buy Count Cannot Be Negative or 0"+"\n--------------------------------------------------");
			ProductBuyCount=0;
		}
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getManufacturer() {
		return Manufacturer;
	}
	
	public void setManufacturer(String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}
	
	public double getPrice() {
		return Price;
	}

	public void setPrice(double Price) {
		if (Price>0)
			this.Price=Price;
		else {
			System.out.println("WARNING: Military Product's Price Cannot Be Negative or 0"+"\n--------------------------------------------------");
			this.Price=0;
		}
	}
	
	public int getProductBuyCount() {
		return ProductBuyCount;
	}

	public void setProductBuyCount(int ProductBuyCount) {
		if (ProductBuyCount>0) 
			this.ProductBuyCount=ProductBuyCount;
		else {
			System.out.println("WARNING: Military Products Buy Count Cannot Be Negative or 0"+"\n--------------------------------------------------");
			ProductBuyCount=0;
		}
	}
	
	public double CalculateTotal(String Name, String Manufacturer, double Price, int ProductBuyCount) {
		return Price*ProductBuyCount;
	}
	
	public double CalculateTotal(String Manufacturer, double Price, int ProductBuyCount) { 
		return Price*ProductBuyCount;
	}
	
	public double CalculateTotal(double Price, int ProductBuyCount) { 
		return Price*ProductBuyCount;
	}
	
	public double CalculateTotal() {
		return Price*ProductBuyCount;
	}
	
	public String toString() {
		return "Military Product Name: " + this.Name + "\nManufacturer: " + this.Manufacturer + "\nPrice: " + this.Price + " $";
	}
}