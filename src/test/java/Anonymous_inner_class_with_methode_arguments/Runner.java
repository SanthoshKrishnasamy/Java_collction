package Anonymous_inner_class_with_methode_arguments;

public class Runner {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.manage(new Iparent() {
            @Override
            public void manaable() {
                System.out.println("i will cry for that");
            }
        });

    }
}
