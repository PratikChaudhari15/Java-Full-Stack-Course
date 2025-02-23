 class Census
 {
	 public static void main(String []args)
	 {
		long currPop = 312032486;
		final long second = (365*24*60*60)*5;
		long birth = second/7;
		long death = second/13;
		long imm = second/45;

		long newPop = currPop+birth-death+imm;

		System.out.println("Current population is: "+currPop);
		System.out.println("New Population is: "+newPop);
	 }
 }