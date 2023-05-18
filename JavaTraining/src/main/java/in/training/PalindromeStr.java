package in.training;
import java.lang.String;
public class PalindromeStr{
	public static void main(String []args) {
		String word1 ="java";
		String word2 ="malayalam";
		int length1 = word1.length();
		int length2 =word2.length();
		String str1="";
		String str2="";
		for(int i=length1-1;i>=0;i--) {
			str1=str1+word1.charAt(i);
		}
		for(int j=length2-1;j>=0;j--) {
			str2=str2+word2.charAt(j);
		}
		if(str1.equals(word1)) {
			System.out.println("The word "+word1+" is Palindrome.");
		}
		else {
			System.out.println("The word "+word1+" is not Palindrome.");
		}
		if(str2.equals(word2)) {
			System.out.println("The word "+word2+" is Palindrome.");
		}
		else {
			System.out.println("The word "+word1+" is not Palindrome.");
		}
	}
}