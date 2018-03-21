package P02_FileStream;

import java.util.stream.Stream;

public class StreamProgressInfo {
    private IStreamable file;

    // If we want to stream a music file, we can't
    public StreamProgressInfo(IStreamable file) {
        this.file = file;
    }

    public int calculateCurrentPercent() {
        return (this.file.getBytesSent() * 100) / this.file.getLength();
    }
}
