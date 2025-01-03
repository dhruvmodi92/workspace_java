package org.dhruv;


import java.util.*;


public class SolutionTrie {
    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;
     
    // trie node
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
        int count;
        TrieNode(){
            isEndOfWord = false;
            count = 0;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
      
    static TrieNode root; 
     
    // If not present, inserts key into trie
    // If the key is prefix of trie node, 
    // just marks leaf node
    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        TrieNode pCrawl = root;
        if(!isAlreadyPresent(key))
        {	
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();
            	
            pCrawl = pCrawl.children[index];
            pCrawl.count++;
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }
    }
      
    // Returns true if key presents in trie, else false
    static boolean isAlreadyPresent(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
      if(key.equals("c"))
    	  System.out.println(" ");
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            //if(level != length-1)
            	pCrawl = pCrawl.children[index];
            //if(length == 1)
            	//pCrawl = pCrawl.children[index];
        }
      
        /*if(pCrawl != null && pCrawl.isEndOfWord)
            return 1;*/
        /*int count = 0;
        for(int i = 0 ; i < 26;i++)
        {
            if(pCrawl.children[i] != null)
                count++;
        }*/
        return (pCrawl != null && pCrawl.isEndOfWord);
    }
    
    static int search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
      if(key.equals("c"))
    	  System.out.println(" ");
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return 0;
      
            //if(level != length-1)
            	pCrawl = pCrawl.children[index];
            //if(length == 1)
            	//pCrawl = pCrawl.children[index];
        }
      
        /*if(pCrawl != null && pCrawl.isEndOfWord)
            return 1;*/
        /*int count = 0;
        for(int i = 0 ; i < 26;i++)
        {
            if(pCrawl.children[i] != null)
                count++;
        }*/
        return pCrawl.count;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        root = new TrieNode();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equalsIgnoreCase("add"))
                insert(contact);
            else if(op.equalsIgnoreCase("find"))
                System.out.println(search(contact));
        }
    }
}
