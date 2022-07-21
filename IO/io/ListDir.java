package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

    private static List<File> filter(String name){
        return new ArrayList<File>(); // DU
    }
}
