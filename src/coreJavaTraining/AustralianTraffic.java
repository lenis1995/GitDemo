package coreJavaTraining;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		AustralianTraffic at = new AustralianTraffic();
		ContinentalTraffic ct = new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
		System.out.println("final git checking");
		System.out.println("develop branch test");
		System.out.println("develop branch test 2");
		System.out.println("develop branch test 3");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		// code
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub

	}

}
