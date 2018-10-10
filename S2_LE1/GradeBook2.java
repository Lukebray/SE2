package S2_LE1;

//fig 7.14 gradebook.java

public class GradeBook2 {
    private String courseName; // name of course
    private int[][] grades; //array for grades

    public GradeBook2(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    //method to set coursename
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //method to get course name
    public String getCourseName() {
        return courseName;
    }

    //perform operation on data
    public void processGrades() {
        //output array
        outputGrades();

        //get  minimum and maximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        //print grade distribution chart
        outputBarChart();
    }

    public int getMinimum() { //find min grade
        int lowGrade = grades[0][0]; //assuming grades[0] is smallest
        for (int[] studentGrades : grades) { //loop through rows
            for (int grade : studentGrades) { //loop through columns
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum() { //find max grade
        int highGrade = grades[0][0]; //assuming grades[0] is largest
        for (int[] studentGrades : grades) { //loop through rows of grades array
            for (int grade : studentGrades)
                if (grade > highGrade)
                    highGrade = grade;
        }
        return highGrade;
    }

    //get average grade
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        //sum grades for one student
        for (int grade : setOfGrades) {
            total += grade;
        }
        //return average of grades
        return (double) total / setOfGrades.length;
    }

    //output bar chart
    public void outputBarChart() {
        System.out.println("Grade Distribution: ");

        //stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        //for each grade in gradeBook increment frequency
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade/10];
            }
        }

        //for each freq print a bar in chart
        for (int count = 0; count < frequency.length; count++) {
            //output bar label ("00-09: ...")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            //print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.println("*");
            }
            System.out.println();
        }
        }
    //output contents of grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("              "); //align column heads

        //create column heading for each test
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test+1);
        }

        System.out.println("Average"); //student average column heading

        //create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
        }

        for (int test : grades[student]) //output students grades
            System.out.printf("%8d", test);

        //output each students grade
        double average = getAverage(grades[student]);
        System.out.printf("%9.2f%n", average);
        }
    }

