package OODAssignment;
import java.io.*;
import java.util.ArrayList;
public class FileReaderWriter {

   public static void saveMenu(String fileName, Menu menu) throws IOException{
      File file = new File(fileName);
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 

      String s;
      for (FoodItem i : menu.mains){
    	  AlaCarte j = (AlaCarte) i;
    	s = i.name;
      	writer.write(s + "\n");
      	s = Character.toString(j.type);
      	writer.write(s + "\n");
      	s = i.description;
      	writer.write(s + "\n");
      	float p = i.price;
      	s = Float.toString(p);
      	writer.write(s + "\n\n");
      	writer.flush();
      }
      
      for (FoodItem i : menu.drinks){
    	  AlaCarte j = (AlaCarte) i;
    	s = i.name;
      	writer.write(s + "\n");
      	s = Character.toString(j.type);
      	writer.write(s + "\n");
      	s = i.description;
      	writer.write(s + "\n");
      	float p = i.price;
      	s = Float.toString(p);
      	writer.write(s + "\n\n");
      	writer.flush();
      }
      
      for (FoodItem i : menu.desserts){
    	  AlaCarte j = (AlaCarte) i;
    	s = i.name;
      	writer.write(s + "\n");
      	s = Character.toString(j.type);
      	writer.write(s + "\n");
      	s = i.description;
      	writer.write(s + "\n");
      	float p = i.price;
      	s = Float.toString(p);
      	writer.write(s + "\n\n");
      	writer.flush();
      }
      
      for (FoodItem i : menu.packages){
    	  PackageSet j = (PackageSet) i;
    	s = i.name;
      	writer.write(s + "\n");
      	AlaCarte[] c = j.set;
      	for (AlaCarte k : c){
      		ArrayList<String> temp = new ArrayList<>();
      		s = k.name;
      		temp.add(s);
          	s = Character.toString(k.type);
          	temp.add(s);
          	s = i.description;
          	temp.add(s);
          	float p = i.price;
          	s = Float.toString(p);
          	temp.add(s);
          	writer.write(temp + "\n");
          	writer.flush();
      	}
      	s = i.description;
      	writer.write(s + "\n");
      	float p = i.price;
      	s = Float.toString(p);
      	writer.write(s + "\n");
      	writer.flush();
      }
      writer.close();
   }

   public static Menu loadMenu(String fileName) throws IOException,FileNotFoundException{
      int size = 0,i=0;
      // Get the number of lines in the file 
      try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
          while ((br.readLine()) != null) {
              size++;
          }
      }
      System.out.println(size);
      
      // Store numbers in array
      Menu outputMenu = new Menu();
      try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
          while (i<size) {
        	  AlaCarte[] set = new AlaCarte[3];
        	  String name = br.readLine();i++;
              String temp = br.readLine();i++;
              String[] parts;
              if(temp.charAt(0)=='['){
            	  set[0] = extractAlaCarte(temp);
            	  temp = br.readLine();i++;
            	  set[1] = extractAlaCarte(temp);
            	  temp = br.readLine();i++;
            	  set[2] = extractAlaCarte(temp);
            	  String description = br.readLine();i++;
            	  temp = br.readLine();i++;
                  float price2 = Float.valueOf(temp);
                  
                  outputMenu.addItem(new PackageSet(name,set,description,price2));
              }
              else{
            	  char type2 = temp.charAt(0);
            	  String description = br.readLine();i++;
                  float price2 = Float.valueOf(br.readLine());i++;
                  outputMenu.addItem(new AlaCarte(name,type2,description,price2));
              }
              br.readLine();i++;
          }
      }
      return outputMenu;
   }
   
   public static AlaCarte extractAlaCarte(String temp){
	   String[] parts;
	   temp = temp.substring(1, temp.length()-1);
	   parts = temp.split(",");
	   String name2 = parts[0];
       char type2 = parts[1].charAt(1);
       String description2 = parts[2];
       float price2 = Float.valueOf(parts[3]);
       return new AlaCarte(name2,type2,description2,price2);
   }
 
}
