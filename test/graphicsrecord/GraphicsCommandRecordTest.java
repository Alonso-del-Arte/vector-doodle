package graphicsrecord;

import static graphicsrecord.MockGraphicsTest.RANDOM;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphicsCommandRecordTest {

    private static final Font[] FONTS
            = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

    private static final int TOTAL_NUMBER_OF_FONTS = FONTS.length;

    private static final Random RANDOM = new Random();

    @Test
    public void testGetCommandName() {
        System.out.println("getCommandName");
        String expected = "command" + RANDOM.nextInt();
        Color color = new Color(RANDOM.nextInt());
        Font font = FONTS[RANDOM.nextInt(TOTAL_NUMBER_OF_FONTS)];
        GraphicsCommandRecord record = new GraphicsCommandRecord(expected,
                color, font);
        String actual = record.getCommandName();
        assertEquals(expected, actual);
    }

}
