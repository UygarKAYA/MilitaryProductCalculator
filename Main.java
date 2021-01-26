package Project01;

import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<MilitaryProduct> MilitaryProducts = new ArrayList<MilitaryProduct>();
		Scanner console = new Scanner(System.in);
		
		System.out.print("Do you want to enter product name which you will buy or do you want to buy standard military product ? Please enter YES/NO: ");
		String Decision = console.nextLine();
		System.out.print("Do you want to see more detailed calculation in your military Product ? Please enter YES/NO: ");
		String DetailedCalculate = console.nextLine();
		System.out.print("Armed Forces Name: ");
		String CostumerName = console.nextLine();
		
		if (Decision.equals("NO")) {
		
			MilitaryProducts.add(new Corvette("TCG Heybeliada",260000000,2,29));
			MilitaryProducts.get(0).setProductBuyCount(4);
			
			MilitaryProduct AmphibiousShip = new AmphibiousAssaultShip("TCG Anadolu",451000000,2,21,6,27,4);
			AmphibiousShip.setName("TCG Trakya");
			MilitaryProducts.add(AmphibiousShip);
			
			AWACS Awacs = new AWACS("Hava SOJ",82000000,4,"Turbofan",51000,8800);
			MilitaryProducts.add(Awacs);
			
			MilitaryFighterPlane FighterPlane = new MilitaryFighterPlane("TF-X",10000000,60,4800,55000,"AGM-114",4);
			FighterPlane.setMissileName("SOM-J");
			MilitaryProducts.add(FighterPlane);
			
			Howitzer howitzer = new Howitzer("T-155 Fýrtýna",5000000,250,5);
			MilitaryProducts.add(howitzer);
		}
		
		if (Decision.equals("YES")) {
			
			System.out.println("--------------------------------------------------");
			System.out.println("Military Products which you can choose");
			System.out.println("--------------------------------------------------");
			System.out.println("Armoured Force --> PARS 8x8 || ZMA 30 || Cobra || Kirpi 2 || T-155 Fýrtýna || Panter || Yavuz");
			System.out.println("Navy Force     --> TCG Büyükada || TCG Kýnalýada || TCG Burak || TCG Bandýrma || TCG Anadolu || TCG Trakya");
			System.out.println("Air Force      --> TF-X || F-16 || F-4 || E-7 || Hava SOJ || KC-135R");
			System.out.println("--------------------------------------------------");
			
	        String ProductName="";
	        System.out.print("Please enter Product's name, or enter Stop to exit: ");  
 	        ProductName = console.nextLine();
	        while (!(ProductName.equals("Stop"))) { 
	            System.out.print("Please enter Product Count : ");
	            int Count = console.nextInt(); 
	            
	            if (ProductName.endsWith("ada") || ProductName.startsWith("TCG B") ) {
	            	if (ProductName.endsWith("ada")) {
	            		MilitaryProducts.add(new Corvette(ProductName,260000000,Count,29));
	            	}
	            	else if (ProductName.startsWith("TCG B")) {
	            		MilitaryProducts.add(new Corvette(ProductName,6000000,Count,23));
	            	}
	            }
	            
	            else if (ProductName.equals("TCG Anadolu") || ProductName.equals("TCG Trakya")) {
	            	MilitaryProduct AmphibiousShip = new AmphibiousAssaultShip(ProductName,451000000,Count,21,6,27,4); 
	            	MilitaryProducts.add(AmphibiousShip);
	            }
	            
	            else if (ProductName.equals("Barýþ Kartalý") || ProductName.equals("HIK") || ProductName.equals("E-7") || ProductName.equals("Hava SOJ")) {
	            	if (ProductName.equals("Barýþ Kartalý") || ProductName.equals("HIK") || ProductName.equals("E-7")) {
	            		AWACS Awacs = new AWACS(ProductName,82000000,Count,"Turbofan",41000,5665);
		        		MilitaryProducts.add(Awacs);
	            	}
	            	else if (ProductName.equals("Hava SOJ")) {
	            		AWACS Awacs = new AWACS(ProductName,100000000,Count,"Turbofan",51000,8800);
		        		MilitaryProducts.add(Awacs);
	            	}
	            }
	            
	            else if (ProductName.equals("F-16") || ProductName.equals("F16") || ProductName.equals("F-4") || ProductName.equals("F4") || ProductName.equals("TF-X") || ProductName.equals("TFX") || ProductName.equals("MMU")) {
	            	if(ProductName.equals("F-16") || ProductName.equals("F16")) {
	            		MilitaryFighterPlane FighterPlane = new MilitaryFighterPlane(ProductName,18800000,Count,4220,50000,"Harpoon",2);
		        		MilitaryProducts.add(FighterPlane);
	            	}
	            	
	            	else if(ProductName.equals("F-4") || ProductName.equals("F4")) {
	            		MilitaryFighterPlane FighterPlane = new MilitaryFighterPlane(ProductName,2400000,Count,2888,60000,"AIM 120",2);
		        		MilitaryProducts.add(FighterPlane);
	            	}
	            	
	            	else if(ProductName.equals("TF-X") || ProductName.equals("TFX") || ProductName.equals("MMU")) {
	            		MilitaryFighterPlane FighterPlane = new MilitaryFighterPlane(ProductName,20000000,Count,4800,55000,"SOM-J",4);
		        		MilitaryProducts.add(FighterPlane);
	            	}
	            }
	            
	            else if (ProductName.equals("KC-135R")) {
	            	MilitaryTankerAircraft TankerAircraft = new MilitaryTankerAircraft(ProductName,39000000,Count,2419,50000);
	        		MilitaryProducts.add(TankerAircraft);
	            }
	            
	            else if (ProductName.startsWith("PARS") || ProductName.startsWith("ZMA") || ProductName.equals("Cobra") ||ProductName.equals("Kirpi 2")) {
	            	if (ProductName.startsWith("PARS")) {
	            		ArmouredPersonnelVehicle PersonnelVehicle = new ArmouredPersonnelVehicle(ProductName,2334630,Count,13);
		        		MilitaryProducts.add(PersonnelVehicle);
	            	}
	            	
	            	else if (ProductName.startsWith("ZMA")) {
	            		ArmouredPersonnelVehicle PersonnelVehicle = new ArmouredPersonnelVehicle(ProductName,1357250,Count,9);
		        		MilitaryProducts.add(PersonnelVehicle);
	            	}
	            	
	            	else if (ProductName.equals("Cobra")) {
	            		ArmouredPersonnelVehicle PersonnelVehicle = new ArmouredPersonnelVehicle(ProductName,2102394,Count,9);
		        		MilitaryProducts.add(PersonnelVehicle);
	            	}
	            	
	            	else if (ProductName.equals("Kirpi 2")) {
	            		ArmouredPersonnelVehicle PersonnelVehicle = new ArmouredPersonnelVehicle(ProductName,2136752,Count,12);
		        		MilitaryProducts.add(PersonnelVehicle);
	            	}
	            }
	            
	            else if (ProductName.equals("T-155 Fýrtýna") || ProductName.equals("Yavuz") || ProductName.equals("Panter")) {
	            	if (ProductName.equals("T-155 Fýrtýna")) {
	            		Howitzer howitzer = new Howitzer(ProductName,5000000,Count,5);
		    			MilitaryProducts.add(howitzer);
	            	}
	            	
	            	else if (ProductName.equals("Yavuz") || ProductName.equals("Panter")) {
	            		Howitzer howitzer = new Howitzer(ProductName,3000000,Count,5);
		    			MilitaryProducts.add(howitzer);
	            	}
	            }
	            
	            ProductName = console.nextLine();
	            System.out.print("Please enter Product's name, or enter Stop to exit: "); 
	            ProductName = console.nextLine();
	        }
		}
		double total = 0;
				
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------"+"\nPurchased Navy Force Items"+"\n");
		for (int i=0; i<MilitaryProducts.size(); i++) {
			if (MilitaryProducts.get(i) instanceof NavyForce) 
				System.out.println(MilitaryProducts.get(i));
		}
		System.out.println("--------------------------------------------------"+"\nPurchased Air Force Items"+"\n");
		for (int i=0; i<MilitaryProducts.size(); i++) {
			if (MilitaryProducts.get(i) instanceof AirForce)
				System.out.println(MilitaryProducts.get(i));
		}
		System.out.println("--------------------------------------------------"+"\nPurchased Armoured Force Items"+"\n");
		for (int i=0; i<MilitaryProducts.size(); i++) {
			if (MilitaryProducts.get(i) instanceof ArmouredForce) 
				System.out.println(MilitaryProducts.get(i));
		}
		
		if (DetailedCalculate.equals("YES")) {
			System.out.println("\n"+"--------------------------------------------------");
			System.out.println("Total Navy Force Product Price is "+(calculateNavyPrice(MilitaryProducts))+" $"+"\n--------------------------------------------------");
			System.out.println("Total Air Force Product Price is "+(calculateAirPrice(MilitaryProducts))+" $"+"\n--------------------------------------------------");
			System.out.println("Total Armoured Force Product Price is "+(calculateArmouredPrice(MilitaryProducts))+" $"+"\n--------------------------------------------------");
		}
		
		total=calculateTotalPrice(MilitaryProducts);
		System.out.println("Total Military Product Price is " + total + " $");	
	}
	
	public static double calculateNavyPrice(ArrayList<MilitaryProduct> NavyProduct) {
		double Navytotal = 0;
		int i=0;
		while(i<NavyProduct.size()) {
			double PriceTotal = (NavyProduct.get(i).getPrice());
			if (NavyProduct.get(i) instanceof NavyForce) 
				Navytotal=Navytotal+((NavyForce)NavyProduct.get(i)).getProductBuyCount()*PriceTotal;
			i++;
		}
		return Navytotal;
	}
	
	public static double calculateAirPrice(ArrayList<MilitaryProduct> AirProduct) {
		double Airtotal = 0;
		int i=0;
		while(i<AirProduct.size()) {
			double PriceTotal = (AirProduct.get(i).getPrice());
			if (AirProduct.get(i) instanceof AirForce) 
				Airtotal=Airtotal+((AirForce)AirProduct.get(i)).getProductBuyCount()*PriceTotal;
			i++;
		}
		return Airtotal;
	}
	
	public static double calculateArmouredPrice(ArrayList<MilitaryProduct> ArmouredProduct) {
		double Armouredtotal = 0;
		int i=0;
		while(i<ArmouredProduct.size()) {
			double PriceTotal = (ArmouredProduct.get(i).getPrice());
			if (ArmouredProduct.get(i) instanceof ArmouredForce) 
				Armouredtotal=Armouredtotal+((ArmouredForce)ArmouredProduct.get(i)).getProductBuyCount()*PriceTotal;
			i++;
		}
		return Armouredtotal;
	}
	
	public static double calculateTotalPrice(ArrayList<MilitaryProduct> product) {
		double total = 0;
		int i=0;
		while (i<product.size()) {
			double PriceTotal = (product.get(i).getPrice());
			if (product.get(i) instanceof NavyForce) 
				total=total+((NavyForce)product.get(i)).getProductBuyCount()*PriceTotal;
				
			else if (product.get(i) instanceof AirForce) 
				total=total+((AirForce)product.get(i)).getProductBuyCount()*PriceTotal;
				
			else if(product.get(i) instanceof ArmouredForce) 
				total=total + ((ArmouredForce)product.get(i)).getProductBuyCount()*PriceTotal;
			i++;	
		}
		return total;
	}
}