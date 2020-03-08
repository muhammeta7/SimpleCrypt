import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {

    @Test
    public void encryptTest(){
        // Given
        Caesar caesar = new Caesar();
        String string = "The cat in the hat!";
        String expected = "Wkh fdw lq wkh kdw!";

        // When
        String actual = caesar.encrypt(string);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptTest(){
        // Given
        Caesar caesar = new Caesar();
        String string = "The cat in the hat!";
        String expected = "Qeb zxq fk qeb exq!";

        // When
        String actual = caesar.decrypt(string);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
