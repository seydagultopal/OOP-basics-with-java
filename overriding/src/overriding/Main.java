package overriding;

public class Main {

	public static void main(String[] args) {
		

		BaseKreditManager[] kreditManagers = new BaseKreditManager[] { new OgretmenKrediManager(),
				new TarımKrediManager(),new OgrenciKrediManager() };

		for (BaseKreditManager kreditManager : kreditManagers) {

			System.out.println(kreditManager.hesapla(1000));
		}

	}

}
