import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManePositiveParameterizedTest {

    private final String sex;
    private final boolean expectedResult;

    public LionManePositiveParameterizedTest (String sex, boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeLionReturnsCorrectValue () throws Exception {
        Lion lion = new Lion (sex, feline);
        assertEquals(expectedResult, lion.doesHaveMane());
    }
}