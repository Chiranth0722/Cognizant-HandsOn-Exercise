package packag;

public class FileUploader {
    private CloudStorageService cloudService;

    public FileUploader(CloudStorageService cloudService) {
        this.cloudService = cloudService;
    }

    public void uploadAndCleanup(String filename) {
        cloudService.uploadFile(filename);
        cloudService.deleteFile(filename); // cleanup local copy after upload
    }
}

