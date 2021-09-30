package ex_16;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates hr1 = new HeartRates("Ron",
                "Jekson",
                11,
                8,
                1990);

        System.out.printf("Information about person1: %s %s%nMonth: %d%nDay: %d%nYear: %d%n", hr1.getFirstName(), hr1.getLastName()
                , hr1.getMonthOfBirth(), hr1.getDayOfBirth(), hr1.getYearOfBirth());

        System.out.printf("Age > %d", hr1.calculateTheAgeInYear());
        System.out.println();
        System.out.printf("The max heart rate > %d", hr1.getMAxHeartRate());
        System.out.println();
        System.out.printf("The target heart rate > %s", hr1.getTargetHeartRate());
    }
}