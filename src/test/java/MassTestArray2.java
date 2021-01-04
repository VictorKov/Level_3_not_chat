import Lesson_6.LessonSix;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestArray2 {
    private int[] in;
    private boolean flag;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 5, 4, 7, 8}, false},
                {new int[]{1, 1, 4}, true},
                {new int[]{4, 4, 4, 4}, false},
                {new int[]{1, 1, 1, 1, 1, 1}, false}
        });
    }

    public MassTestArray2(int[] in, boolean flag) {
        this.in = in;
        this.flag = flag;
    }

    @Test
    public void massTestArrayContainsOnlyOneAndFour() {
        Assert.assertEquals(flag, LessonSix.arrayContainsOnlyOneAndFour(in));
    }

}
