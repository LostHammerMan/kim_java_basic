package section3;

public class MusicPlayerMain {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 플레이어 On
        isOn = true;
        System.out.println("플레이어 시작합니다.");

        volume++;
        System.out.println("음악 플레이어 볼륨 " + volume);

        volume++;
        System.out.println("음악 플레이어 볼륨 " + volume);

        volume--;
        System.out.println("음악 플레이어 볼륨 " + volume);

        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON" + "볼륨: " + volume);
        }

        isOn = false;
        System.out.println("음악 플레이어 종료");

    }
}
