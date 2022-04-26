
public class TestDouble {
	public static void main(String[] args) {
		if (Double.doubleToLongBits(-30.0d)==Double.doubleToLongBits(-30d) || 0d <- 30d) {
			System.out.println("-30 <= -30");
		}else {
			System.out.println("-30 > -30");
		}
	}
}
