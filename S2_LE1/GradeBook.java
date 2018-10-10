package S2_LE1;

//fig 7.14 gradebook.java

public class GradeBook {
    private String courseName; // name of course
    private int[] grades; //array for grades

    public GradeBook(String courseName, int[] grades) {
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

        //calculate average grade
        System.out.printf("%nClass average is %.2f%n", getAverage());

        //get  minimum and maximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        //print grade distribution chart
        outputBarChart();
    }

    public int getMinimum() { //find min grade
        int lowGrade = grades[0]; //assuming grades[0] is smallest
        for (int grade : grades) {
            //if lower than lowGrade assign to lowGrade
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum() { //find max grade
        int highGrade = grades[0]; //assuming grades[0] is largest
        for (int grade : grades) {
            //if higher than highGrade assign to highGrade
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }

    //get average grade
    public double getAverage() {
        int total = 0;

        //sum grades for one student
        for (int grade : grades) {
            total += grade;
        }
        //return average of grades
        return (double) total / grades.length;
    }

    //output bar chart
    public void outputBarChart() {
        System.out.println("Grade Distribution: ");

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

        //output each students grade
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }
}
