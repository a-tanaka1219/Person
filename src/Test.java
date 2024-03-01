
public class Test{
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1234-5678";
		taro.address="yamada.gmail.com";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		
		
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-1234-5678";
		jiro.address="kimura.yahoo.co.jp";
		
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.run();
		
		
		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="090-5678-1234";
		hanako.address="suzuki@gmail.com";
		
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		
		
		Person amisa = new Person();
		amisa.name="田中彩美紗";
		amisa.age=26;
		amisa.phoneNumber="080-1234-1219";
		amisa.address="tanaka.gmail.com";
		amisa.talk();
		amisa.walk();
		
		
		System.out.println(amisa.name);
		System.out.println(amisa.age);
		System.out.println(amisa.phoneNumber);
		System.out.println(amisa.address);
		
	}
	
	
}
