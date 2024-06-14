
//import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            //Scanner entrada = new Scanner(System.in);
            System.out.println(Math.round(calculoIMC(62.5,132.5)));
        }
    public static double calculoIMC(double altura, double peso)
    {
        double IMC = ((peso / (altura * altura)) * 703);
        return IMC;
    }
}
