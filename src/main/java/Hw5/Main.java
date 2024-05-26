package Hw5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Пользователь\\IdeaProjects\\JavaCore3\\src\\main\\resources\\folder1";
        copyFileFromDirectory(path);


    }
    public static void copyFileFromDirectory(String path){
        File directory = new File(path);
        if (!directory.exists()){
             System.out.println("Директория не найдена");

        }
        File newFolder = new File("./backup");
        newFolder.mkdir();
        File[] files = directory.listFiles();
        for (File file : files){
            File backupFile = new File(newFolder.getPath(),file.getName());
            try(FileInputStream fis = new FileInputStream(file)){
            FileOutputStream fos = new FileOutputStream(backupFile);
            byte[] buffer = new byte[4096];
            int byteread;
            while((byteread = fis.read(buffer)) != -1){
                fos.write(buffer,0,byteread);
            }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}