package com.example.demo.enums;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
	NORTH,EAST,SOUTH,WEST;
	
	private static final Map<Direction,Direction> RIGHT_TURNS=new HashMap<Direction,Direction>();
	private static final Map<Direction,Direction> LEFT_TURNS=new HashMap<Direction,Direction>();

	static {
		RIGHT_TURNS.put(NORTH, EAST);
		RIGHT_TURNS.put(EAST, SOUTH);
		RIGHT_TURNS.put(SOUTH, WEST);
		RIGHT_TURNS.put(WEST, NORTH);
		
		LEFT_TURNS.put(NORTH, WEST);
		LEFT_TURNS.put(WEST, SOUTH);
		LEFT_TURNS.put(SOUTH, EAST);
		LEFT_TURNS.put(EAST, NORTH);
	}
	

}
