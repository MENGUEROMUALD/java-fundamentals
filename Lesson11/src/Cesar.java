public class Cesar {
	 static char START_LOWER_CASE_ALPHABET = 'a'; 
     static char END_LOWER_CASE_ALPHABET = 'z';  
     static char START_UPPER_CASE_ALPHABET = 'A'; 
     static char END_UPPER_CASE_ALPHABET = 'Z';   
     static int ALPHABET_SIZE = 'Z' - 'A' + 1; 
     
	public static void main(String[] args) {
		
        String texteSimple = "Mr Akah aime trop les exercices dur pour rien";
        System.out.println("le text est   : " + texteSimple);
        String ciphertext = caesarCipherEncrypt(texteSimple, 5);
        System.out.println("Ciphertext : " + ciphertext);
        String decrypted = caesarCipherDecrypt(ciphertext, 5);
        System.out.println("Decrypte  : " + decrypted);
        
    }
    public static String caesarCipherEncrypt(String plaintext, int shift) {
        return caesarCipher(plaintext, shift, true);
    }
    public static String caesarCipherDecrypt(String ciphertext, int shift) {
        return caesarCipher(ciphertext, shift, false);
    }
    private static String caesarCipher(String input, int shift, boolean encrypt) {
        StringBuilder output = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            int calculatedShift = (encrypt) ? shift : (ALPHABET_SIZE - shift);
            char startOfAlphabet;
            if ((inputChar >= START_LOWER_CASE_ALPHABET)
                    && (inputChar <= END_LOWER_CASE_ALPHABET)) {
                startOfAlphabet = START_LOWER_CASE_ALPHABET;
            } else if ((inputChar >= START_UPPER_CASE_ALPHABET)
                    && (inputChar <= END_UPPER_CASE_ALPHABET)) {
                startOfAlphabet = START_UPPER_CASE_ALPHABET;
            } else {
                output.append(inputChar);
                continue;
            }                
            int inputCharIndex =
                    inputChar - startOfAlphabet;
            int outputCharIndex =
                    (inputCharIndex + calculatedShift) % ALPHABET_SIZE;
            char outputChar =
                    (char) (outputCharIndex + startOfAlphabet);
            output.append(outputChar);
        }
        return output.toString();
    }

}