import com.google.common.base.Splitter;

import java.util.List;

public class String2List {
    private static String Strings() {
        return "apple-orange-juice";
    }

    public static List<String> toList(String s) {
        return Splitter.on("-").trimResults().splitToList(s);
    }

    public void main(String[] args) {
        List<String> strings = toList(Strings());
        System.out.println(strings);
    }
}
