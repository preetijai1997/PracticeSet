package test;

public class Assignment4 {

	public static void main(String[] args) {
		
		
		String name="Preeti 12 34 + 5";
		
		/*char[] charArray=name.toCharArray(); //[p,r,e,e,t,i,1,2, ,3,4, ,+, ,5]
		
		//StringBuilder sb= new StringBuilder();
		int count =0;
		int sum=0;
		for(char c: charArray)
		{
			if(Character.isDigit(c))
			{
				sum=sum+Character.getNumericValue(c);
				count++;
			}
		}
		
		System.out.println("Sum of num is : "+ sum );
		System.out.println("Total num of digit is : "+ count);
		
*/
		int sum=0;
		for(int i=0; i<name.length();i++)
		{
			
			           char name1=name.charAt(i);
			           if(Character.isDigit(name1))
			           {
			        	   sum=sum+Character.getNumericValue(name1);
			           }
		}
		System.out.println("Sum of digits is : "+ sum);
	}

}
