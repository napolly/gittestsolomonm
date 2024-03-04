package Exception;

public class CustomException extends Exception {
    // 예외 메시지를 받아 초기화하는 생성자
    public CustomException(String message) {
        super(message);
    }
}