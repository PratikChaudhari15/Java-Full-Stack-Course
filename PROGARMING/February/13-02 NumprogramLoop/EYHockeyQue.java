public class DangerousSituation {
    public static boolean isDangerous(String situation) {
        // Check for 7 or more consecutive '0's or '1's
        return situation.contains("0000000") || situation.contains("1111111");
    }

    public static void main(String[] args) {
        String situation1 = "0100110111111101";
        String situation2 = "1110111011101";

        System.out.println(isDangerous(situation1)); // Output: true
        System.out.println(isDangerous(situation2)); // Output: false
    }
}