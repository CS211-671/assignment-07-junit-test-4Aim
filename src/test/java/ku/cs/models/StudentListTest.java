package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddNewStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405832", "Fame");
        studentList.addNewStudent("661040583x", "Famx");
        studentList.addNewStudent("66104058xx", "Faxx");
        Student actual = studentList.findStudentById("6610405832");
        assertEquals("Fame", actual.getName());
    }
    @Test
    void testFindStudentBuyId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405832", "Fame");
        studentList.addNewStudent("661040583x", "Famx");
        studentList.addNewStudent("66104058xx", "Faxx");
        Student actual = studentList.findStudentById("6610405832");
        assertEquals("Fame", actual.getName());
    }

    @Test
    void testGiveScoreToId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405832", "Fame", 50);
        studentList.addNewStudent("661040583x", "Famx", 50);
        studentList.addNewStudent("66104058xx", "Faxx", 50);
        studentList.giveScoreToId("6610405832", 50);
        double expectedScore = 100;
        double actualScore = studentList.findStudentById("6610405832").getScore();
        assertEquals(expectedScore, actualScore);
    }
    @Test
    void testViewGradeOfId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610405832", "Fame", 80);
        studentList.addNewStudent("661040583x", "Famx", 60);
        studentList.addNewStudent("66104058xx", "Faxx", 40);
        String Expected = "A";
        String Actual = studentList.viewGradeOfId("6610405832");
    }
}