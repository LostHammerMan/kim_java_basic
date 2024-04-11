package section12.ex.pay0;

import java.util.Scanner;

public class PayMain {

    public static void main(String[] args){

        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);
        String payOption;
        int paymentMethod = 0;
        int amount = 0;
        boolean run = true;

        while (run){
            System.out.print("결제 방법을 선택하세요 (1. 카카오, 2. 네이버) : "); paymentMethod = sc.nextInt();
            System.out.print("결제 금액 : "); amount = sc.nextInt();
            // 카카오 결제
//        String payOption1 =
            switch (paymentMethod){
                case 1 :
                    payOption = "kakao";
                    payService.processPay(payOption, amount);
                    run = true;
                    break;
                case 2 :
                    payOption = "naver";
                    payService.processPay(payOption, amount);
                    run = true;
                    break;
                default:
                    payOption = "bad";
                    payService.processPay(payOption, amount);
                    System.out.println("결제 수단이 없습니다");
                    System.out.println("결제가 실패했습니다");
                    run = false;
                    break;
            }
        }


    }
}
