package week1.day2;

public class Browser {

	public static void main(String[] args) {
	 Browser open = new Browser();
	open.launchBrowser("Edge");
	open.loadUrl();
	
	 
	}
public String launchBrowser(String browserName) {
	
System.out.println("Browser launched sucessfully..");
return browserName;
}
public void loadUrl() {
	
System.out.println("Application Url loaded successfully..");
}
}
