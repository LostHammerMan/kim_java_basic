package section9.shop;

public class Album extends Item{

    private String artist;

    @Override
    public void print() {
        super.print();
        System.out.println("아티스트 : " + this.artist);

    }

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;


    }
}
