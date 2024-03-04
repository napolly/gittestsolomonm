package Example;

import Exception.CustomException;

public class ExceptionExample {
    // 메소드에서 CustomException 발생 시키기
    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("나이는 음수가 될 수 없습니다.");
        }
    }

    // 테스트를 위한 메인 메소드
    public static void main(String[] args) {
        try {
            // 임의의 나이를 검증해봅시다.
            int age = -10;
            validateAge(age);
        } catch (CustomException e) {
            // 예외가 발생했을 때 예외 메시지 출력
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}