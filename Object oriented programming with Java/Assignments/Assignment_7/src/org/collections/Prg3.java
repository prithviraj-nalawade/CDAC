package org.collections;
import java.util.*;

public class Prg3 {

	public static void main(String[] args) {
		  String non = "aabbccddeffg";
		    Map<String,LinkedHashSet<Character>> m = new   HashMap<String,LinkedHashSet<Character>>() ;
		    m.put("one", new LinkedHashSet<Character>());
		    m.put("else", new LinkedHashSet<Character>());
		    m.put("all", new LinkedHashSet<Character>());
		    for (int i = 0; i < non.length(); i++) {
		        if (m.get("all").contains(non.charAt(i))) {
		            m.get("one").remove(non.charAt(i));
		            m.get("else").add(non.charAt(i));
		        } else {
		            m.get("one").add(non.charAt(i));
		            m.get("all").add(non.charAt(i));
		        }
		    }
		    if(m.get("one").size()>0){
		        System.out.println("first non repeatant : "+m.get("one").iterator().next());
		    }
		    
	}
}
