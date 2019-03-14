package com.x.mode.structure.face;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReader {
    public String read(String fileName) {
        File mFile = new File(fileName);
        if (!mFile.exists()) {
            System.out.println("文件不存在！");
            return "";

        }
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            int rec = -1;
            char[] buffer = new char[8192];
            while ((rec = br.read(buffer, 0, buffer.length)) != -1) {
                sb.append(buffer, 0, rec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
