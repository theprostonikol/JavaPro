package homepolymorphism;

   // Головний клас, що містить метод main
    public class Main {
    public static void main(String[] args) {
        // Створюємо масив фігур і заповнюємо його об'єктами класів Circle, Triangle і Square
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(4, 3);
        shapes[2] = new Square(2);

        // Викликаємо метод getTotalArea, щоб отримати сумарну площу всіх фігур у масиві
        double totalArea = getTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }

    // Метод для обчислення сумарної площі всіх фігур у масиві
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
