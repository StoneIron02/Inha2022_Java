package net.stoneiron.java.week4;

public class TV {

    private String company;
    private int inch;
    private int year;

    public TV(String company, int inch, int year) {
        this.company = company;
        this.inch = inch;
        this.year = year;
    }

    public TV(String company, int inch) {
        this(company, inch, 0);
    }

    public void show() {
        if (year == 0) {
            System.out.print("생산년도가 불분명한 ");
        } else {
            System.out.print(year + "년도 ");
        }
        System.out.println(company + "에서 만든 "
                + inch + "인치 TV");
    }

    public static void main(String[] args) {
        TV myTV = new TV("LG", 32, 2021);
        TV mySecondTV = new TV("Samsung", 27);
        myTV.show();
        mySecondTV.show();
    }

}
