package week7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LearnTimeStamping {

    public static void main(String[] args) {
        // raw -->2026-04-13T11:37:32.726596900
       System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE_dd-MM-yyyy_ss_a")));
       // normalized data --> 
    }
}
