import com.animals.Animal;
import com.animals.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyFelineTest() {
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void getFoodFelineTest() throws Exception {
        List<String> food = feline.getFood("Хищник");
        Assert.assertEquals("Получен некорректный список", List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyOfAnimalTest() {
        Animal animal = new Animal();
        String family = animal.getFamily();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", family);
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getHerbivoreFood() throws Exception {
        List<String> actualResult = feline.getFood("Травоядное");
        Assert.assertEquals("Получен некорректный список", List.of("Трава", "Различные растения"), actualResult);
    }

    @Test
    public void getKittensTest() {
        int kittens = feline.getKittens();
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithParameterTest() {
        int kittens = feline.getKittens(10);
        Assert.assertEquals(10, kittens);
    }
}