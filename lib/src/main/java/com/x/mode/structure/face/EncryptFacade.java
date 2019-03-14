package com.x.mode.structure.face;

public class EncryptFacade extends AbstractEncryptFacade {

    private FileReader reader;
    private AbstractCipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade(AbstractCipherMachine cipher) {
        this.cipher = cipher;
        reader = new FileReader();
        writer = new FileWriter();
    }

    @Override
    void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String srcTxt = reader.read(fileNameSrc);
        System.out.println("读取文件："+srcTxt);
        String encryptTxt = String.valueOf(cipher.encrypt(srcTxt));
        System.out.println("加密文件："+encryptTxt);
        writer.write(encryptTxt, fileNameDes);
    }
}
