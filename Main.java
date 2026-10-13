class methods {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        methods s1 = new methods();
        methods s2 = new methods();

        s1.insertRecord(111, "surya");
        s2.insertRecord(222, "suresh");

        s1.displayInformation();
        s2.displayInformation();
    }
}