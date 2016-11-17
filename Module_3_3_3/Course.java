package Module_3_3_3;

import java.util.Date;

/**
 * Created by Andrew on 13.11.2016.
 */
public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    private Date getStartDate() {
        return startDate;
    }

    private void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getHoursDuration() {
        return hoursDuration;
    }

    private void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    private String getTeacherName() {
        return teacherName;
    }

    private void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
