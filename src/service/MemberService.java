package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	// Serviceクラスは、Entityのインスタンスを提供するクラス
	// インターフェイスを見ればメソッドが全てある
	// またMyBatisのように自動生成をしてくれる
	String greet(int i);
	
	Integer sumOf(int i,int n);
	
	ArrayList<Member> getAll(); // Shit ctl O で選択
}
