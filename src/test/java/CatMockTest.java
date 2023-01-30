import com.animals.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    Feline feline;
    @Test
    public void getFoodCatTest() throws Exception {
        feline.getFood("Кошачьи");
        Mockito.verify(feline).getFood(Mockito.anyString( ));
    }
}