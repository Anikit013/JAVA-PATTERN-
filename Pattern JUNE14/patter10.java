
class pattern10
{
	public static void main(String[] args)
	{
		int rows=5;
		int star=1;
		char ch='A';
		int count=1;
		
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=star;j++)
			{
				if (i%2==0)
				{
					System.out.print(ch);
					ch++;
				}
				else 
				{
					System.out.print(count);
					count++;
				}
				
			}
			star++;
			
			
		System.out.println();
		
		
	
		}
	}
}

