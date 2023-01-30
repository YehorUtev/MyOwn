import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    public static boolean numberEqual(){
        return 10 == 100/10;
    }
    public static int getNumber(int a, int b){
        return a + b;
    }
    @Test
    public void add(){
        int result = getNumber(10,5);
        assertEquals(15, result);
    }
    @Test
    public void test(){
        boolean result = numberEqual();
        assertEquals(true,result);
    }
}
