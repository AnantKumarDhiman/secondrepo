
public class WrapperEx 
{

	public static void main(String[] args) {
		int a=10;
		Integer ab= new Integer(a);
		System.out.println(a);
		System.out.println(ab);
		System.out.println(Integer.toBinaryString(9));
		System.out.println(Integer.toHexString(100));
		
		int val=Integer.parseInt("999"); // converting string into int
		System.out.println(val);
	}
	
}
