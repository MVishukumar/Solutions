import java.util.*;

public class JavaSort {
    public static void main(String[] args) {
        System.out.println("Hi");

        Scanner in = new Scanner(System.in);
        System.out.println("Number of students?");
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        /*while(testCases>0){
            System.out.println("Enter id, name and CGPA");
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }*/

        Student st1 = new Student(33, "Rumpa", 3.68);
        Student st2 = new Student(85, "Ashis", 3.85);
        Student st3 = new Student(56, "Samiha", 3.75);
        Student st4 = new Student(19,"Samara", 3.75);
        Student st5 = new Student(22, "Fahim", 3.76);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        /*for(Student st: studentList){
            System.out.println(st.getFname());
        }*/

        Collections.sort(studentList, new Student());

        for(Student st: studentList){
            System.out.println(st);
        }
    }
}

class Student implements Comparator<Student>{
    private int id;
    private String fname;
    private double cgpa;

    Student() {}

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o2.getCgpa() > o1.getCgpa()) {
            return 1;
        } else if(o2.getCgpa() < o1.getCgpa()) {
            return -1;
        } else {
            if(o1.getFname().compareTo(o2.getFname()) > 0) {
                return 1;
            } else if(o1.getFname().compareTo(o2.getFname()) < 0) {
                return -1;
            } else {
                return o2.getId() - o1.getId();
            }

        }
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getFname() + " " + this.getCgpa();
    }
}
