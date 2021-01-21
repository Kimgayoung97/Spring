package com.koreait.su;

public class LgTV extends Tv {	
	public LgTV(int maxChannel, int maxVolume) {
		super(maxChannel,maxVolume);
	}

	
	@Override
	public String toString() {
		return "LgTv : " + super.toString();
	}
}
