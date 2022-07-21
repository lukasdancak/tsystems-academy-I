package io;

import java.io.File;

public class ListDir {
    public static void main(String[] args) {
        listDir("./JavaOOP");

    }

    public static void listDir(String path){
        File dir = new File(path);

        if (dir.isDirectory()) {
            System.out.println("Listing of: " + dir.getAbsolutePath());

            //List directory
            for (String fileName : dir.list()) {
                System.out.println("  " + fileName);
                listDir(path+"/"+fileName);
            }
        } else {
//            System.err.printf("File %s is not directory", dir);
        }
    }
}
