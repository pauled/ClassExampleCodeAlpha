package weekX.example3;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestGrade {

    @Test
    public void testGrade() {
        Map<Integer, String> testCases = Map.ofEntries(
                Map.entry(100, "A+"),
                Map.entry(97, "A+"),
                Map.entry(99, "A+"),
                Map.entry(96, "A"),
                Map.entry(93, "A"),
                Map.entry(92, "A-"),
                Map.entry(90, "A-"),
                Map.entry(87, "B+"),
                Map.entry(89, "B+"),
                Map.entry(86, "B"),
                Map.entry(83, "B"),
                Map.entry(82, "B-"),
                Map.entry(80, "B-"),
                Map.entry(77, "C+"),
                Map.entry(79, "C+"),
                Map.entry(76, "C"),
                Map.entry(73, "C"),
                Map.entry(72, "C-"),
                Map.entry(70, "C-"),
                Map.entry(67, "D+"),
                Map.entry(69, "D+"),
                Map.entry(66, "D"),
                Map.entry(63, "D"),
                Map.entry(62, "D-"),
                Map.entry(60, "D-"),
                Map.entry(59, "F"),
                Map.entry(0, "F"),
                Map.entry(1, "F"),
                Map.entry(2, "F"),
                Map.entry(5, "F"),
                Map.entry(9, "F"),
                Map.entry(10, "F"),
                Map.entry(12, "F"),
                Map.entry(16, "F"),
                Map.entry(18, "F"),
                Map.entry(21, "F"),
                Map.entry(24, "F"),
                Map.entry(27, "F"),
                Map.entry(30, "F"),
                Map.entry(34, "F"),
                Map.entry(39, "F"),
                Map.entry(42, "F"),
                Map.entry(45, "F"),
                Map.entry(49, "F"),
                Map.entry(51, "F"),
                Map.entry(54, "F"),
                Map.entry(58, "F"),
                Map.entry(57, "F"),
                Map.entry(-1, "Invalid Grade"),
                Map.entry(101, "Invalid Grade"),
                Map.entry(1000, "Invalid Grade"),
                Map.entry(1100, "Invalid Grade"),
                Map.entry(199, "Invalid Grade"),
                Map.entry(-99, "Invalid Grade"),
                Map.entry(-80, "Invalid Grade"),
                Map.entry(-76, "Invalid Grade"),
                Map.entry(1000000, "Invalid Grade"),
                Map.entry(-1000000, "Invalid Grade"),
                Map.entry(160, "Invalid Grade"),
                Map.entry(Integer.MAX_VALUE, "Invalid Grade"),
                Map.entry(Integer.MIN_VALUE, "Invalid Grade")
        );

        for (int grade : testCases.keySet()) {
            String actual = ComputingGrades.computeGrade(grade);
            String expected = testCases.get(grade);
            assertEquals("input: " + grade + " | expected: " + expected + " | actual: " + actual, expected, actual);
        }
    }

}
