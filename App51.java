class App51 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};

		int[] b=a;

		for(int i=0;i<b.length;i++)
			b[i]=b[i]+5;

		for(int t:a)
		{
			System.out.println(t);
		}

	}
}
