import java.util.*;
class String3 {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      int word_count=0,i;
      for(i=0;i<s1.length();i++)
      {
    	  char ch=s1.charAt(i);
    	  if(ch!=' ')
    		  word_count++;
    	  else
    	  break;
	}
	System.out.println(word_count);
	}
 
}
