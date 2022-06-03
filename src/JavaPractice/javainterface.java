package JavaPractice;

interface Webdriver{
	public void configchromedriver();
	public void configgeckodriver();
	public void configedgedriver();
}


class Chromedriver implements Webdriver {
	public void configchromedriver() {
		 System.out.println("open chrome");
	}
	public void configgeckodriver() {
		System.out.println("open firefox");
	}
	public void configedgedriver() {
		System.out.println("open edge");
	}
}
	 class javainterface  {
		
		public static void main(String[] args) {
			Webdriver driver;
			Chromedriver demo = new Chromedriver();
			
			demo.configchromedriver();
		}
	}


