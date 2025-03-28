class Return2
{
	public static void main(String[]Args)
	{
		String Fullname=mergeName("Pratik","Chaudhari");
		System.out.println(Fullname);
	}
	public static String mergeName(String fName,String lName)
	{
		String ans= fName+lName;
		return ans;
	}
}