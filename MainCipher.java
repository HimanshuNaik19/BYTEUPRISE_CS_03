public class MainCipher {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();

        String txt = "Hello This is the project of Caesar Cipher for byte Uprising internship";
        int shift = 5;

        String encrypted = cipher.Encrypt(txt, shift);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = cipher.decrypt(encrypted, shift);
        System.out.println("Decrypted: " + decrypted);
    }
}
