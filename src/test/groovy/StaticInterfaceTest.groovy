import org.junit.Test

class StaticInterfaceTest {
    @Test
    void callStaticMethod() {
        Integer result = ClassWithSameStaticMethod.staticMethod();

        assert result == 42
    }
}
