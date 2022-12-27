package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        if (salary <= 10000) {
            float netto = 85 * salary / 100f;
            System.out.println(netto);
            return;
        }
        if (salary >= 10000 && salary <= 20000) {
            float netto = 82 * salary / 100f;
            System.out.println(netto);
            return;
        }
        if (salary > 20000) {
            float netto = 80 * salary / 100f;
            System.out.println(netto);
            return;
        }
    }
}
