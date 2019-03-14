package com.x.mode.structure.face;

public class CipherMachineImpl implements AbstractCipherMachine<String>{
    @Override
    public String encrypt(String srcTxt) {
        String es = "";
        int key = 10;//设置秘钥，位移数10
        char[] tempChars = srcTxt.toCharArray();
        for (char ch : tempChars) {
            int temp = ch;
            //小写字母移位
            if (ch >= 'a' && ch <= 'z') {
                temp += key % 26;
                if (temp > 122) temp -= 26;
                if (temp < 97) temp += 26;
            }
            //大写字母移位
            if (ch >= 'A' && ch <= 'Z') {
                temp += key % 26;
                if (temp > 90) temp -= 26;
                if (temp < 65) temp += 26;
            }
            es += temp;
        }
        return es;
    }
}
