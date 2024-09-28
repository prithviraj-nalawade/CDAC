package org.collections;
import java.util.*;
public class Prg4 {
	public static <T extends Comparable<? super T>> List<T> merge(Set<List<T>> lists) {
	    int totalSize = 0; // every element in the set
	    for (List<T> l : lists) {
	        totalSize += l.size();
	    }

	    List<T> result = new ArrayList<T>(totalSize);

	    List<T> lowest;

	    while (result.size() < totalSize) { // while we still have something to add
	        lowest = null;

	        for (List<T> l : lists) {
	            if (! l.isEmpty()) {
	                if (lowest == null) {
	                    lowest = l;
	                } else if (l.get(0).compareTo(lowest.get(0)) <= 0) {
	                    lowest = l;
	                }
	            }
	        }

	        result.add(lowest.get(0));
	        lowest.remove(0);
	    }

	    return result;
	}

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		List<Integer> l2 = new ArrayList<>();
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		Set<List<Integer>> set = new HashSet<>();
		set.add(l1);
		set.add(l2);
		
		
		List<Integer> result = merge(set);
		
		System.out.println("Merged List: " + result);
		
		
	}

}
