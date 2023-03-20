package homepolymorphism;

// Клас квадрата
class Square implements Shape {
    private double side; // Довжина сторони квадрата

    public Square(double side) {
        this.side = side;
    }

    // Реалізація методу з інтерфейсу Shape для обчислення площі квадрата
    public double getArea() {
        return side * side;
    }
}
