package day38_exceptions.shapeTask1;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message) {
        super(message);
    }
}
