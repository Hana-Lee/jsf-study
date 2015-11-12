package co.kr.leehana.handler;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Hana Lee
 * @since 2015-11-12 20:32
 */
@ManagedBean(name = "selectBean")
@RequestScoped
public class SelectOneExBean {

	@Getter
	@Setter
	private String favCoffee1;

	@Getter
	@Setter
	private String favCoffee2;

	@Getter
	@Setter
	private String favCoffee3;

	private static Map<String, Object> coffee2Value;

	static {
		coffee2Value = new LinkedHashMap<>();
		coffee2Value.put("Coffee2 - Cream Latte", "Cream Latte"); //label, value
		coffee2Value.put("Coffee2 - Extreme Mocha", "Extreme Mocha");
		coffee2Value.put("Coffee2 - Buena Vista", "Buena Vista");
	}

	public Map<String, Object> getFavCoffee2Value() {
		return coffee2Value;
	}

	@Getter
	public class Coffee {

		private String coffeeLabel;
		private String coffeeValue;

		public Coffee(String coffeeLabel, String coffeeValue) {
			this.coffeeLabel = coffeeLabel;
			this.coffeeValue = coffeeValue;
		}
	}

	private List<Coffee> favCoffee3Value;

	public List<Coffee> getFavCoffee3Value() {
		favCoffee3Value = new ArrayList<>();
		favCoffee3Value.add(new Coffee("Coffee3 - Cream Latte", "Cream Latte"));
		favCoffee3Value.add(new Coffee("Coffee3 - Extreme Mocha", "Extreme Mocha"));
		favCoffee3Value.add(new Coffee("Coffee3 - Buena Vista", "Buena Vista"));

		return favCoffee3Value;
	}
}
