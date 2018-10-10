package S2_LE1;

//fig 7.15 gradebooktest.java

public class GradeBookTest {
    //main method begins execution
    public static void main(String[] args) {
        //array of grades
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("CS101 Intro to Java Programming", gradesArray);
        System.out.printf("Welcome to the gradebook for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
