package UNIT1;
//WAP in Java to display the Rupee symbol using Unicode escape sequences and UTF-8 encoding.
public class UnicodeCharacterExample {
    
    public static void main(String[] args) throws Exception {
	//Storing the Rupee symbol using a Unicode escape sequence
	String string = "\u20B9";
    
        //Converting the string into UTF-8 byte representation
        byte[] utf8 = string.getBytes("UTF-8");

	//Reconstructing the string using UTF-8 encoding
	string = new String(utf8, "UTF-8");

	//Displaying the Rupee symbol
	System.out.println(string);
    }
}