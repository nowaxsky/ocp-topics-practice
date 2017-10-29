package map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map is an interface
 * SortedMap is an interface extending Map
 * 
 * HashMap(not thread-safe, keys and values can be null) implement Map
 * HashTable(thread-safe, keys and values cannot be null) implement Map
 * TreeMap(auto order) implements SortedMap
 * 
 * Properties extends HashTable
 * 
 * @author CPM
 *
 */
public class MapBasic {

	/*
	 * keys order auto
	 */
	private static void testMap() {
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("A02", 2);
		treeMap.put("A01", 1);
		treeMap.put("A03", 3);
		treeMap.put("A03", 30);
		
		//get all values
		Collection<Integer> values = treeMap.values();
		for(Integer value: values) {
			System.out.println(value);
		}
		
		//get all keys and values
		Set<String> keys = treeMap.keySet();
		for(String key: keys) {
			System.out.println(key + ": " + treeMap.get(key));
		}
		
	}
	
	public static void main(String[] args) {
		testMap();
	}
}
