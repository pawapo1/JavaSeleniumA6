package generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Swapping {
public static void main(String[] args) {
	Map m = new HashMap();
	m.put("a", "candy");
	m.put("b", "dirt");
	m.put("a", "dirt");
	m.put("b", "");
	System.out.println(m);
}}
