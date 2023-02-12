package test;

public class Assignment5 {

	public static void main(String[] args) {
		
		String name="25 feb 2023";//25feb2023
		StringBuilder sb= new StringBuilder();
		
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			char name1=name.charAt(i);
			
			if(name1!=' ')
			{
				sb.append(name1);
			}
			
			if(Character.isDigit(name1))
			{
				sum=sum+Character.getNumericValue(name1);
			}
		}
		
		System.out.println("Sum of digits is :" + sum + " "+ sb);
	}

}
