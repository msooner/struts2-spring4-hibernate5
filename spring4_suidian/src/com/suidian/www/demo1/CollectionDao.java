package com.suidian.www.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDao {
	private String[] arrs;
	private List<String> lists;
	private Set<String> sets;
	private Map<String, String> maps;
	
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	@Override
	public String toString() {
		return "CollectionDao [lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", arrs=" + Arrays.toString(arrs)
				+ "]";
	}
	
}
