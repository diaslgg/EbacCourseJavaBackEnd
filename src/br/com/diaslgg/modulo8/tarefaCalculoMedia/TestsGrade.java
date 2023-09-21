package br.com.diaslgg.modulo8.tarefaCalculoMedia;

/**
 * Class to keep all grades and perform analysis with them
 * @author DiasLgg
 */
public class TestsGrade {

    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;
    private double forthGrade;

    public TestsGrade(double first, double second, double third, double forth){
        this.firstGrade = first;
        this.secondGrade = second;
        this.thirdGrade = third;
        this.forthGrade = forth;

    }

    public double getFirstGrade() {
        return this.firstGrade;
    }

    public double getSecondGrade() {
        return this.secondGrade;
    }

    public double getThirdGrade() {
        return this.thirdGrade;
    }

    public double getForthGrade() {
        return this.forthGrade;
    }

    /**
     * Gets all grades and perform its median and print it out in console
     */
    public void CalculatedMedianGrade() {
        double medianGrade;
        medianGrade = (this.getFirstGrade() + this.getSecondGrade() + this.getThirdGrade() + this.getForthGrade()) / 4;

        System.out.println("Your final grade was " + medianGrade);

        if(medianGrade > 5) {
            System.out.println("You have been approved. Congratulations!");
        } else {
            System.out.println("You haven't been approved. Sorry to hear that.");
        }
    }
}
