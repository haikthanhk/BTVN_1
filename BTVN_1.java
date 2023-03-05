


package baitap;
import java.util.Scanner;
 
public class BAITAP 1 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
         
        // a. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
          
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
         
        // b. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        if(firstNumber == secondNumber)
        System.out.println("Hai số bằng nhau");
        else if(firstNumber > secondNumber)
        System.out.println("Số thứ nhất lớn hơn số thứ 2");
        else 
        System.out.println("Số thứ nhất nhỏ hơn số thứ 2");
    }
 
}