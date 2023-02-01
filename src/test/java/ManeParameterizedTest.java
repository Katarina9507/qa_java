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
                {"Самка", false}
        };
    }
    @Test
    public void isHaveManeTest() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(lionType, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(mane, actual);
    }
}