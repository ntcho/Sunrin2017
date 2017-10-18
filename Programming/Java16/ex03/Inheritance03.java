package ex03;

public class Inheritance03 {
	public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("XÁÂÇ¥ ÀÔ·Â: ");
        int x = sc.nextInt();
        System.out.print("YÁÂÇ¥ ÀÔ·Â: ");
        int y = sc.nextInt();
        System.out.print("ZÁÂÇ¥ ÀÔ·Â: ");
        int z = sc.nextInt();
        Point3D p = new Point3D(x, y, z);
        System.out.println(p.getLocation());

        sc.close();
    }
}
