package com.koreait.su;

public abstract class Tv { // extends Object  //멤버필드  // abstract는 객채화안됨!!! 
	private int maxChannel;
	private int currentChannel;
	private int maxVolume;
	private int currentVolume;
	private Speakerable speaker; 
	
	public Tv(int maxChannel, int maxVolume) { //생성자 
		super(); //컴파일러가 자동으로 생성 
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	public void setSpeaker(Speakerable speaker) {
		this.speaker = speaker;
	}
	
	
	public void volumeUp() {
		if(maxVolume > currentVolume) {
			currentVolume++;
		}
		speaker.speakUp();
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
		}
		speaker.speakDown();
	}
	
	@Override
	public String toString() { //부모꺼를 그대로 안쓰고 새로 지정해서 쓰겠다
		return String.format("currentChannel : %d, currentVolume : %d" , currentChannel, currentVolume );
	}
}
