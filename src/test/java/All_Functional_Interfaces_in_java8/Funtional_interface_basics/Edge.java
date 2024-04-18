package All_Functional_Interfaces_in_java8.Funtional_interface_basics;

public class Edge implements Browser{

    @Override
    public void browse() {
        System.out.println("browse from edge");
    }

    /*But edge is given the different implementation form browser*/
    @Override
    public void playmedia() {
        System.out.println("play media from edge browser");
    }

    public static void main(String[] args) {
        Browser edge = new Edge();

        edge.browse();
        edge.playmedia();
    }
}
