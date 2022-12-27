package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month < 0 || month > 12) {
            System.out.println("wrong number!");
            return;
        }

        if (month >= 1 && month <= 3) {
            System.out.println("Winter");
            return;
        }
        if (month >= 3 && month <= 5) {
            System.out.println("Spring");
            return;
        }
        if (month > 5 && month <= 8) {
            System.out.println("Summer");
            return;
        }
        if (month > 8 && month <= 10) {
            System.out.println("Autumn");
            return;
        }
        if (month > 10 && month <= 12) {
            System.out.println("Winter");
            return;
        }
    }
}
