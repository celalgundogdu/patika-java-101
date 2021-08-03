package classes.practise1;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String degree;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String degree, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.degree = degree;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
           this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.course3.note = note3;
        }
    }

    void addBulkAttendanceNote(int attendanceNote1, int attendanceNote2, int attendanceNote3){
        if (attendanceNote1 >= 0 && attendanceNote1 <= 100){
            this.course1.attendanceNote = attendanceNote1;
        }
        if (attendanceNote2 >= 0 && attendanceNote2 <= 100){
            this.course2.attendanceNote = attendanceNote2;
        }
        if (attendanceNote3 >= 0 && attendanceNote3 <= 100){
            this.course3.attendanceNote = attendanceNote3;
        }
    }

    void calculateAverage(){
        double course1Avg = this.course1.calculateCourseNoteAvg();
        double course2Avg = this.course2.calculateCourseNoteAvg();
        double course3Avg = this.course3.calculateCourseNoteAvg();
        this.average = (course1Avg + course2Avg + course3Avg) / 3.0;
    }

    void isPass(){
        System.out.println("================================");
        calculateAverage();
        if (this.average > 55){
            System.out.println("Hababam sınıfı uyanıyor.");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı sınıfta kaldı.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.course1.name + " Not : " + this.course1.note);
        System.out.println(this.course2.name + " Not : " + this.course2.note);
        System.out.println(this.course3.name + " Not : " + this.course3.note);
        System.out.printf("Ortalama : %.2f\n", this.average);
    }

}
