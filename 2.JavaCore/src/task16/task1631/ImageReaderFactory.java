package task16.task1631;

import task16.task1631.common.*;

/**
 * Created by Юлия on 13.02.2017.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) {

        if (types == ImageTypes.JPG) {
            return new JpgReader();
        }
        if (types == ImageTypes.BMP) {
            return new BmpReader();
        }
        if (types == ImageTypes.PNG) {
        return new PngReader();
        }

        throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
