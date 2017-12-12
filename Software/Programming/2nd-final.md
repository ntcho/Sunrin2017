- 09_3 Virtual methods

```java
class Parent {}

class Child extends Parent {}
```

```java
ArrayList<Parent> array = new ArrayList<Parent>();

array.add(new Child());
```

is available for use

~~but how is this even virtual method~~

- 10_3 Wrapper classes

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

  - Boxing

`Integer a = new Integer(10); // initialize from a value`

`Integer a = Integer.valueOf(i); // initialize from a variable`

as seen, primitive value to a class object is boxing, and vice versa is *obviously* unboxing

  - Unboxing

`int i = a.intValue();`

notice the method name should be different over different types

+ it's automatic after Java 1.5 (called auto boxing and auto unboxing)