package classes.practise1;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int attendanceNote;
    double attendanceNoteRatio;

    Course(String name, String code, String prefix, double attendanceNoteRatio) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.attendanceNoteRatio = attendanceNoteRatio;
        this.note = 0;
        this.attendanceNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri aynı degil!");
        }
    }

    double calculateCourseNoteAvg(){
        return (this.attendanceNote * this.attendanceNoteRatio) + (this.note * (1 - this.attendanceNoteRatio));
    }

    void printTeacher(){
        this.teacher.print();
    }

}
