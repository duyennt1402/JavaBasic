package Day5;

public class Main {

	public static void main(String[] args) {
		//practiseInheritance();
		ConCho conChoDom=new ConCho();
		conChoDom.chay();
	}

	public static void pratiseObject() {

		ConCho conChoDom = new ConCho();// khoi tao doi tuong con cho dom
		conChoDom.mauLong = "mau long";
		conChoDom.chay();
		System.out.println(conChoDom.mauLong);

	}

	public static void practiseInheritance() {
		ConChim conChim = new ConChim();
		conChim.mauLong = "bird color";
		System.out.println(conChim.mauLong);
		ConCho conCho= new ConCho();
		conCho.mauLong="dog color";
		System.out.println(conCho.mauLong);
	}

}
