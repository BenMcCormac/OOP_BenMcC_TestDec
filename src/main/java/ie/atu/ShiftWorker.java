package ie.atu;

public class ShiftWorker
{
    private char Name;
    private char Gender;
    private int Shift;
    private int Age;

    public ShiftWorker(char name, char gender, int shift, int age) {
        Name = name;
        Gender = gender;
        Shift = shift;
        Age = age;
    }

    public ShiftWorker() {
        Name = ' ';
        Gender = ' ';
        Shift = ' ';
        Age = ' ';
    }

    public char getName() {
        return Name;
    }

    public void setName(char name) {
        Name = name;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
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

