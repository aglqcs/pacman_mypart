package jp.or.iidukat.example.pacman;

public class PosInfo {
	public float x;
	public float y;
	public Direction d;
	public String player;
	public PosInfo(float x, float y, Direction d, String name){
		this.x = x;
		this.y = y;
		this.d = d;
		player = name;
	}

}
