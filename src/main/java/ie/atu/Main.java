package ie.atu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String genderTemp, gInput, nameTemp;
        int shiftTemp, ageTemp, x;
        String[] anArray;

        anArray = new String[22];

        try
        {
            System.out.println("Please enter ShiftWorker Name: (One Letter at a time)\nPress _ when filling out the rest\n");
            for(x=1; x<=22; x++)
            {
                anArray[x] = scanner.nextLine();
            }

            System.out.println("Please enter name again in one line");
            nameTemp = scanner.nextLine();

            if(anArray[7] == "_")
            {
                System.out.println("Error Name too Short");
            }
            else if(anArray[22] != "_")
            {
                System.out.println("Error Name too Long");
            }

            System.out.println("Please enter ShiftWorker Gender (Male, Female, Non-Binary):\t");

            genderTemp = scanner.nextLine();

            while (x != 100)
            {
                switch (genderTemp) {
                    case "Male":
                        gInput = genderTemp;
                        x=100;
                        break;
                    case "Female":
                        gInput = genderTemp;
                        x=100;
                        break;
                    case "Non-Binary":
                        gInput = genderTemp;
                        x=100;
                        break;
                    default:
                        System.out.println("Please enter a valid Gender");
                        break;
                }
            }

            System.out.println("Please enter ShiftWorker Age:\t");

            ageTemp = scanner.nextInt();

            if(ageTemp < 18)
            {
                System.out.println("Invalid Age");
            }


            System.out.println("Please enter ShiftWorker Shift:\t");
            try {
                shiftTemp = scanner.nextInt();
            }catch (InputMismatchException e)
            {
                System.out.println("Must be an integer");
            }

            ShiftWorker No1 = new ShiftWorker(nameTemp, genderTemp, shiftTemp, ageTemp);
        }catch(InstantiationError No1)
        {
            System.out.println("ERROR!\nFailed to create object.");
        }
    }
}