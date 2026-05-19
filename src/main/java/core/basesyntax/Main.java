package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigure = 10;

        for (int i = 0; i < numberOfFigure; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
        }

        Figure defaltFigure = figureSupplier.getRandomFigure();
        defaltFigure.draw();
    }
}
