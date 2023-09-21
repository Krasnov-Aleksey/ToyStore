import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public void saveFile(String text){
        try (FileWriter fileWriter = new FileWriter("text.txt")){
            fileWriter.write(text);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}



