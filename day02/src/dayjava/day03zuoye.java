package dayjava;

public class day03zuoye {
	public static void main(String[] args) {
		int age1=18;
		int age2=31;
		int sum=age1+age2;
		System.out.println(sum);
		Text();
		Text1();
	}
	
	public static void Text(){
		String name="小明";
		int age=20;	
		System.out.println("姓名："+name+",年龄："+age+"岁");
				
	}
	public static void Text1(){
		int a=3;
		int b=4;
		int c;
		System.out.println("a="+a+",b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+",b="+b);
	}

}
