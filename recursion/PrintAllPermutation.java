package recursion;

public class PrintAllPermutation {
	public static void printPermutation(String str, String perm) {
	       if(str.length() == 0) {
	           System.out.println(perm);
	           return;
	       }
	      
	       for(int i=0; i<str.length(); i++) {
	           char currChar = str.charAt(i);
	           String newStr = str.substring(0, i) + str.substring(i+1);
	           printPermutation(newStr, perm+currChar);
	       }
	   }
	   public static void main(String args[]) {
	       String str = "abc";
	       printPermutation(str, "");
	   }
	}



