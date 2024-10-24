class App52 
{
	public static void main(String[] args) 
	{
		int[][] a={{10,20,30,40,50},
				   {11,22,33,44,55},
			       {11,12,13,14,15}};

		System.out.println("Elements of matrix..");
		for(int[] y:a)
		{
			for(int z:y)
				System.out.print(z+"\t");
			System.out.println("\n");
		}
	}
}