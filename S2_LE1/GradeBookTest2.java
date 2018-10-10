package S2_LE1;

//fig 7.16 gradebooktest.java

public class GradeBookTest2 {
    //main method begins execution
    public static void main(String[] args) {
        //array of grades
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};

        GradeBook2 myGradeBook = new GradeBook2("CS101 Intro to Java Programming", gradesArray);
        System.out.printf("Welcome to the gradebook for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
