package Default_method_with_multiple_interface;

public class child implements Iparent, IGrandparent{

    @Override
    public void followRules() {
        Iparent.super.followRules();
    }
    /*NOTE--> Here we are using the own implementation Iparent interface method, that is reason we are using super keyword*/

    public static void main(String[] args) {

        Iparent nn = new child();
        nn.followRules();
    }

}
