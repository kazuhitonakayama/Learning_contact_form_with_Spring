package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	// Serviceクラスは、Entityのインスタンスを提供するクラス
	String greet(int i);
	
	ArrayList<Member> getAll(); // Shit ctl O で選択
}
