package homepolymorphism;

// Клас кола
class Circle implements Shape {
    private double radius; // Радіус кола

    public Circle(double radius) {
        this.radius = radius;
    }

    // Реалізація методу з інтерфейсу Shape для обчислення площі кола
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
