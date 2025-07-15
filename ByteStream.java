import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStream{
    public static void main(String[]args){
        try(FileInputStream fis=new FileInputStream("Source.txt");
        FileOutputStream fos=new FileOutputStream("Destination.txt")){
            byte[] buffer=new byte[1024];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
        }catch(IOException e){
            System.err.println("Error copying File:"+e.getMessage());
        }

    }
	
}