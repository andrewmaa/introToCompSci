package ten;

public class problem4 {
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        // create variable to store decimal value
        int decimal = 0;

        // for each character in the binary string
        for (int i = 0; i < binaryString.length(); i++) {

            // assign character at index i
            char c = binaryString.charAt(i);

            // if the character is a binary digit, multiple by 2 (shift left) and add the digit 
            if (c == '0' || c == '1') {
                decimal = decimal * 2 + (c - '0');
            } 
            // otherwise throw an exception
            else {
                throw new NumberFormatException("The string is not a binary string");
            }
        }

        // return the computed decimal value
        return decimal;
    }
}
