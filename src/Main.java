import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int armstrong=scanner.nextInt();
        int digit=0,total=0;
        int temp=armstrong;
        int temp_number=armstrong;

        while (temp>0)
        {
            temp/=10;
            digit++;

        }
        while (temp_number>0)
        {
            int digit_value=temp_number%10;
            temp_number/=10;
            total+=Math.pow(digit_value,digit);
        }
        if (armstrong==total)
        {
            System.out.println(armstrong+" sayısı bir armstrong sayıdır.");
        }

        else
        {
            System.out.println(armstrong+" sayısı armstrong sayı değildir.");
        }








    }

}
