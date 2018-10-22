package S2_LE1;

//fig 7.14 gradebook.java
/*
Luke Bray
B00100787
22/10/2018
 */
public class GradeBook {
    private String courseName; //name of course
    private int[] grades; //array for grades. grades must be ints

    public GradeBook(String courseName, int[] grades) { //constructor of string and array of grades
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
        outputGrades(); //declared further down

        //calculate average grade
        System.out.printf("%nClass average is %.2f%n", getAverage()); //average 2 decimal places

        //get  minimum and maximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        //print grade distribution chart
        outputBarChart();
    }

    public int getMinimum() { //find min grade. There are standard methods to do this
        int lowGrade = grades[0]; //assuming grades[0] is smallest
        for (int grade : grades) { //for each grade in array
            //if lower than lowGrade assign to lowGrade
            //reordering from lowest to highest
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum() { //find max grade. There are standard methods to do this
        int highGrade = grades[0]; //assuming grades[0] is largest
        for (int grade : grades) { //for each grade in the array
            //if higher than highGrade assign to highGrade
            //reordering from highest to lowest
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }

    //get average grade. There are standard methods to do this
    public double getAverage() { //average will be a double
        int total = 0;

        //sum grades for one student
        for (int grade : grades) { //for each grade in grades
            total += grade; //the total of all the grade in the array grades
        }
        //return average of grades
        return (double) total / grades.length; //this is the mean
    }

    //output bar chart
    public void outputBarChart() {
        System.out.println("Grade Distribution: "); //title of chart

        //stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        //for each grade increment frequency
        for (int grade : grades) {
            ++frequency[grade/10];
        }

        //for each freq print a bar in chart
        for (int count = 0; count < frequency.length; count++) {
            //output bar label ("00-09: ...")
            if (count == 10) {
                System.out.printf("%5d: ", 100); //aligns 100 with everything else. Put it to the right of 5 characters
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9); //shows ranges eg 70-79
            }

            //print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++) { //can print a max of 10 stars
                System.out.println("*");
            }
            System.out.println();
        }
        }
    //output contents of grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        //output each students grade
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }
}
