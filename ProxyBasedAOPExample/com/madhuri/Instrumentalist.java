package com.madhuri;

public class Instrumentalist implements Performer {

	public Instrument getIm() {
		return im;
	}
	public void setIm(Instrument im) {
		this.im = im;
	}
	public Instrumentalist(Instrument im) {
		super();
		this.im = im;
	}
	public Instrumentalist(){
		
	};
	private Instrument im;
	@Override
	public void perform() throws PerformanceException {
		im.play();
	}
	public void ThankYou(){
		System.out.println("ThankYou");
	}

}
