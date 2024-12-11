import java.util.*;

class Angle {
    int degree;
    int minute;

    public Angle(int degree, int minute) {
        this.degree = degree;
        this.minute = minute;
    }

    public static Angle angleSum(Angle angel1, Angle angle2) {
        int ans_min = (angel1.minute + angle2.minute) % 60;
        int carry = (angel1.minute + angle2.minute) / 60;
        int ans_degree = (angel1.degree + angle2.degree + carry);
        return new Angle(ans_degree, ans_min);
    }

    @Override
    public String toString() {
        return String.format("%d %d", degree, minute);
    }
}

public class Q7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] angle1 = input.nextLine().split(" ");
        String[] angle2 = input.nextLine().split(" ");

        if (angle1.length != 2 || angle2.length != 2) {
            System.out.print("INVALID");
            input.close();
            return;
        }

        int d1 = Integer.parseInt(angle1[0]);
        int m1 = Integer.parseInt(angle1[1]);
        int d2 = Integer.parseInt(angle2[0]);
        int m2 = Integer.parseInt(angle2[1]);

        Angle angle_1 = new Angle(d1, m1);
        Angle angle_2 = new Angle(d2, m2);

        Angle anglesum = Angle.angleSum(angle_1, angle_2);
        System.out.print(anglesum);
        input.close();
    }
}
