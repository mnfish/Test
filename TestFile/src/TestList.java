import java.math.BigDecimal;
import java.util.regex.Pattern;

public class TestList {
	
private static String calSjdir(String rnoDir, int jj) {
		String x = "";
		int rnoDirInt = Integer.parseInt(rnoDir);
		if (jj == 0) {
			int j1 = rnoDirInt+jj;
			j1 = calSjdirInt(j1);
			int j2 = rnoDirInt+jj+180;
			j2 = calSjdirInt(j2);
			x=  j1+"/"+j2;
		}else {
			int j1 = rnoDirInt+jj;
			j1 = calSjdirInt(j1);
			int j2 = rnoDirInt+jj + 180;
			j2 = calSjdirInt(j2);
			int j3 = rnoDirInt-jj;
			j3 = calSjdirInt(j3);
			int j4 = rnoDirInt-jj-180;
			j4 = calSjdirInt(j4);
			x= j1+"/"+j2+"/"+j3+"/"+j4;
		}
		System.out.println(x);
		return x;
	}
private static int calSjdirInt(int j) {
	if (j <= 0) {
		j = j+360;
	}else if(j > 360) {
		j = j-360;
	}
	return j;
}
public static void main(String[] args) {
	
	
	
//	String[] lstrs = new String[31];
//	lstrs[0]="1";
//	lstrs[1]="2";
//	System.out.println(lstrs[2]);
	
//	System.out.println("6Ac4500".substring(3,3+"6Ac4500".length()-2));
//	calSjdir("170",0);
//	calSjdir("170",10);
//	calSjdir("170",20);
//	calSjdir("170",30);
//	calSjdir("170",40);
//	calSjdir("170",50);
//	calSjdir("170",60);
//	calSjdir("170",70);
//	calSjdir("170",80);
//	calSjdir("170",90);
	
	
	
//	System.out.println((int)"A".charAt(0));
	
//	String yb = "Fnsafkdsl;kSc";
//	yb = yb.replaceAll("Fn|Fc|Cu|Ns|St|Sc|Fs|Tcu", "Cb");
//	System.out.println(yb);
	
	
//	System.out.println(")()(".indexOf("("));
//	String[] s = "(sdf|sdf)".split("\\|\\|"); 
//	Pattern pattern = Pattern.compile("(sdf|sdf)");
//	for (String string : s) {
//		System.out.println(string);
//	}
//	System.out.println("(sdf|sdf)".split("\\|\\|"));
	
	
}
}
