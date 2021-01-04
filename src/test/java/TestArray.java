import Lesson_6.LessonSix;
import org.junit.*;

public class TestArray {

    @Test
    public void testFirstArrayAfterFourth(){
        int [] in = new int[]{1,3,4,5,5,6,8};
        int [] out = new int []{5,5,6,8};
        Assert.assertArrayEquals(out, LessonSix.arrayAfterFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void testSecondArrayAfterFourth(){
        int[] in = new int[]{1,3,5,5,6,8};
        LessonSix.arrayAfterFour(in);
    }

    @Test
    public void testFirstArrayContainsOnlyOneAndFour(){
        int[] in = new int[]{1,3,4,5};
        Assert.assertFalse(LessonSix.arrayContainsOnlyOneAndFour(in));
    }

    @Test
    public void testSecondArrayContainsOnlyOneAndFour(){
        int[] in = new int[]{1,4,1};
        Assert.assertTrue(LessonSix.arrayContainsOnlyOneAndFour(in));

    }

    @Test
    public void testAdd(){
        Assert.assertEquals(5, LessonSix.add(2,3));
    }


}
