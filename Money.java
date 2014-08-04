import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Money {

	private static HashMap<Integer, String> generateDenominations() {
		HashMap<Integer, String> denominations = new HashMap<Integer, String>();
		denominations.put(1, "");
		denominations.put(100, "Hundred ");
		denominations.put(1000, "Thousand ");
		denominations.put(100000, "Lakh ");
		denominations.put(10000000, "Crore ");
		return denominations;
	}

	public static String readMoney() throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		return br.readLine();
	}

	public static Long[] getRupeesAndPaise(String number) {
		Long[] values = new Long[2];
		if (!number.contains(".")) {
			number += ".0";
		}
		StringTokenizer st = new StringTokenizer(number, ".");
		values[0] = Long.parseLong(st.nextToken());
		values[1] = Long.parseLong(st.nextToken());

		int i = 0;
		while (st.hasMoreTokens()) {
			values[i] = Long.parseLong(st.nextToken());
		}

		if (values.length == 1) {
			values[1] = 0L;
		}

		return values;
	}

	public static String convertToWords(long number) {
		String[] uptoNineteen = { "Zero ", "One ", "Two ", "Three ", "Four ",
				"Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
				"Eleven ", " Twelve ", "Thirteen ", "Fourteen ", "Fifteen ",
				"Sixteen ", "Seventeen ", "Eighteen ", "Nineteen " };
		String[] tens = { "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ",
				"Seventy ", "Eighty ", "Ninety " };

		String output = "";
		long denom = 10000000;

		while (denom >= 1L) {
			String hundred = "";
			if (denom == 10L) {
				denom = 100L;
			}
			if (denom == 100L && number > 99L && number < 1000L
					&& number % denom != 0) {
				hundred = "and ";
			}

			long remainder = number / denom;
			if (remainder < 20 && remainder != 0) {
				output += uptoNineteen[(int) remainder] + ""
						+ generateDenominations().get((int) denom) + ""
						+ hundred;
			} else if (remainder >= 20 && remainder < 100) {
				output += tens[(int) (remainder / 10) - 2] + ""
						+ uptoNineteen[(int) (remainder % 10)] + ""
						+ generateDenominations().get((int) denom) + hundred;
			}
			number = number % denom;
			denom = denom / 100;

		}

		return output;
	}
	
	public static String convertToMoney(long rupees, long paise) {
		if (rupees != 0 && paise != 0) {
			return convertToWords(rupees) + "Rupees and "
					+ convertToWords(paise) + "Paise only";
		} else if (rupees != 0 && paise == 0) {
			return convertToWords(rupees) + "Rupees only";
		} else if (rupees == 0 && paise != 0) {
			return convertToWords(paise) + "Paise only";
		} else if (rupees == 0 && paise == 0) {
			return "Zero Rupees only";
		}
		return "";
	}

	public static void main(String[] argv) throws IOException {
		String number = readMoney();
		Long[] values = getRupeesAndPaise(number);
		System.out.println(convertToMoney(values[0], values[1]));
	}
}