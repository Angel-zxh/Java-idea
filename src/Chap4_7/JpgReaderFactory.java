package Chap4_7;

public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader getImageReader() {
        ImageReader imageReader = new JpgReader();
        return imageReader;
    }
}
