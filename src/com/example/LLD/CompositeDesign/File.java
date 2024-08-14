package com.example.LLD.CompositeDesign;

public class File implements FileSystem{

    public String fileName;

    public File(String filename) {
        this.fileName = filename;
    }

    public void ls() {
        System.out.println("File Name" + fileName);
    }
}
