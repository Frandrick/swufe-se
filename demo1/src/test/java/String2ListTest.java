import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class String2ListTest {
    void toList() {
        String a = "apple-orange";
        List<String> s = String2List.toList(a);
        assertLinesMatch(String2List.toList(a), s);
    }
}