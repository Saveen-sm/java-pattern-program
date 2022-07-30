class Pattern5
{
	public static void main(String[] args) 
	{
		int n=9;
		for(int i=0;i<n;i++)
		{
			int a=1;
			char ch='a';
			for(int j=0;j<n;j++)
			{
				if(i<n/2 || i>n/2)
				{
					if(i%2==0)
					{
						System.out.print(a++ +" ");
					}
					else
						System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print("$" +" ");
				}
				
			}
		System.out.println();
		}
	}
}
