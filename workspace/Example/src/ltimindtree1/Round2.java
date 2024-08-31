package ltimindtree1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Round2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		// electronics
		
		list.stream().filter(p -> p.getCategory().equals("electronics")).collect(Collectors.toList());
		
		// total price
//		int sum = 0;
//		for (Product p : list) {
//			sum += p.getPrice().intValue();
//		}
		list.stream().map(p -> p.getPrice().intValue()).reduce(0, (a, b) -> a + b);
		
		int[] arr = {1,2,4,5,6,7,8,2,3,6,3,2,9};
		Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//findByCategory(String category)
	}
}
	

class Product {
	private int id;
	private String name;
	private String category;
	private BigDecimal price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
