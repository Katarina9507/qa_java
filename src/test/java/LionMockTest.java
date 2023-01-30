import com.animals.Feline;
import com.animals.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodLionTest() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(5);
        Assert.assertEquals(5, lion.getKittens( ));
    }
}