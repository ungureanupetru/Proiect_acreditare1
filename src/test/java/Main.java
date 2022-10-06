
public class Main {

    public static void main(String[] args) {
        RegisterTest registerTest = new RegisterTest();
        registerTest.validRegisterTest();


        LoginTest loginTest = new LoginTest();
        loginTest.validLoginTest();


        ShopTest shopTest = new ShopTest();
        shopTest.validShopTest();


    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}