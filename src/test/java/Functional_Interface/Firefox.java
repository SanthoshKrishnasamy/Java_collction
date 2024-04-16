package Functional_Interface;

public class Firefox implements Browser{
    @Override
    public void browse() {
        System.out.println("browse from firefox");
    }

    @Override
    public void playmedia() {
        Browser.super.playmedia();
    }

    public static void main(String[] args) {
        Browser firefox = new Firefox();
        firefox.browse();
        firefox.playmedia();
    }
}
