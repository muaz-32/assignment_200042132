package assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalenderTest {
    Calender calender = new Calender();
    @Test
    void nextDateNewDay(){
        String nextday = calender.nextDay(1, 3, 2021);
        assertEquals("2/3/2021", nextday);
    }
    @Test
    void nextDateNewMonth(){
        String nextday = calender.nextDay(30, 4, 2021);
        assertEquals("1/5/2021", nextday);
    }
    @Test
    void nextDateNewYear(){
        String nextday = calender.nextDay(31, 12, 2021);
        assertEquals("1/1/2022", nextday);
    }
    @Test
    void nextDateFeb29(){
        String nextday = calender.nextDay(28, 2, 2020);
        assertEquals("29/2/2020", nextday);
    }
}