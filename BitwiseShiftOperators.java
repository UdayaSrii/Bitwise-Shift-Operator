public class BitwiseShiftOperators {
    // Create a byte array with 8 elements
    public static void main(String[] args) {
        // Give the byte array a name
        int number = 8; 
        int leftShift = number << 2; 
        int rightShift = number >> 2;
        // Print the results
        System.out.println("Original number: " + number + " (Binary: "  + Integer.toBinaryString(leftShift) + ")");
        System.out.println("Original number: " + number + " (Binary: "  + Integer.toBinaryString(rightShift) + ")");
    }
}

