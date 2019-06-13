import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileHandling {

    public static void main(String args[]) throws IOException {
             
        File source = new File("file1.txt");
        File destination = new File("../file2.txt");
       
        System.out.println("Copying file in same location using FileInputStream");
        copy(source, destination);
       
    }

    public static void copy(File src, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int bytesRead;
            while ((bytesRead = is.read(buffer)) > 0) {
                os.write(buffer, 0, bytesRead);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
