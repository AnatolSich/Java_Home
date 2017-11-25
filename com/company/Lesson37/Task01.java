package com.company.Lesson37;

import com.company.Lesson37.common.BmpReader;
import com.company.Lesson37.common.ImageReader;
import com.company.Lesson37.common.JpgReader;
import com.company.Lesson37.common.PngReader;

/**
 * Created by Toll on 25.11.2017.
 */

/* Factory method pattern
1. Создай enum класс ImageTypes с списоком доступных форматов BMP, JPG, PNG;
1. Создай интерфейс-маркер ImageReader в пакете common
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader,
которые реализуют интерфейс ImageReader.
3. Создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
4.1. для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
4.2. если передан неправильный параметр, то выбросить исключение IllegalArgumentException("Неизвестный тип картинки").
5. Реализовать метод main. Запустить программу.
*/

public class Task01 {
    public static void main(String[] args) {
        System.out.println(new ImageReaderFactory().getReader(ImageTypes.BMP).getClass());
        System.out.println(new ImageReaderFactory().getReader(ImageTypes.JPG).getClass());
        System.out.println(new ImageReaderFactory().getReader(ImageTypes.PNG).getClass());
        System.out.println(new ImageReaderFactory().getReader(ImageTypes.KFG).getClass());
    }
}

class ImageReaderFactory {
    ImageReader getReader(ImageTypes imageType) throws IllegalArgumentException {
        if (imageType.equals(ImageTypes.BMP)) {
            return new BmpReader();
        } else if (imageType.equals(ImageTypes.JPG)) {
            return new JpgReader();
        } else if (imageType.equals(ImageTypes.PNG)) {
            return new PngReader();
        } else throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}

enum ImageTypes {
    BMP, JPG, PNG, KFG
}