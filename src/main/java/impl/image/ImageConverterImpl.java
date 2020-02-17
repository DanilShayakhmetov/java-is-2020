package impl.image;

import api.image.ImageConverter;

import java.awt.*;

public class ImageConverterImpl implements ImageConverter {
    @Override
    public Color[][] convertToColor(int[][] image) {
        Color[][] color = new Color[image.length][];
        for (var i = 0; i < image.length; i++){
            color[i] = new Color[image[i].length];
        }

        for (var i = 0; i < image.length; i++) {
            for (var j = 0; j < image[i].length; j++) {
                color[i][j] = new Color(image[i][j]);
            }
        }

        return color;
    }

    @Override
    public int[][] convertToRgb(Color[][] image) {
        int[][] color = new int[image.length][];
        for (var i = 0; i < image.length; i++){
            color[i] = new int[image[i].length];
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                color[i][j] = image[i][j].getRGB();
            }
        }

        return color;
    }
}