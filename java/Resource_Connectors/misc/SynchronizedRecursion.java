import java.rmi.activation.ActivationException;

public class SynchronizedRecursion implements Runnable {

	public static void main(String[] args) {
		SynchronizedRecursion s = new SynchronizedRecursion();
		SynchronizedRecursion s2 = new SynchronizedRecursion();
		SynchronizedRecursion s3 = new SynchronizedRecursion();
		SynchronizedRecursion s4 = new SynchronizedRecursion();

		s = new SynchronizedRecursion();

		s.s = s;
		s2.s = s;
		s3.s = s;
		s4.s = s;

		s.sleepTime = 15;
		s2.sleepTime = 8;
		s3.sleepTime = 12;
		s4.sleepTime = 10;

		// new Thread(s).start();
		// new Thread(s2).start();
		// new Thread(s3).start();
		// new Thread(s4).start();

		try {
			tryCatch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String tryCatch() throws Exception {
		String i;

		try {
			i = getI();

			return i;

		} catch (Exception e) {
			throw (e);
		} finally {
			i = null;
		}
	}

	private static String getI() throws Exception {
		throw new Exception("from getI");
//		return "String";
	}

	public int counter = 0;
	public long sleepTime;
	public SynchronizedRecursion s;

	public SynchronizedRecursion() {
	}

	public void run() {
		recursion();
	}

	private synchronized void recursion() {
		s.counter++;
		System.out.println(Thread.currentThread().getName() + " - Counter : "
				+ s.counter);

		try {
			Thread.sleep(this.sleepTime * 100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		recursion();
	}
}