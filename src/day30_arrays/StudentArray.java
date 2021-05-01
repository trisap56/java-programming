package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "796190";
        student1[1] = "Tristan";
        student1[2] = "Pasha";
        student1[3] = "B22";
        student1[4] = "5718884935";

        String[] student2 = {"6785442", "Mike", "Bloomberg", "B22", "7038886672"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchNum = " + student1[3]);
        System.out.println("student1 phoneNum = " + student1[4]);

        System.out.println();

        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 firstName = " + student2[1]);
        System.out.println("student2 lastName = " + student2[2]);
        System.out.println("student2 batchNum = " + student2[3]);
        System.out.println("student2 phoneNum = " + student2[4]);

        System.out.println("student data length: " + student1.length);
        System.out.println();

        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays match");
        } else {
            System.out.println("FAIL: data arrays do not match");
        }
        System.out.println(student1[1].toUpperCase() + " " +student1[2].toUpperCase());
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith(571 + ""));
    }
}
