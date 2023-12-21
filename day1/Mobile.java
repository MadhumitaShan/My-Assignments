package week1.day1;

public class Mobile {
	 void makeCall() {
		// TODO Auto-generated method stub
		String mobilemodel = "Oppo";
		System.out.println("My mobile model is "+ mobilemodel);
		float mobileweight = 250.7F;
		System.out.println("My mobile weight is " + mobileweight);
		
	}
	 void sendMsg() {
		// TODO Auto-generated method stub
		boolean isFullCharged = true;
		System.out.println("is my mobile charged fully " + isFullCharged);
		int mobileCost = 45000;
		System.out.println("My mobile cost is " + mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile Newmobile = new Mobile();
		System.out.println("This is my mobile..");
		Newmobile.makeCall();
		Newmobile.sendMsg();
	}

}

