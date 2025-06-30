package packag;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class FileUploaderTest {

    @Test
    public void testUploadAndCleanup_VerifyCalls() {
        // Arrange
        CloudStorageService mockService = mock(CloudStorageService.class);
        FileUploader uploader = new FileUploader(mockService);

        // Act
        uploader.uploadAndCleanup("report.pdf");

        // Assert (verify interactions)
        verify(mockService).uploadFile("report.pdf");
        verify(mockService).deleteFile("report.pdf");

        // Optional: ensure nothing else was called
        verifyNoMoreInteractions(mockService);
    }
}
