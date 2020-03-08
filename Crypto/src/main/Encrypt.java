import java.io.*;

public class Encrypt {

    public static void main(String[] args)throws Exception {

        ROT13 rot13 = new ROT13();
        File file = new File("/Users/maydin/Documents/Labs/Week5/SimpleCrypt/Crypto/src/resources/sonnet18.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder string = new StringBuilder();


        String line = br.readLine() ;
        while (line != null){
            string.append(line).append("\n");
            line = br.readLine();
        }

        String fileString = string.toString();
        String encryptedFile = rot13.encrypt(fileString);

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/maydin/Documents/Labs/Week5/SimpleCrypt/Crypto/src/resources/sonnet18.enc"));
        bw.write(encryptedFile);
        bw.close();
        System.out.println(encryptedFile);

    }
}


