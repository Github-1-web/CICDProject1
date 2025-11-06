
public class Test2 {

	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Allu");
		StringBuffer sb2=new StringBuffer("Arjun");
		StringBuffer sb3=new StringBuffer("Allu");
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb1==sb3);
	}

}
