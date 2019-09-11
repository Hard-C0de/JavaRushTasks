package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by XIR on 10.10.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes it) {
        if(it != ImageTypes.BMP && it != ImageTypes.JPG && it != ImageTypes.PNG)
            throw new IllegalArgumentException("Неизвестный тип картинки");
        switch (it){
            case BMP: return new BmpReader();
            case JPG: return new JpgReader();
            case PNG: return new PngReader();
            default: throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
