class Pattern9 
{
	public static void main(String[] args) 
	{
		int n=8   ,a=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==2)
				{
					System.out.print(a++ +" ");
				}
				else if(i==1 || i==3)
				{
					System.out.print(ch++ +" ");
				}
			}
		System.out.println();
		}
	}
}
