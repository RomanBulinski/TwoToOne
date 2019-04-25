import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test() {
        assertEquals("aehrsty", Main.longest("aretheyhere", "yestheyarehere"));
    }

    @Test
    public void test2() {
        assertEquals("acefghilmnoprstuy", Main.longest("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void test3() {
        assertEquals("abcdefghilnoprstu", Main.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

}
