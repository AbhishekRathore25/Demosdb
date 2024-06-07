package java12;
import java.util.Map;
import java.util.HashMap;
import java.util.StringJoiner;
public class OccurrencesString {

	
	 public static void getCharCount(String name) {
		 Map<Character , Integer> charMap= new HashMap<Character,Integer>();
		 char strArray[]=name.toCharArray();
		 
		 for(char c : strArray) {
            
			 if (charMap.containsKey(c)) {
				 charMap.put(c , charMap.get(c)+1);
			 }
			 else {
				 charMap.put(c,1);
			 }
			 } 
		 
		 System.out.print(name + "" + charMap);
	 }
	public static void main(String[] args) {
		
  getCharCount("Abhishek ");
	}

}
