package ex_16;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int calculateTheAgeInYear() {
        LocalDate now = LocalDate.now();
        yearOfBirth = now.getYear() - yearOfBirth;
        monthOfBirth = now.getMonthValue() - monthOfBirth;
        if (monthOfBirth < 0) {
            yearOfBirth--;
        }
        return yearOfBirth;
    }

    public int getMAxHeartRate() {
        return 220 - calculateTheAgeInYear();
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f", getMAxHeartRate() * 0.5, getMAxHeartRate() * 0.85);
    }
}