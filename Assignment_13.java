package module1;

public class Assignment_13 {

	public static void main(String[] args) {
		int age=20;
		char gender='M';
		if(age==20 && gender=='M')
		{
			System.out.println("eligible for car race");
			if(age==18 || age>=20)
			{
				System.out.println("bike race");
			}
				else
				{
					System.out.println("not eligible for bike race");
				}
			
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
