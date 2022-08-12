package dayjava;

public class shuju {
	public static void main(String[] args) {
		//隐式转换
		byte b=127;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		double d1=b;
		
		char c='A';
		int i2=c;
		long l2=i2;
		
		int i3=12;
		byte b2=(byte)i3;
		System.out.println(b2);
		double d3=3.14;
		float f2=(float)d3;
		System.out.println(f2);
		long l3=(long)f2;
		System.out.println(l3);
		int i4=(int)l3;
		System.out.println(i4);
		short s2=(short)i4;
		byte b3=(byte)s2;
		System.out.println(b3);
	}

}
