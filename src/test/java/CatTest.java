import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundCatReturnsCorrectValue (){
        Cat cat = new Cat (feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatZeroArgument () throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat (feline);
        Assert.assertEquals(feline.getFood("Хищник"), cat.getFood());
    }
}
