package co.kr.leehana.handler;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.*;

/**
 * @author Hana Lee
 * @since 2015-10-29 18:11
 */
@ManagedBean(name = "chkBean")
@RequestScoped
public class CheckExBean implements Serializable {

	private static final long serialVersionUID = -6387183517489355204L;

	@Getter
	@Setter
	private boolean rememberMe;

	@Getter
	@Setter
	private String[] favNumber1;

	@Getter
	@Setter
	private List<String> favNumber2;

	@Getter
	@Setter
	private List<String> favNumber3;

	@Getter
	@Setter
	private List<String> favNumber4;

	public String getFavNumber1InString() {
		return Arrays.toString(favNumber1);
	}

	public List<String> getFavNumber2Value() {
		List<String> result = new ArrayList<>();
		result.add("Number2 - 1");
		result.add("Number2 - 2");
		result.add("Number2 - 3");
		result.add("Number2 - 4");
		result.add("Number2 - 5");

		return result;
	}

	public String getFavNumber2InString() {
		return Arrays.toString(favNumber2.toArray());
	}

	private static Map<String, Object> number3Value;
	static {
		number3Value = new LinkedHashMap<>();
		number3Value.put("Number3 - 1", "1");
		number3Value.put("Number3 - 2", "2");
		number3Value.put("Number3 - 3", "3");
		number3Value.put("Number3 - 4", "4");
		number3Value.put("Number3 - 5", "5");
	}

	public Map<String, Object> getFavNumber3Value() {
		return number3Value;
	}

	public String getFavNumber3InString() {
		return Arrays.toString(favNumber3.toArray());
	}

	public static class Number {
		public String numberLabel;
		public String numberValue;

		public Number(String numberLabel, String numberValue) {
			this.numberLabel = numberLabel;
			this.numberValue = numberValue;
		}

		public String getNumberLabel() {
			return numberLabel;
		}

		public String getNumberValue() {
			return numberValue;
		}
	}

	private List<Number> number4List;

	public List<Number> getFavNumber4Value() {
		number4List = new ArrayList<>();
		number4List.add(new Number("Number4 - 1", "1"));
		number4List.add(new Number("Number4 - 2", "2"));
		number4List.add(new Number("Number4 - 3", "3"));
		number4List.add(new Number("Number4 - 4", "4"));
		number4List.add(new Number("Number4 - 5", "5"));

		return number4List;
	}

	public String getFavNumber4InString() {
		return Arrays.toString(favNumber4.toArray());
	}
}
