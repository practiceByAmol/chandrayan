package com.example.demo.model;

import com.example.demo.enums.Direction;

public class Position {
	
	public int x;
	public int y;
	public int z;
	public Direction direction;
	
	
	public Position() {
		this.x=0;
		this.y=0;
		this.z=0;
		this.direction= Direction.NORTH;
	}


	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + ", z=" + z + ", direction=" + direction + "]";
	}	
		

}
