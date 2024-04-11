package section12.ex.sender;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String msg) {
        System.out.println("FaceBook 에 발송합니다: " + msg);
    }
}
