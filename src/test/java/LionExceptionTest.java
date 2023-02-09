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
    public void lionInvalidSexException() throws Exception {
        Lion lion = new Lion(LION_SEX, feline);
    }
}
