package All_Functional_Interfaces_in_java8.Funtional_interface_basics;

public class Chrome implements Browser{
    @Override
    public void browse() {
        System.out.println("browse from chrome");
    }

    public static void main(String[] args) {
        Browser chrome = new Chrome();

        chrome.browse();
        /*Chrome is using the own implementation of the browser */
        chrome.playmedia();
    }
}
