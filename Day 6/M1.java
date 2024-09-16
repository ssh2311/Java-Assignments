
interface I1 {
    public void calpower(int x, int y);
}


class Methodref1 {
    public Methodref1(int a, int b) {
        System.out.println(Math.pow(a, b));
    }
}
 
public class M1 {
	public static void main(String[] args) {
		I1 cal= Methodref1::new;
		cal.calpower(4,2);
	}
}
 