package Anonymous_inner_class_with_methode_arguments_2;

public interface ThreadWithRunnableArguments {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable(){

            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("came from inner class");
                }
            }
        });
        thread.start();
    }
}
