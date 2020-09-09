package UTS;

public class UTS1_Ratu {
	public static void main(String[]args) {
		String bel = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
		String str = new String();
		
		char a = bel.charAt(0);
		char b = bel.charAt(1);
		char c = bel.charAt(2);
		char d = bel.charAt(3);
		char e = bel.charAt(4);
		char i = bel.charAt(8);
		char l = bel.charAt(11);
		char n = bel.charAt(13);
		char r = bel.charAt(17);
		char t = bel.charAt(19);
		char u = bel.charAt(20);
		char w = bel.charAt(22);
		char strip = bel.charAt(27);
		
		System.out.println(str.concat(""+r+a+t+u+strip+b+e+l+l+a+strip+c+a+n+d+r+a+strip+w+a+r+d+a+n+i));
		
	}
}