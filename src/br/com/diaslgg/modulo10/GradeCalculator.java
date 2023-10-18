package br.com.diaslgg.modulo10;

/**
 * Class to facilitate the school grade calculattion
 * @author diaslgg
 */
public class GradeCalculator {

    private Double firstGrade;
    private Double secondGrade;
    private Double thirdGrade;
    private Double fourthGrade;

    public GradeCalculator(Double firstGrade, Double secondGrade, Double thirdGrade, Double fourthGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
        this.fourthGrade = fourthGrade;
    }

    public Double getFirstGrade() {
        return firstGrade;
    }

    public Double getSecondGrade() {
        return secondGrade;
    }

    public Double getThirdGrade() {
        return thirdGrade;
    }

    public Double getFourthGrade() {
        return fourthGrade;
    }

    /**
     * Do the calculations on the final grade based on the median of the four grades.
     * @return Double with the final grade.
     */
    public Double gradeCalculator() {
        return (getFirstGrade() + getSecondGrade() + getThirdGrade() + getFourthGrade()) / 4;
    }

    /**
     *Print the school final result based on the requirements and the final grade.
     */
    public void gradeResult() {
        Double finalResult = this.gradeCalculator();

// conditions to meet the requirements to the classes
        if (finalResult >= 7) {
            System.out.println("Congratulations, you passed your class! Your final grade was " + finalResult + ".");
        } else if (finalResult >= 5) {
            System.out.println("Oh, too bad, you will need remedial classes.");
        } else {
            System.out.println("You failed your class.");
        }
    }
}
