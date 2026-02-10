package model;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

import io.FileLoader;

public class Document{
    private String filePath;
    private String fileName;
    private long fileSize;
    private FileLoader loader;
    private String fileContentString;

    public Document (String filePath) throws IOException {
        this.filePath = filePath;
        this.loader = new FileLoader(filePath);
        this.fileName = "";
        this.fileSize =2;
        this.fileContentString = this.loader.getContent();
        
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileContentString() {
        return fileContentString;
    }

}
