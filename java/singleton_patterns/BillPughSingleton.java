package singleton_patterns;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Singletone instnace created!");
    }

	public class Holder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingleton.Holder.INSTANCE;
	}
    

    public static void main(String...args) {
        System.out.println(BillPughSingleton.getInstance());
    }
}
