package Chap4_7;

import java.io.Reader;

public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader getImageReader() {
        ImageReader imageReader = new GifReader();
        return imageReader;
    }
}
