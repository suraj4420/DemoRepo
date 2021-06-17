
public class Testing {
	

public static void main(String[] args) {
	String s="asadaksdkh12123@@&&*^*&@4566AA";
	String s1=s.replaceAll("[^\\d]", " ");
	s=s.replaceAll("[^a-zA-Z0-9]","");
	String s3=s.replaceAll("[^a-zA-Z]", " ");
	System.out.println(s);
	String s2=s1.trim();
	s2 = s2.replaceAll(" +", " ");
	System.out.println(s2);
	System.out.println(s3);
	}
}
