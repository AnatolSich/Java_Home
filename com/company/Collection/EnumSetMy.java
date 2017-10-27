package com.company.Collection;

/**
 * Created by Toll on 14.06.2017.
 */

import java.util.EnumSet;
        import java.util.Set;

/**
 * Simple Java Program to demonstrate how to use EnumSet.
 * It has some interesting use cases and it's specialized collection for
 * Enumeration types. Using Enum with EnumSet will give you far better
 * performance than using Enum with HashSet, or LinkedHashSet.
 *
 * @author Javin Paul
 */
public class EnumSetMy {

    private enum Color {
        RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
        private int r;
        private int g;
        private int b;

        private Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
        public int getR() {
            return r;
        }
        public int getG() {
            return g;
        }
        public int getB() {
            return b;
        }
    }
    private enum Color2 {
        RED(0), GREEN(1), BLUE(2);
        private int r;

        Color2(int r) {
            this.r = r;
        }
    }



    public static void main(String args[]) {
        for (Color color : Color.values()) {
            System.out.println(color);

        }
for (Color2 color : Color2.values()) {
            System.out.println(color);

        }



        // this will draw line in yellow color
        EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN);
        drawLine(yellow);
        // RED + GREEN + BLUE = WHITE
        EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        drawLine(white);
        // RED + BLUE = PINK
        EnumSet<Color> pink = EnumSet.of(Color.RED, Color.BLUE);
        drawLine(pink);
    }


    public static void drawLine(Set<Color> colors) {
        System.out.println("Requested Colors to draw lines : " + colors);
        for (Color c : colors) {
            System.out.println("drawing line in color : " + c);
        }
    }
}

/*Output:
        Requested Colors to draw lines : [RED, GREEN]
        drawing line in color : RED
        drawing line in color : GREEN

        Requested Colors to draw lines : [RED, GREEN, BLUE]
        drawing line in color : RED
        drawing line in color : GREEN
        drawing line in color : BLUE

        Requested Colors to draw lines : [RED, BLUE]
        drawing line in color : RED
        drawing line in color : BLUE*/



