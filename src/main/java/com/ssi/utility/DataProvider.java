package com.ssi.utility;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
	
	public static List<String> getVehicleBrands(){
		List<String> brands=new ArrayList<String>();
		brands.add("Tata");
		brands.add("Eicher");
		brands.add("Mazda");
		brands.add("Mahindra");
		return brands;
	}
	public static List<String> getStates(){
		List<String> states=new ArrayList<String>();
		states.add("MP");
		states.add("Maharastra");
		states.add("Delhi");
		states.add("Keral");
		return states;
	}
	public static List<String> getCities(){
		List<String> cities=new ArrayList<String>();
		cities.add("indore");
		cities.add("Bhopal");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Hyderabad");
		
		return cities;
	}
	public static List<String> getVehicleTypes(){
		List<String> vtypes=new ArrayList<String>();
		vtypes.add("Mini-Truck");
		vtypes.add("Tanker");
		vtypes.add("Dumper");
		vtypes.add("Container");
		return vtypes;
	}

}
