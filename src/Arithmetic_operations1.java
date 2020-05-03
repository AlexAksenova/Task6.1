import java.util.Scanner;

public class Arithmetic_operations1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x= ");
        float x = scanner.nextInt();
        System.out.print("Введите число y= ");
        float y = scanner.nextInt();
        System.out.print("Введите число z= ");
        float z = scanner.nextInt();
        float average = (x+y+z)/3;
        System.out.println("Среднее = "+ average);
        int del;
        del= (int)average/2;
        System.out.println("Деление без остатка: "+del);
        if (del>3){
            System.out.println("Программа выполнена корректно");
        }
    }


}
