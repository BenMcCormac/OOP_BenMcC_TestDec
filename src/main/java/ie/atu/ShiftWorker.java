package ie.atu;

public class ShiftWorker
{
    private String Name;
    private String Gender;
    private int Shift;
    private int Age;

    public ShiftWorker(String name, String gender, int shift, int age) {
        Name = name;
        Gender = gender;
        Shift = shift;
        Age = age;
    }

    public ShiftWorker() {
        Name = "";
        Gender = "";
        Shift = ' ';
        Age = ' ';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getShift() {
        return Shift;
    }

    public void setShift(int shift) {
        Shift = shift;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}

