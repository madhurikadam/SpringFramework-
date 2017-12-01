package com.madhuri;

public class InstrumentalistDec implements PerformerDec {

	public InstrumentDec getIm() {
		return im;
	}
	public void setIm(InstrumentDec im) {
		this.im = im;
	}
	public InstrumentalistDec(InstrumentDec im) {
		super();
		this.im = im;
	}
	public InstrumentalistDec(){
		
	};
	private InstrumentDec im;
	@Override
	public void perform() throws PerformanceException {
		im.play();
	}
	public void ThankYou(){
		System.out.println("ThankYou");
	}

}
