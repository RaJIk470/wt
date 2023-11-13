import java.awt.*;
import java.util.List;
import java.util.function.Predicate;

public class T9 {

    public record Ball(Color color, double weight) {
    }

    public record Basket(List<Ball> balls) {
    }

    public double getWeight(Basket basket) {
        return basket.balls.stream().mapToDouble(Ball::weight).sum();
    }

    public List<Ball> filterBy(Basket basket, Predicate<Ball> predicate) {
        return basket.balls.stream().filter(predicate).toList();
    }
}
