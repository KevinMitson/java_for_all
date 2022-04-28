public class Student {
    private String name;
    private String id;
    private int year;
private LevelRole levelRole;

private AttendanceRole attendanceRole;

    public Student(String name, String id, int year, LevelRole levelRole, AttendanceRole attendanceRole) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.levelRole = levelRole;
        this.attendanceRole = attendanceRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LevelRole getLevelRole() {
        return levelRole;
    }

    public void setLevelRole(LevelRole levelRole) {
        this.levelRole = levelRole;
    }

    public AttendanceRole getAttendanceRole() {
        return attendanceRole;
    }

    public void setAttendanceRole(AttendanceRole attendanceRole) {
        this.attendanceRole = attendanceRole;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", year=" + year +
                ", levelRole=" + levelRole +
                ", attendanceRole=" + attendanceRole +
                '}';
    }
}

