import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class InterfaceTest02 {
	
	public static void main(String[] args) throws Exception {
		/* Serialization */
		OutputStream os = new FileOutputStream("out.data");
		// ObjectOutputStream - used for serializing and deserializing objects
		// Maybe native Gson from java.io class
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		out.writeObject(new Member("Niko"));
		out.writeObject(new Member("Roman"));
		out.writeObject(new String("Will this seralize?"));
		out.close();
		
		/* Deserialization */
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.data"));
		// occurs ClassNotFoundException
		print(in.readObject()); // toString() in each classes will work
		print(in.readObject());
		print(in.readObject());
		in.close();
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
