import com.animals.Feline;
import com.animals.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void haveManeKingTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean mane =  lion.doesHaveMane();
        Assert.assertTrue(mane);
    }

    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(5);
        Assert.assertEquals(5, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertEquals("Некорректный результат вызова метода", List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void LionWhenSexIsMaleHasManeIsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(true, actual);
    }

    @Test
    public void LionWhenSexIsFemaleHasManeIsFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(false, actual);
    }
}