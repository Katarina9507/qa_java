import com.animals.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class KittenParameterizedTest {
    private final int kitten;
    public KittenParameterizedTest(int kitten){
        this.kitten = kitten;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {0},
                {1},
                {7},
        };
    }

    @Test
    public void getKittensWithArgumentTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kitten);
        Assert.assertEquals(kitten, actual);
    }
}