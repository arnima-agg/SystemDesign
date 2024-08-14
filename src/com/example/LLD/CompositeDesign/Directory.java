package com.example.LLD.CompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    public String directoryName;
    public List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        fileSystems.add(fileSystemObj);
    }

    public void ls() {
        System.out.println("Directory Name" + directoryName);
        for(FileSystem obj : fileSystems) {
            obj.ls();
        }
    }

}
