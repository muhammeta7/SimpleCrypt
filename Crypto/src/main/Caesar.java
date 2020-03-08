public class Caesar extends Cipher {

    Caesar() {
        setShift(3);
        setDecryptShift(23);
    }

    public String encrypt(String text) {
        return crypt(text, getShift());
    }

    public String decrypt(String text) {
        return crypt(text, getDecryptShift());
    }

}


