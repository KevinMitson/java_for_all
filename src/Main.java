public class Main {
    public static void main(String[] args) {
        Student student = new Student("John","90",4,new Graduate(),new FullTime());
        Student student1 = new Student("Joe","unza 1234",4,new Graduate(),new PartTime());



        Student student2 = new Student("boss","unza 101",3,new UnderGraduate(),new FullTime());
        System.out.println(student2);
        student2.setLevelRole(new Graduate());
        student2.setAttendanceRole(new PartTime());
        System.out.println(student2);
    }
}
