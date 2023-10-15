package br.com.diaslgg.modulo9;
import java.util.Scanner;

public class VariableTypeConverter {
    /**
     * Class to demonstrate how to cast data types in Java into its wrapper classes
     */
    public static void main(String[] args) {

        Scanner ScannerObject = new Scanner(System.in);
        System.out.println("Enter a number from -9.223.372.036.854.775.807 to 9.223.372.036.854.775.807.");

        String PickedNumber = ScannerObject.nextLine(); // gets an input number as a String


        try { //use a try catch block to avoid unwanted number formats
            long InputNumber = Long.parseLong(PickedNumber);
            System.out.println("That was your picked number: " + InputNumber);

            byte InputByte = (byte) InputNumber;
            System.out.println("Picked number as a byte data type: " + InputByte);
            Byte CastedInputByte = InputByte;
            System.out.println("Primitive byte class casted as Byte (wrapper class) data type: " + CastedInputByte);

            short InputShort = (short) InputNumber;
            System.out.println("Picked number as a short data type: " + InputShort);
            Short CastedInputShort = InputShort;
            System.out.println("Primitive short class casted as Short (wrapper class) data type: " + CastedInputShort);

            int InputInt = (int) InputNumber;
            System.out.println("Picked number as a int data type: " + InputInt);
            Integer CastedInputInt = InputInt;
            System.out.println("Primitive int class casted as Integer (wrapper class) data type: " + CastedInputInt);

            long InputLong = (long) InputNumber;
            System.out.println("Picked number as a long data type: " + InputInt);
            Long CastedInputLong = (long) InputLong;
            System.out.println("Primitive long class casted as Long (wrapper class) data type: " + CastedInputLong);

        } catch (NumberFormatException e ) {
            System.out.println("You need to pick a valid number.");
        }




    }

}
