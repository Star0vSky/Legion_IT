import lesson_05_Hash_Map_Set.HomeWork05_01;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class HomeWork05_01_Test {


//////////////////    А эти первые три теста тоже правильные?    ////////////////////

    @Test
    public void NullTest() {

        Integer day = 1;
        String realDays = HomeWork05_01.daysOfWeek(day);

        assertNotNull(realDays, "Null was returned");
    }

    @Test
    public void BlankTest() {

        Integer day = 1;
        String realDays = HomeWork05_01.daysOfWeek(day);

        Assertions.assertFalse(realDays.isBlank(), "Day of the week blank");
    }

    @Test
    public void EmptyTest() {

        Integer day = 1;
        String realDays = HomeWork05_01.daysOfWeek(day);

        Assertions.assertFalse(realDays.isEmpty(), "Day of the week is empty");
    }



////////////////////////////    New Tests    ///////////////////////////////


    @ParameterizedTest
    @DisplayName("Day of week is empty Test")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})

        public void EmptyTest(int day) {

            String days = "";
            String realDays = HomeWork05_01.daysOfWeek(day);

            Assertions.assertNotEquals(days, realDays, "Result is incorrect");
        }


    @Test
    public void DaysOfWeek1Test() {

        Integer day = 4;
        String days = "Wednesday";
        String realDays = HomeWork05_01.daysOfWeek(day);

        Assertions.assertEquals(realDays, days, "Result is incorrect");
    }

    @ParameterizedTest
    @CsvSource({"1, Sunday", "2, Monday", "3, Tuesday", "4, Wednesday", "5, Thursday", "6, Friday", "7, Saturday"})
    public void scvParamsTest(int day, String days) {
        String realDays = HomeWork05_01.daysOfWeek(day);
        Assertions.assertEquals(realDays, days, "Result is incorrect");
    }


    @Test
    @DisplayName("Null Pointer Exception Test")
    public void nullNumberOfDay() {

        assertThrows(NullPointerException.class, () -> {
            HomeWork05_01.daysOfWeek(null);
        });
    }


    @Test
    @DisplayName("Maximum range Test")
    public void BigPositiveNumberOfDaysTest() {

        Integer day = 8;
        String realDays = HomeWork05_01.daysOfWeek(day);

        Assertions.assertEquals("The number should be equal or smaller than 7", realDays, "Max number range test failed");
    }

    @Test
    @DisplayName("Minimum range Test")
    public void NegativeNumberOfDaysTest() {

        Integer day = -1;
        String realDays = HomeWork05_01.daysOfWeek(day);

        Assertions.assertEquals("The number should be equal or larger than 1", realDays, "Mix number range test failed");
    }

}