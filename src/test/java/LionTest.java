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
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        int expected = 5;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        Assert.assertEquals("Некорректный результат вызова метода", List.of("Животные", "Птицы", "Рыба"), actual);
    }
}