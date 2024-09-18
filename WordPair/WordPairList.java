package WordPair;
import java.util.ArrayList;

public class WordPairList {
 private ArrayList<WordPair> allPairs;
 
 public static void main (String[] args) {
	 System.out.println("hello word pairs");
	 String[] myWords = {"Cat", "dog", "bunny", "raccoon", "cat", "cat"};
	WordPairList animals = new WordPairList(myWords);
	System.out.println(animals.numMatches());
 }
 
 public WordPairList(String[] words) {
	 allPairs = new ArrayList<WordPair>();
	 for (int i = 0; i < words.length-1; i++) {
		 for (int j = i+1; j< words.length; j++) {
			 allPairs.add(new WordPair(words[i], words[j]));
		 }
	 }
 }
 
 public int numMatches() {
	 int count = 0;
	 for (WordPair pair: allPairs) {
		 if ( pair.getFirst().equals(pair.getSecond())) {
			 count++;
		 }
	 }
	 return count;
 }
}
