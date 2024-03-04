// enum 클래스 내에 추상 메서드를 가진 예제

// enum 클래스 정의
public enum Fruit {
    APPLE {
        @Override
        void process() {
            System.out.println("Wash and peel the apple.");
        }
    },
    BANANA {
        @Override
        void process() {
            System.out.println("Peel the banana.");
        }
    },
    ORANGE {
        @Override
        void process() {
            System.out.println("Cut and squeeze the orange for juice.");
        }
    };

    // 추상 메서드 선언
    abstract void process();
}


