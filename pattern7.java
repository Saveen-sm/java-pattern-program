class pattern7 
{
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i==0||i==n-1||j==0||j==n-1)//outer lines of square
				//if(i==0||i==n-1||j==0||j==n-1||i==j)//diagonal from left corner 
				//if(i==0||i==n-1||j==0||j==n-1||j+i==(n-1))//diagonal from right corner
				//if(i==0||i==n-1||j==0||j==(n-1)||i==n/2)//outer lines +center row
				if(i==0||i==n-1||j==0||j==n-1||j==n/2)//outer lines +center column
				{
					System.out.print("*" + " ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
