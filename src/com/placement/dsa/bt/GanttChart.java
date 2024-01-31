package com.placement.dsa.bt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PA PB PC are programs, P1 P2 P3 are process
public class GanttChart {
	private final static  int ticks = 3;
	private final static  int tq = 4;
	List<String> programs = new ArrayList<String>();
	List<String> ganttchart = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> programs = new ArrayList<String>();
		programs.add("P1");
		programs.add("P2");
		
		List<String> processes = new ArrayList<String>();
		processes.add("PA");
		processes.add("PB");
		processes.add("PC");
		
		Map<String, Integer> priorityMap = new HashMap<String, Integer>();
		priorityMap.put(processes.get(0), 2);
		priorityMap.put(processes.get(1), 3);
		priorityMap.put(processes.get(2), 1);
		
		Map<String, Integer> sizeMap = new HashMap<String, Integer>();
		sizeMap.put(processes.get(0), 10);
		sizeMap.put(processes.get(1), 7);
		sizeMap.put(processes.get(2), 5);
		
		
		List<String> list = new ArrayList<String>();
		list.add("PA");
		list.add("PB");
		list.add("PC");
		
		for(int i = 0;i < sizeMap.get(); )
		

	}
	public static String  forkProcess() {
		String p = "P";
		int i = 2;
		p = p+(i+1);
		return p;
	}

}
 