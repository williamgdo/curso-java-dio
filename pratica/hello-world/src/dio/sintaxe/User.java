package dio.sintaxe;

public class User {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.printTvStatus();

        tv.setChannel(13);
        tv.printTvStatus();
    }
}
