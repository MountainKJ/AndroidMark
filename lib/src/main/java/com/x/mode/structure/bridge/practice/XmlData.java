package com.x.mode.structure.bridge.practice;

public class XmlData extends Data{
    @Override
    public void parseFile(String fileName) {
        di.doConvert();
        System.out.println(fileName+", xmlData.parseFile");
    }
}
