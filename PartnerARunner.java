import java.text.DecimalFormat;
public class PartnerARunner implements PartnerA{
	private DecimalFormat df = new DecimalFormat("###.###");
	public void quotient(float a,float b){
		System.out.println(df.format(a/b));
	}
	public static void main(String []args){
		PartnerA a = new PartnerARunner();
		a.quotient(1.668971623f,0.37912741f);
	}
}