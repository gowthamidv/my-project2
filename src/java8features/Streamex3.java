package java8features;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Streamex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=Arrays.asList(2,4,5,9,11,13,15,17);
int min=list.stream().mapToInt(a->a).min().orElse(0);
System.out.println(min);
long count=list.stream().mapToInt(a->a).count();
System.out.println(count);
IntSummaryStatistics stats=list.stream().mapToInt((x)->x).summaryStatistics();
System.out.println(stats.getMax());
System.out.println(stats.getCount());

System.out.println(stats.getAverage());
System.out.println(stats.getMin());



	}

}
