package be.vdab.hello.voorbelden14;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Semih");
        Student student2 = new Student("Ahmet", 85);

        System.out.println("Student 1: Naam -" + student1.getNaam() + ",Score - " + student1.getScore());
        System.out.println("Student 2: Naam -" + student2.getNaam() + ",Score - " + student2.getScore());

        student1.setScore(90);
        student2.setNaam("Mustafa");
        student2.setScore(75);


        System.out.println("na wijzigingen");
        System.out.println("Student 1: Naam -" + student1.getNaam() + ",Score - " + student1.getScore());
        System.out.println("Student 2: Naam -" + student2.getNaam() + ",Score - " + student2.getScore());
    }
}
