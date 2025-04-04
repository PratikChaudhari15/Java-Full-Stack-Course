class ConfirStat6
{
	static String AppName;
	static int version;

	static{
		AppName = "myApp";
		version = 21;
		System.out.println("Configuration Loaded: " + AppName + " v" + version);
	}
	public static void main(String[] args) 
	{
		System.out.println("Application is Running...");
		System.out.println(AppName);
	}
}