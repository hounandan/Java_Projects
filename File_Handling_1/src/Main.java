import java.io.*;
import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {

        String source = "/home/hounandan/Desktop/SourceFolder";

        String timeStamp = String.valueOf(LocalDateTime.now());
        String destination = "/home/hounandan/Desktop/" + timeStamp;


        File sFile = new File(source);
        File dFile = new File(destination);

        if(sFile.isDirectory()){

            if(!dFile.exists()){
                dFile.mkdir();
            }

            File[] sfiles = sFile.listFiles();
            for(File f : sfiles){
                System.out.println("Writing File "+f.getName()+" to the Destination");
                File dFile1 = new File(destination+"/"+f.getName());
                copyFileUsingStream(f, dFile1);
            }

        }

    }


    private static void copyFileUsingStream(File source, File destination){

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
        } catch (Exception e){
            System.out.println("Error while copying file - "+e.getMessage());
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            }catch (Exception e){
                System.out.println("Error while closing Stream - "+ e.getMessage());
            }
        }
    }


}
