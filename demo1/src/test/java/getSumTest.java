import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

class getSumTest {

    @Test
    void TimeDemo() {
        Instant start = Instant.now();
        getSum(100000000);
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());
        Instant start1 = Instant.now();
        getSum1(100000000);
        Instant end1 = Instant.now();
        System.out.println(Duration.between(start1,end1).toMillis());
    }
    public int getSum(int i){
        Integer sum=0;
        for (int j = 0; j < i; j++) {
            sum+=j;
        }
        return sum;
    }
    public int getSum1(int i){
        int sum=0;
        for (int j = 0; j < i; j++) {
            sum+=j;
        }
        return sum;
    }
}