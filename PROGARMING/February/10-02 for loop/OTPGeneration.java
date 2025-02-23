class OTPGeneration 
{
    public static void main(String[] args) 
    {
        String otp = ""; // Initialize an empty string to store OTP

        for (int cnt = 1; cnt <= 10;)  // Generate 10 OTPs
        {
            otp += (int) (Math.random() * 1000000); 
            // Generate a random number (0-999999) and append to OTP string

            if (otp.length() == 6)  
            // Check if the OTP length is exactly 6 digits
            {
                System.out.println(otp); // Print the OTP
                cnt++; 
                // Increment counter only when a valid OTP is generated
        	}

            otp = ""; // Reset OTP string for the next iteration
        }
    }
}
