class App53 
{
	public static void main(String[] args) 
	{
		int[][] x;
		x=new int[3][];

		x[0]=new int[]{10,20,30,45,67,89,01};
		x[1]=new int[]{11,12};
		x[2]=new int[]{11,22,33,44};

		/*
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("\n");
		}
		*/

		
		for(int[] y:x)
		{
			for(int z:y)
				System.out.print(z+"\t");
			System.out.println("\n");
		}
		
	}
}
