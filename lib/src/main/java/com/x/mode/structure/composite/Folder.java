package com.x.mode.structure.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    protected void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    protected void remove(AbstractFile file) {
        fileList.remove(file);
    }


    @Override
    protected AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("************对文件夹【"+name+"】进行杀毒**************");
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirus();
        }
    }
}
