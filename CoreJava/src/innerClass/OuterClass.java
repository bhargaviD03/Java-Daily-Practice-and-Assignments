package innerClass;

public class OuterClass {
	
	class innerClass{
		public innerClass(int a,int b) {
			System.out.printf("a:"+a+"b:"+b);
		}
		void sampleMethod() {
			System.out.println("inner Method");
		}
	}
	
	static class InnerClass{
		
		static void StaticMethod() {
			System.out.println("inner static Method");
		}
	}

	public static void main(String[] args) {
		OuterClass outerclass= new OuterClass();
		OuterClass.innerClass inner=outerclass.new innerClass(20,90);
		inner.sampleMethod();
		OuterClass.InnerClass.StaticMethod();
	}

}
