package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void testAddScore() {
        Student s1 = new Student("6xxxxxxxxx", "Fame");
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }
    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6xxxxxxxxx", "Fame", 50);
        s1.addScore(10);
        assertEquals("C", s1.grade());
    }
    @Test
    void testChangeName(){
        Student s1 = new Student("6xxxxxxxxx", "Fame", 50);
        s1.changeName("Test");
        assertEquals("Test", s1.getName());
    }
    @Test
    void testIsId(){
        Student s1 = new Student("6xxxxxxxxx", "Fame", 50);
        assertTrue(s1.isId("6xxxxxxxxx"));
        assertFalse(s1.isId("xxxxxxxxxxx"));
    }

}