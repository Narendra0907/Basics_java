package SystemClassLoaders;

public class Main {
	public static void main(String[] args) 
	{
		System.out.println("This main.class file is loaded by :"+Main.class.getClassLoader());

		System.out.println("Super class for Application class loader is :"+Main.class.getClassLoader().getParent());
	}
}
