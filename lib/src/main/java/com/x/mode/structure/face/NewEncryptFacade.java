package com.x.mode.structure.face;

public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader reader;
    private CipherMachineImpl newCipher;
    private FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        newCipher = new CipherMachineImpl();
        writer = new FileWriter();
    }

    @Override
    void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String srcTxt = reader.read(fileNameSrc);
        System.out.println("读取："+srcTxt);
        String encrypt = newCipher.encrypt(srcTxt);
        System.out.println("en:"+encrypt);
        writer.write(encrypt, fileNameDes);
    }
}
