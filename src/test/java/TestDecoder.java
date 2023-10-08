import org.junit.jupiter.api.Test;
import org.example.Decoder;
import org.junit.jupiter.api.Assertions;
public class TestDecoder {
    @Test
    public void testVowelReplacement(){
        String encodedMessage1 = "M4nk2y";
        String encodedMessage2 = "1m1t4r";

        String decodedMessage1 = Decoder.vowelReplacement(encodedMessage1);
        String decodedMessage2 = Decoder.vowelReplacement(encodedMessage2);

        Assertions.assertEquals("Monkey", decodedMessage1);
        Assertions.assertEquals("amator", decodedMessage2);
    }
    @Test
    public void testConsonantReplacement(){
        String encodedMessage1 = "sbdjtn";
        String encodedMessage2 = "fyqfsjfodf";

        String decodedMessage1 = Decoder.consonantReplacement(encodedMessage1);
        String decodedMessage2 = Decoder.consonantReplacement(encodedMessage2);

        Assertions.assertEquals("racism", decodedMessage1);
        Assertions.assertEquals("experience", decodedMessage2);
    }

    @Test
    public void testDecodeMessage(){
        String encodedMessage1 = "5n3v2rs2";
        String decodedMessage1 = Decoder.decodeMessage(encodedMessage1);
        Assertions.assertEquals("universe", decodedMessage1);

        String encodedMessage2 = "Bnbajoh";
        String decodedMessage2 = Decoder.decodeMessage(encodedMessage2);
        Assertions.assertEquals("Amazing", decodedMessage2);
    }
}
