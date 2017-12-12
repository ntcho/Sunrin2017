# 09_3 Virtual methods

```java
class Parent {}

class Child extends Parent {}
```

```java
ArrayList<Parent> array = new ArrayList<Parent>();

array.add(new Child());
```

is available for use ~~but how is this even virtual method~~

# 10_3 Wrapper classes

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

### Boxing

`Integer a = new Integer(10); // initialize from a value`

`Integer a = Integer.valueOf(i); // initialize from a variable`

as seen, primitive value to a class object is boxing, and vice versa is *obviously* unboxing

### Unboxing

`int i = a.intValue();`

notice the method name should be different over different types

*it's automatic after Java 1.5 (called auto boxing and auto unboxing)*

# 13_1 GUI

### GUI = ? != CUI

- User friendly interface
- Uses graphical contents to user
- User inputs with mouse, keyboard

### GUI componet types

- AWT : Abstract Windows Toolkit (for earlier Java versions)
	- Dependent to client OS
- Swing : Designed with Composite Design Patterns and has `J` in from of class name
	- Independent from client OS
	- Lightweight component

### GUI packages

- `java.awt` : superclass of GUI components == Utility classes (Color, Point)
- `java.awt.event` : `EventListener`s and more for processing events
- `javax.swing` : GUI containers and components

  - Container class : add/layout the components and group logically
    - can contain another component or container
		- Root container
			- Cannot be contained in another container
			- `JFrame` `JDialog` ~~Japple~~ `JApplet`
    - Normal container
			- `JPanel` `JScrollPane`
  - Component class : actual interface to the user
    - only visible when attached to a container
    - `JButton` `JLable`

#### JFrame

