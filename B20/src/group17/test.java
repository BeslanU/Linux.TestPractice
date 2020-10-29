package group17;
import java.util.Arrays;
public class test {
	static void Anagram(String word1,String word2) {
		String rep1 = word1.replaceAll("\\s", "");
		String rep2 = word2.replaceAll("\\s", "");
		boolean status = false;
	    if(rep1.length() != rep2.length()) {
	        status = false;
	    }else{ 
	    	char[] word1Array = rep1.toLowerCase().toCharArray();
	    	char[] word2Array = rep2.toLowerCase().toCharArray();
	    	Arrays.sort(word1Array);
	        Arrays.sort(word2Array);
	        status = Arrays.equals(word1Array, word2Array);
	    }
	    if(status){
            System.out.println(word1+" and "+word2+" are anagrams");
        }
        else{
            System.out.println(word1+" and "+word2+" are not anagrams");
        }
	}
	public static void main(String[] args){
        Anagram("Mother In Law", "Hitler Woman");
        Anagram("keEp", "peeK");
        Anagram("SiLeNt CAT", "LisTen AcT");
        Anagram("Debit Card", "Bad Credit");
        Anagram("School MASTER", "The ClassROOM");
        Anagram("DORMITORY", "Dirty Room");
        Anagram("ASTRONOMERS", "NO MORE STARS");
        Anagram("Toss", "Shot");
        Anagram("joy", "enjoy");
    }	
}
