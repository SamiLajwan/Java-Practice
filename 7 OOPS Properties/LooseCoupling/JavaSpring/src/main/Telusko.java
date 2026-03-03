package main;

import services.ICourse;

public class Telusko {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public boolean buyTheCourse() {
        return course.registerCourse();
    }
}
