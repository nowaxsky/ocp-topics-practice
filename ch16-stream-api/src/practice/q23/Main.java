package practice.q23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Nation> list = Arrays.asList(new Nation("Japan", Nation.Land.ASIA), 
										  new Nation("Italy", Nation.Land.EUROPE), 
										  new Nation("French", Nation.Land.EUROPE));
		
		Map<Nation.Land, List<String>> lands = list.stream()
												   .collect(Collectors.groupingBy(
														   Nation::getLand, Collectors.mapping(Nation::getName, Collectors.toList())
														   ));
		
		Map<Nation.Land, List<Nation>> lands2 = list.stream()
													.collect(Collectors.groupingBy(Nation::getLand));
		
		System.out.println(lands);
		System.out.println(lands2);

	}

}
