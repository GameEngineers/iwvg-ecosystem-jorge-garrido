package es.upm.miw.iwvg.ecosystem.core;

public class User {

    private int number;

    private String name;

    private String familyName;

    private String secondFamilyName;

    public User(int number, String name, String familyName, String secondFamilyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.secondFamilyName = this.format(secondFamilyName);
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName + " " + this.secondFamilyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public String fullNameToUpperCase() {
        return this.name.toUpperCase() + " " + this.familyName.toUpperCase() + " " + this.secondFamilyName.toUpperCase();
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getSecondFamilyName() {
        return this.secondFamilyName;
    }

}