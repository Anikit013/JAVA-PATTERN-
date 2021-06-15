
class pattern8
{
	public static void main(String[] args)
	{
		int rows=5;
		int star=1;
		
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=star;j++)
			{
				if (j%2==0)
				{
					System.out.print(1);
				}
				else 
				{
					System.out.print(0);
				}
			}
		System.out.println();
		star++;
	
		}
	}
}

