package com.koreait.su;

public class SamsungTV extends Tv{
	public SamsungTV(int maxChannel, int maxVolume) {
		super(maxChannel,maxVolume);
	}
	
	@Override
	public String toString() {
		return "SamsungTV : " + super.toString();
	}

}
