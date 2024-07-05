public class CaesarCipher {
    public String Encrypt(String txt, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char encryptedChar = (char) ((ch - base + shift) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public String decrypt(String txt, int shift) {
        return Encrypt(txt, 26 - shift);
    }
}
