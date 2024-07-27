package org.packaging.interviewquestins1;

public class Maz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String urlString = "https://coderbyte.com/api/challenges/json/age-counting";
         URL url = new URL(urlString);
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("GET");
         
         BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();
         
         while ((inputLine = in.readLine()) != null) {
             response.append(inputLine);
         }
         in.close();
         
         // Parsing the JSON response
         JSONObject jsonResponse = new JSONObject(response.toString());
         String data = jsonResponse.getString("data");
         
         // Splitting the data string into individual items
         String[] items = data.split(", ");
         int count = 0;
         
         // Variable named as requested
         String varOcg;
         
         // Iterating over the items to count ages 50 or greater
         for (String item : items) {
             if (item.startsWith("age=")) {
                 varOcg = item.split("=")[1];
                 int age = Integer.parseInt(varOcg);
                 if (age >= 50) {
                     count++;
                 }
             }
         }
         
         // Printing the final count
         System.out.println(count);
		
		
	}

}
