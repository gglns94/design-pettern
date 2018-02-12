# Template Method

### 등장인물

**AbstractClass**

템플릿 메서드를 구현하고, 이 템플릿 메서드에서 사용하는 추상 메서드를 선언한다.

**ConcreteClass**

AbstractClass 에서 선언된 추상 메서드를 구현한다. 

### 힌트

로직을 공통화 할 수 있다.
하위 클래스에서 상위 클래스의 구현을 이해해야 한다.
하위 클래스를 상위 클래스와 동일시 한다. (instanceof 따위로 구분하지 않는다.)

**Liskov Substitution Principle(LSP)**: "상위 클래스형의 변수에 하위 클래스는 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다."

### 보강

일반적으로 상속을 할 때에는 하위 클래스 시점에서 상위 클래스에 기능을 추가하는 방식으로 생각을 하게 된다. 하지만 Template Method pattern 에서는 상위 클래스가 하위 클래스에게 구현을 요구하는 상황이고, 이를 superclass responsibility 라고 한다.

### Questions

1. java.io.InputStream 에서 Template Method 는 read 에 해당한다.
2. 예제에서 public int final 은 ConcreteClass 에서 구현을 수정할 수 없도록 하는 역할을 한다.
3. open, print, close 의 경우 상속 관계 및 동일 패키지에 있는 클래스에서만 호출할 수 있도록 하고, 관계 없는 다른 클래스에서 호출되지 않도록 한다. 어떻게 해야할까?
