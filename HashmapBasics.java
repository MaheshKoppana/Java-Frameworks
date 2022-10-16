package hashmapconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//No order and no indexing
		//stores value in the form K(Key)<k> V(Value) <v>
		//key cannot be duplicated
		//can store n number of null values but only one null key
		//hash-map is not thread-safe
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("Telanagana", "Hyderabad");
		capitalMap.put("AndhraPradesh", "Amaravathi");
		capitalMap.put("Karnataka", "Banglore");
		capitalMap.put("AndhraPradesh", "Vizag"); //It gives the latest value
		capitalMap.put("null", "Kurnool");
		capitalMap.put("null", "warangal");
		capitalMap.put("Kerala", null);
		capitalMap.put("HimachalPradesh", null);
		capitalMap.remove("HimachalPradesh");
		
		
		System.out.println(capitalMap.get("Telanagana"));
		System.out.println(capitalMap.get("Germany"));
		System.out.println(capitalMap.get("AndhraPradesh"));
		System.out.println(capitalMap.get("null"));
		System.out.println(capitalMap.get("Kerala"));
		System.out.println("HimachalPradesh");
		
		//Iterator over the keys: by using keyset()
		
		Iterator<String>it = capitalMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + "value = " +value);
				}
		
		System.out.println("----------------");
		
		//Iterator : over the set (pair): by using entryset
		
		Iterator<Entry<String, String>>it1=capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String,String> entry = it1.next();
			System.out.println("key = " +entry.getKey() + "and value =" +entry.getValue());
			
		}
		
		
		
		System.out.println("----------------");
		
		//iterate using hashmap using java for each and lambda
		capitalMap.forEach((k,v) -> System.out.println("key = " + k +" and value = " + v));
		}
}
