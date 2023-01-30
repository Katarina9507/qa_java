import com.animals.Cat;
import com.animals.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {
    @Test
    public void getSoundCatTest()  {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String voice = cat.getSound();
        Assert.assertEquals("Мяу", voice);
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}