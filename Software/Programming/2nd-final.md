## 09_3 Virtual methods

```java
class Parent {}

class Child extends Parent {}
```

```java
ArrayList<Parent> array = new ArrayList<Parent>();

array.add(new Child());
```

is available for use ~~but how is this even virtual method~~

## 10_3 Wrapper classes

```java
boolean Boolean
byte Byte
long Long
float Float
short Short
double Double
```

`int Integer`

`char Character`

only these two of them have different names from the primitive types

#### Boxing

`Integer a = new Integer(10); // initialize from a value`

`Integer a = Integer.valueOf(i); // initialize from a variable`

as seen, primitive value to a class object is boxing, and vice versa is *obviously* unboxing

#### Unboxing

`int i = a.intValue();`

notice the method name should be different over different types

*it's automatic after Java 1.5 (called auto boxing and auto unboxing)*

## 13_1 GUI

#### GUI componet types

- AWT : Abstract Windows Toolkit (for earlier Java versions)
- Swing : Designed with Composite Design Patterns and has `J` in from of class name

#### GUI packages

- `java.awt` : superclass of GUI components == Utility classes (Color, Point)
- `java.awt.event` : `EventListener`s and more for processing events
- `javax.swing` : GUI containers and components

  - Container class : add/layout the components and group logically
    - can contain another component or container
    - `JFrame` `JWindow` `JDialog` ~~Japple~~ `JApplet` `Jpanel`
  - Component class : actual interface to the user
    - only visible when attached to a container
    - `JButton` `JLable`

* 13_2_GUI
- 출제제외범위: 5~10쪽, 14쪽, 26쪽
- 글자 및 배치관리자는 두루 봐 둘 것. 
- 주석부분 놓치지 말고 읽어둘 것.
* 13_3_GUI
- 출제제외범위: 19쪽~22쪽
* 13_4_GUI
- 출제제외범위: 2쪽, 13~14쪽, 19~31쪽
- 6쪽~10쪽 : 그림은 안 나옴. 글자만 봐 둘 것
- 11쪽~12쪽 : "MouseEvent, ActionEvent" 위주로 봐 둘 것
* 13_5_GUI
- 출제제외범위: 15쪽, 30쪽~32쪽, 또한 하이퍼링크된 사이트는 들어가서 살펴볼 필요 전혀 없음, 
- 12쪽 그림은 의미없음.글자만 봐둘 것
- 9쪽, 13쪽 꼭 봐둘 것!!!
- 14쪽: add(), iterator() 위주로 봐둘 것
- 내부클래스: 익명클래스(26쪽)만 봐둘 것
- 스레드(33~34쪽) : 유심히 봐둘 것
