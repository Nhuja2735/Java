import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args){
        String filePath="example.txt";
        File file=new File(filePath);

        //1.creating a new file
        try{
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println("an errror occured while creating the file: " + e.getMessage());
        }

        //2.Getting infromation about the file

        if(file.exists()){
            System.out.println("file name:"+file.getName());
            System.out.println("absolute path:"+file.getAbsolutePath());
            System.out.println("writeable:"+file.canWrite());
            System.out.println("readable:"+file.canRead());
            System.out.println("file size in byte:"+file.length());
            System.out.println("last modified:"+file.lastModified());
        }else{
            System.out.println("the files does not exist");
        }
        //3.Writing into the file 
        try(FileWriter writer=new FileWriter(filePath)){
            writer.write("Hello,World!\n");
            writer.write("This is a file write example.");
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("n error occured while writing to the file");
            System.out.println("Error: " + e.getMessage());
        }
        //4.Reading from the file
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("File contents");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("An error occured while reading the file.");
            System.out.println(e.getMessage());
        }
        //5.Deleting the file
        if(file.delete()){
            System.out.println("Deleted the file"+file.getName());
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}