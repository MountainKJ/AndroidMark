package com.x.mode.establish.fac.easy.practice;

public class GraphicalFactory {
    public static Graphical makeGrap(GraphicalType type) {
        Graphical graphical;
        if(type == GraphicalType.CIRCLE) {
            graphical = new Circle();
        }
        else if(type == GraphicalType.SQUARE) {
            graphical = new Square();
        }
        else if(type == GraphicalType.TRIANGLE) {
            graphical = new Triangle();
        } else {
          throw new UnsupportedOperationException("the graphical not exist");
        }

        return graphical;
    }
}
