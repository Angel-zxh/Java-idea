package picturereader;

public class Test {
    public static void main(String[] args){
        ImageReaderFactory imageReaderFactory = new GifReaderFactory();
        imageReaderFactory.getImageReader().read();
    }
}

