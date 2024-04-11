package section12.ex.pay0;

public class PayService {

    boolean result;
    Pay kakaoPay = new KakaoPay();
    Pay naverPay = new NaverPay();

    public void processPay(String option, int amount){

        System.out.println("걸제를 시작합니다: option" + option + ", amount= " + amount);
        if (option.equals("kakao")){
            result = kakaoPay.pay(amount);
        }else if (option.equals("naver")){
            result  = kakaoPay.pay(amount);
        }else {
            System.out.println("결제 수단이 없습니다");
            result  = false;
        }

        if (result){
            System.out.println("결제가 성공 했습니다");
        }else {
            System.out.println("결제가 실패 했습니다");
        }
    }
}
