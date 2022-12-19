import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void eatMeatFelineZeroArgument () throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

    @Test
    public void getFoodFelineWithPredatorArgument () throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyFelineReturnsFelineValue (){
        Feline feline = new Feline ();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensFelineZeroArgument (){
        Feline feline = new Feline ();
        Assert.assertEquals(1, feline.getKittens());
    }
}
