package org.dhruv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordFinder {

	
	public static void main(String[] args)
	{
		String para = "to dhruv dhruv aneri aneri aneri aneri to to to kausha kausha";
		
		String[] allWords = para.split(" ");
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		
		for(String word : allWords)
		{
			Integer count = wordCount.get(word);
			if(count == null)
			{
				count = 0;
			}
			wordCount.put(word,count+1);
			
		}
		
		
		/*List<String> flist = new ArrayList<String>();
		for(String val : wordCount.keySet())
		{
			int c = wordCount.get(val);
			while(c > 0 )
			{
				flist.add(val);
				c--;
			}
		}*/
		System.out.println(wordCount);
		
		Map<String,Integer> sorted = sortedByValue(wordCount);
		System.out.println(sorted);
		/*Integer[] i = new Integer[6];
		List<String> l = Arrays.asList(allWords);
		System.out.println(flist);*/
		
		
		
	}
	private static HashMap sortedByValue(HashMap map)
	{
		HashMap sortedMap = new LinkedHashMap();
		List list = new LinkedList(map.entrySet());
		Collections.sort(list,new myComp());		
		Iterator itr = list.listIterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
}

class myComp implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer m0 = (Integer) ((Map.Entry)arg0).getValue();
		Integer m1 = (Integer) ((Map.Entry)arg1).getValue();
		if(m0 > m1)
		{
			return -1;
		}
		else if(m0 < m1)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
	
}

