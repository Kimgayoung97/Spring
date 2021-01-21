package com.koreait.su;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = Factory.makeTv(args[0]); // hip메모리, 동적할당 //다형성 
		tv1.setSpeaker(Factory.makeSpeaker(args[1]));
		//Tv tv1 = new LgTV(10,10); //없캐스팅 //자동형변환
		
		//LgTV lgTv = (LgTV) tv1; //다운캐스팅 //형변환해줘야함 
		//lgTv.setSpeaker(new BossSpeaker());
		//tv1.setSpeaker(new HamanSpeaker());
		
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		
		System.out.println(tv1);
		
	}
}
