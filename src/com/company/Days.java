package com.company;

public enum Days {
    MONDAY("Java sabagy, jangy tema","Duyshombu"),
    TUESDAY("Anglis til sabagy","Sheyshembi"),
    WEDNESDAY("Java sabagy jangy tema","Sharshembi"),
    THURSDAY("Soft Skills dabagy","Beyshembi"),
    FRIDAY("Java sabagy jana kaytaloo","Juma"),
    SATURDAY("Java sabagy praktika jana team-building","Ishembi"),
    SUNDAY("Es aluu, uktoo","Jekshembi");

    String kyrgyzName;
    String plan;

    Days(String plan, String kyrgyzName) {
        this.plan = plan;
        this.kyrgyzName = kyrgyzName;
    }

    @Override
    public String toString() {
        return "Kun: " + kyrgyzName +
                "\nPlan: " + plan;
    }
}
