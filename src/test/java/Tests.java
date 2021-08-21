import com.methods.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    String[] letters = {"a", "e", "i", "o", "u"};

    @Test
    public void firsTest(){
        Methods vowelsTest = new Methods();
        Assert.assertTrue(vowelsTest.vowels(letters), "You are missing letters");
    }

}
