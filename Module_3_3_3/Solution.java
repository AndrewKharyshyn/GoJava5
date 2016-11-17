package Module_3_3_3;

public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(23/12/2017, "Math");
        Course course2 = new Course(05/4/2017, "Literature");
        Course course3 = new Course(11/5/2016, "History");
        Course course4 = new Course(18/8/2015, "Philosophy");
        Course course5 = new Course(20/4/2017, "Chemistry");
        Student student1 = new Student("Andriy", "Kharyshyn",213);
        Student student2 = new Student();
        SpecialStudent specialStudent1 = new SpecialStudent("Oleg", "Makarenko", 604);
        SpecialStudent specialStudent2 = new SpecialStudent("Mykhaylo", "Surkov", 124, 859637);
        SpecialStudent specialStudent3 = new SpecialStudent();
        CollegeStudent collegeStudent1 = new CollegeStudent("Dariia", "Shevchenko", 184);
        CollegeStudent collegeStudent2 = new CollegeStudent("Liliya", "Kononenko", 12, "Technical College", 14, 1258);
        CollegeStudent collegeStudent3 = new CollegeStudent();
    }
}
