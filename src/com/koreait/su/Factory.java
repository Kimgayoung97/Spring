package com.koreait.su;

public class Factory {
	public static Tv makeTv(String tvName) {
		switch (tvName) {
		case "Lg":
			return new LgTV(10,20);
		case "Samsung" :
			return new SamsungTV(100,30);			
	}
		return null;

	}
	
	public static Speakerable makeSpeaker(String SpeakerName) {
		switch(SpeakerName) {
		case "Boss" :
			return new BossSpeaker();
		case "Haman":
			return new HamanSpeaker();
		}
		return null;
	}
	
}
