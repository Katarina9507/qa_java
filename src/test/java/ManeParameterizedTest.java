import com.animals.Feline;
import com.animals.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ManeParameterizedTest {
    private final String lionType;
    private final boolean mane;

    public ManeParameterizedTest(String lionType, boolean mane){
        this.lionType = lionType;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Иное", false},
        };
    }
    @Test
    public void isHaveManeTest() {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(lionType, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(mane, actual);
        }
        catch (Exception exception) {
            Assert.assertEquals(exception.getMessage(),"Используйте допустимые значения пола животного - самец или самка");
        }
    }

}