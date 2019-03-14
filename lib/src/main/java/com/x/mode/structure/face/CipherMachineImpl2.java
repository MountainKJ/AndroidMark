package com.x.mode.structure.face;

public class CipherMachineImpl2 implements AbstractCipherMachine<String>{
    @Override
    public String encrypt(String srcTxt) {
        String es = "";
        char[] tempChars = srcTxt.toCharArray();
        for (char tempChar : tempChars) {
            String c = String.valueOf((tempChar % 7));
            es += c;
        }
        return es;
    }
}
