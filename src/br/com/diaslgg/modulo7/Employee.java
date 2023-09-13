package br.com.diaslgg.modulo7;

    /**
     * Class that represents an employee
     * @author diaslgg
     */
    public class Employee {

        private String name;
        private double salary;
        private int workingHours;
        private int extraWorkingHours;
        private double laborContribution;

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        public int getExtraWorkingHours() {
            return extraWorkingHours;
        }

        public double getLaborContribution() {
            return laborContribution;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * Method that receives a param value and add it to the attribute salary
         * @param value
         */
        public void getBonus(double value) {
            this.salary = this.salary + value;
        }

        /**
         * Method that receives a param hours and add it to the attribute extraWorkingHours
         * @param hours
         */

        public void workingLate(int hours) {
            this.extraWorkingHours = this.extraWorkingHours + hours;
        }
    }