- Contains all Swing components
- Frame closed == all component invisible
- ![](http://leo.ugr.es/elvira/devel/Tutorial/Java/figures/uiswing/components/ConceptualPains.gif)
- Components are attached to content pane

### Show a window

```java
JFrame frame = new JFrame();

frame.setSize(new Dimension(1280, 720));
// this kills the process on exit
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("Hello");

frame.setVisible(true);
```

### Add a button

```java
JButton button = new JButton("Button");
frame.add(button);
```

### Process events

```java
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class CustomListener implements MouseListener {
	{...}

	@Override
	public void mouseEntered(MouseEvent e) {
		// set the button text
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("Jeff")) {
			button.setText("Jeeff");
		} else {
			button.setText("Jeff");
		}
	}
	
	{...}
}
```

```java
button.addMouseListener(new CustomListener());
```

![Useless image](http://www.cs.rmit.edu.au/online/blackboard/chapter/05/documents/contribute/chapter/07/images/event-model.gif)

1. OS checks event trigger
2. TRIGGERED
3. OS -Event-> JVM
4. JVM -Event info-> Dispatch thread
5. Thread -`new Event()`-> `EventListener`
6. `EventListener` -`Event e`-> `onEvent(e)` execute the event handler method

#### MouseEvent

sourced from `Component` objects

listened by MouseListener

```java
void mouseClicked(MouseEvent)
void mouseEntered(MouseEvent)
void mouseExited(MouseEvent)
void mousePressed(MouseEvent)
void mouseReleased(MouseEvent)
```

#### ActionEvent

sourced from `JButton`, `JList`, `JMenuItem`, `JTextField`

listened by ActionListener

```java
void actionPerformed(ActionEvent)
```

### Exit program

`System.exit(0)`

### Set background color

`panel.setBackground(Color.blue);`

#### Random color

```java
Color getRandom() {
	int r = (int) (Math.random() * 256);
	int g = (int) (Math.random() * 256);
	int b = (int) (Math.random() * 256);
	return new Color(r, g, b);
}
```

### Layouts

1. FlowLayout
	- Left-to-right
	- Center align
	- Automatic new line
```java
	c.setLayout(new FlowLayout());
```

2. BorderLayout
	- Divides the layout by 5 (`NORTH`, `SOUTH`, `WEST`, `CENTER`, `EAST`)
	- ![](https://www.safaribooksonline.com/library/view/learning-java-4th/9781449372477/httpatomoreillycomsourceoreillyimages1707681.png.jpg)
```java
	c.setLayout(new BorderLayout());
	c.add(new JButton("NORTH"), BorderLayout.NORTH);
	c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
	c.add(new JButton("CENTER"), BorderLayout.CENTER);
	c.add(new JButton("WEST"), BorderLayout.WEST);
	c.add(new JButton("EAST"), BorderLayout.EAST);
```

3. GridLayout
	- Layout with row and column set at initialization
	- FIFO like adding function
```java
	c.setLayout(new GridLayout(2, 2));
	c.add(new JButton("Btn1"));
	c.add(new JButton("Btn2"));
	c.add(new JButton("Btn3"));
	c.add(new JButton("Btn4"));
```

4. null
	- Components should be set by (x, y) coordinates and height / width values
	- No coordinate or size won't display the component
```java
	JButton btn1 = new JButton("One");
	btn1.setBounds(10, 10, 100, 50);
	JButton btn2 = new JButton("Two");
	btn2.setBounds(100, 100, 100, 50);
	
	c.setLayout(null);
	c.add(btn1);
	c.add(btn2);
```

# 13_5 Multiple things

### Adapter class
no more copy-paste-hell of interfaces: all methods just return

```java
ActionListener - NONE
ItemListener - NONE
AdjustmentListener - NONE

WindowListener - WindowAdapter
KeyListener - KeyAdapter
MouseListener - MouseAdapter
MouseMotionListener - MouseMotionAdapter
FocusListener - FocusAdapter
ComponentListener - ComponentAdapter
ContainerListener - ContainerAdapter
```

Example:
```java
w.addWindowListener(new WindowAdapter(){  
	public void windowClosing(WindowEvent e) {  
		// do on window close
	}  
});  
```

### Collection framework

![excessive_shadows.gif](https://cdn.edureka.co/blog/wp-content/uploads/2017/05/Collection-framework-hierarchy.png)

- `List`: Ordered set of data with duplicates
- `Set`: Unordered set of data with no duplicates
- `Map`: Set of `key` - `value` match datas with no duplicate keys

- `boolean add(Object element)`	is used to insert an element in this collection
- `int size()`	return the total number of elements in the collection
- `void clear()`	removes the total no of element from the collection
- `Iterator iterator()`	returns an `Iterator` object
- `Object[] toArray()`	converts collection into array
- `boolean isEmpty()`	checks if collection is empty
- `boolean equals(Object element)`	matches two collection

#### Stack

```java
Stack<Object> stack = new Stack<>();

stack.push(new Object());
stack.pop();
```

#### HashSet

```java
HashSet<Object> set = new HashSet<>();

set.add(new Object());
```

#### Iterator

```java
Iterator<Object> i = stack.iterator();

while(i.hasNext()){
	System.out.println(i.next());
}
```

### Inner class

![good_stackoverflow_image.jpg](https://i.stack.imgur.com/I92eu.png)

- Member : member of the outer class
	- need outer class to initialize
	- maximized capsulization
- Local : class (like a local variable) of the method
	- need super method to initialize
	- destoryed after method is finished
- Static : `static`
	- don't need outer class to initialize
	- can only use static variables and local (in the inner class) variable
- **Anonymous** : class with *no name defined*
	- only has instance creating + implementing part
	- used for: 1-use instance (`new ActionListener`), rarely used interfaces
```java
	// modified from https://www.javatpoint.com/anonymous-inner-class
	class Person{  
		void eat();  
	}  
	class TestAnonymousInner{  
		public static void main(String args[]){  
			Person p=new Person(){  
				void eat(){
					System.out.println("nice fruits");
				}  
			};  
			p.eat();  
		}  
	}  
```

### Thread

- Separated execution parts - Asyncronous codes
- Need to sync and manage variables
- Can reuse code and share data
- Lifecycle ![](http://www.brainkart.com/media/extra/MUqJnNf.jpg)

#### How to : extend `Thread`
```java
class Task extends Thread {
	public void run( ) {
		// this will run on thread
	}
} 
```

`new Task().start();`

#### How to : `Runnable`
```java
class Task extends Runnable {
	public void run( ) {
		// this will run on thread
	}
} 
```

`new Thread(new Task()).start()`
