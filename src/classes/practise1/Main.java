package classes.practise1;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut Hoca", "0505-050-0505", "TRH");
        Teacher teacher2 = new Teacher("Badi Ekrem", "0543 543 43 43", "BDN");
        Teacher teacher3 = new Teacher("Külyutmaz Necmi", "0654 654 65 65", "BIO");

        Course history = new Course("Tarih", "101", "TRH", 0.3);
        history.addTeacher(teacher1);

        Course physicalEducation = new Course("Beden Eğitimi", "102", "BDN", 0.2);
        physicalEducation.addTeacher(teacher2);

        Course biology = new Course("Biyoloji", "101", "BIO", 0.25);
        biology.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban", "123", "4", history, physicalEducation, biology);
        student1.addBulkExamNote(90, 100, 90);
        student1.addBulkAttendanceNote(80, 90, 75);
        student1.isPass();

        Student student2 = new Student("Güdük Necmi", "321", "4", history, physicalEducation, biology);
        student2.addBulkExamNote(40, 10, 50);
        student2.addBulkAttendanceNote(50, 60, 70);
        student2.isPass();
    }

}
