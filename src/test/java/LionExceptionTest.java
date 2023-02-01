import com.animals.Feline;
import com.animals.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionTest {

    Feline feline;
    private final String LION_SEX;

    public LionExceptionTest(String Sex) {
        this.LION_SEX = Sex;
    }

    @Parameterized.Parameters()
    public static Object[] invalidLionSexes() {
        return new Object[]{
                null,
                "Лев",
                "Львица",
                "Male",
                "Female",
                "Львёнок"
        };
    }

    @Test(expected = java.lang.Exception.class)
    public void LionInvalidSexException() throws Exception {
        try {
            Lion lion = new Lion(LION_SEX, feline);
        } catch (Exception exception) {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
