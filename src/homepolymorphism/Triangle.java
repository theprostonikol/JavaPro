package homepolymorphism;

// Клас трикутника
class Triangle implements Shape {
    private double base; // Основа трикутника
    private double height; // Висота трикутника

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Реалізація методу з інтерфейсу Shape для обчислення площі трикутника
    public double getArea() {
        return 0.5 * base * height;
    }
}
