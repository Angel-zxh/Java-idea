package Chap4_7;

public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader getImageReader() {
        ImageReader imageReader = new GifReader();
        return imageReader;
    }
}
