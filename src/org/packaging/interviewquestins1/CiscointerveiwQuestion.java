package org.packaging.interviewquestins1;

import java.util.HashMap;

public class CiscointerveiwQuestion {

	public static void main(String[] args) {

      HashMap<String,String> citieswithflight = new HashMap<>();
	
      citieswithflight.put("Chennai", "Bangalore");
      citieswithflight.put("Bombay", "Delhi");
      citieswithflight.put("Goa", "Chennai");
      citieswithflight.put("Delhi", "Goa");
      
      // creating the copy of the above map for manipulation :
      HashMap<String,String> currentCityToDesination = new HashMap<>(citieswithflight);
      
	  StringBuffer sb = new StringBuffer();	
      String startingCity = "Bombay"; 
      
      FlightWithDestinationChartStartingFromstartingCity(sb,currentCityToDesination,startingCity);
      sb.append(".");
      
      System.out.println(sb.toString());
		
	}

	private static void FlightWithDestinationChartStartingFromstartingCity(StringBuffer sb,
			HashMap<String, String> currentCityToDesination, String startingCity) {
      if(currentCityToDesination.isEmpty())
    	  return;
		
		String destinationCity = currentCityToDesination.get(startingCity);
		currentCityToDesination.remove(startingCity);
		sb.append(startingCity);
		sb.append("->");
		sb.append(destinationCity);
		if(currentCityToDesination.size() > 0)
			sb.append(",");
		
		
		FlightWithDestinationChartStartingFromstartingCity(sb, currentCityToDesination, destinationCity);	
		
	}
}
