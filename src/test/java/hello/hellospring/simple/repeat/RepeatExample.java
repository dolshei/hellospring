package hello.hellospring.simple.repeat;

import org.junit.jupiter.api.DisplayName;

public class RepeatExample {

    @DisplayName("구구단")
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + "x" + n +"="+ (m*n));
            }
        }
    }
}
