import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;

    public LionParameterizedTest (String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][]{
                {null},
                {" "},
                {"Не указан"},
                {"Сам"},
                {"СамецСамка"},
                {"Самка "},
        };
    }

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void doesHaveManeLionReturnsException () throws Exception {
        Lion lion = new Lion (sex, feline);
        lion.doesHaveMane();
    }
}
