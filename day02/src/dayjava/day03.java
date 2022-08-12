package dayjava;

import javax.xml.soap.Text;

public class day03 {
	public static void main(String[] args) {
		//字符串类型
		String firstParty="源码时代";
		//数据类型
		byte b=12;
		short s=200;
		int i=100;
		long l=50;
		//小数类型
		float f=12.1f;
		double d=12.3;
		//字符类型
		char c='邓';
		//布尔类型
		boolean boo=true;
		
		
		String name;
		name="源码";
		System.out.println(name);
		name="时代";
		System.out.println(name);
		
		int a=3;
		int a1=4;
		int aa;
		aa=a;
		a=a1;	
		a1=aa;
		System.out.println(a);
		System.out.println(a1);
		Text();
		
	}
	static int c=100;
	public static void Text(){
		char b='原';
		System.out.println(c);
		System.out.println(b);
		System.out.println(string);//成员变量可以调用
		//System.out.println(ch);局部变量无法调用
	}
	static String string="源码";
	public void Text1(){
		char ch='吗';
		System.out.println(c);//成员变量可以调用
		System.out.println(ch);
		//System.out.println(b);局部变量无法调用
	}
	

}
