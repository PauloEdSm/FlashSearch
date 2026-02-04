package model;

public class Document{
    private String filePath;
    private String fileName;
    private long fileSize;

    //constructing method
    public Document(String filePath, long fileSize, String fileName) {
        this.filePath = filePath;
        this.fileSize = fileSize;
        this.fileName = fileName;
    }
    //Getter`s and Setter`s methods
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
}
