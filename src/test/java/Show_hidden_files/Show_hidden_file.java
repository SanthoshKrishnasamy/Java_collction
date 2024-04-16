package Show_hidden_files;

import java.io.File;
import java.io.FileFilter;

public class Show_hidden_file {
    public static void main(String[] args) {

        FileFilter filefilter;

        File hiddenfile[] = new File("C:/Users/santh/Desktop")
                .listFiles(pathname -> pathname.isHidden());

        for (File file : hiddenfile){
            System.out.println(file.getName());
        }

    }
}
