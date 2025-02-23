class Q124FascinatingNumberWithString
{
	//A fascinating number is a positive integer, with at least three digits, which, when multiplied by 2 and 3, and subsequently concatenated with the original number, produces a string containing all digits from 1 to 9 exactly once. No zeros are permitted in the resulting string
	// 192 is a fascinating number because: 192 * 2 = 384, 192 * 3 = 576, and Concatenating these results: 192384576.
	public static void main(String[] args)
	{
		int num= 327; //192
		String str = num+""+(num*2)+(num*3);
		boolean flag = true;
		//loop which starts from 1 to 9 characters
		for (char i='1';i<='9' ;i++ ) 
		{
			int cnt = 0; //inti char count is equal to zero for every new character
			//fetch char from string one by one from 0 index
			for (int j=0;j<str.length() ;j++ ) 
			{
				char ch = str.charAt(j); //char fetch is stored in var ch
				if(ch==i)//if i char matches with ch char if executes
					cnt++; //increment the count if cnd satisfy
			}
			if(cnt!=1)//if cnt of char is not equal to 1 then if executes
			{
				flag = false; //re inti the flag is cnt is not equal to 1 
				break; //terminates the loop
			}
		}
		if(flag)
		{
			System.out.println(num+" is fascinating Number");
		}
		else{
			System.out.println(num+" is not fascinating Number");
		}

	}
}
