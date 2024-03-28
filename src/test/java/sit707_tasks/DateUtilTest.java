package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {
    
    @Test
    public void testStudentIdentity() {
        String studentId = "s22";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Nipuna Samaraweera";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testMaxJanuary31ShouldIncrementToFebruary1() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testMaxJanuary31ShouldDecrementToJanuary30() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    @Test
    public void testNominalJanuary() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        date.increment();
    }
    
    @Test
    public void testMinJanuary1ShouldIncrementToJanuary2() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    @Test
    public void testMinJanuary1ShouldDecrementToDecember31() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
    
    @Test
    public void testMaxFebruary28ShouldIncrementToFebruary29() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    @Test
    public void testMaxFebruary28ShouldDecrementToFebruary27() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.decrement();
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
 // Test cases for calculating the next date
    @Test
    public void testNextDate1B() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate2B() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate3B() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    
    //test cases for February with a leap year condition
    @Test
    public void testLeapYearFebruary29ShouldIncrementToMarch1() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testLeapYearFebruary29ShouldDecrementToFebruary28() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }



}

