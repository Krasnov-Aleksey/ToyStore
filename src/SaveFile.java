import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public void saveFile(String text){
        // TODO path
        try (FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}



