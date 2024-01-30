import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tempFahren = 0;
        while(tempFahren> -460){
            tempFahren = blah();
            double celcius = convert(tempFahren);
            userInput(celcius);
        }
        }


    static double blah(){
        Scanner input= new Scanner(System.in);
        System.out.println("What temperature do you want to convert to celcius");
        double tempFahren = input.nextInt();
        return tempFahren;
    }
    static double convert(double tempFahren){
        double celcius = (tempFahren-32)*5/9;
        return celcius;
    }

    static void userInput(double celcius){
        System.out.println(celcius);
    }

    }

