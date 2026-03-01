//import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Throws_prac2{

static void readFile(String fileName) throws IOException{
    FileReader file = new FileReader(fileName);
    System.out.println("file opened successfully");
    file.close();
}
    public static void main(String[] args) {
        try {
            readFile("nullpoinexp.java");
        } catch (IOException e) {
            System.out.println("Error : file not found " + e.getMessage());
        }
    }

}