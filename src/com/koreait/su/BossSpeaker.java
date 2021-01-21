package com.koreait.su;

public class BossSpeaker implements Speakerable {
	private int currentSpeakerPower;
	
	@Override
	public void speakUp() {
		currentSpeakerPower++;
		
	}

	@Override
	public void speakDown() {
		currentSpeakerPower--;
		
	}
	

}
