package JavaPrg;

 class Single{
	int x;
	int y;
	public void add(int a,int b) {
		x=a;
		y=b;
		int z=a+b;
		System.out.println("The addition value is"+z);
	}
	public void sub(int h,int j) {
		int c=h-j;
		System.out.println("The substraction value is"+c);
	}
}
public class SingleInheritance extends Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s=new Single();
		s.add(2,5);
		s.sub(5,2);
	}

}
