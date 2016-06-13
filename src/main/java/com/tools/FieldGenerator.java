package com.tools;

import java.util.ArrayList;
import java.util.List;

public class FieldGenerator {

	public static enum Mode {
		ALPHA, ALPHANUMERIC, NUMERIC, ALPHANUMERICSCHAR
	}
	
	public List<String> urlList = new ArrayList<String>();

	public void setUrlList(){
		urlList.add("https://graph.facebook.com/v2.6/t_mid.1441089310860:1241ac2fd302509804/messages?since=1465814587&limit=500&fields=message,to,from,created_time,attachments,shares&access_token=CAALyDYhpkjYBAGWZCtDMD9hHZAijZAeMuMPE6VjqIqZCXiDam2dZAjvMYYHc36bUfK6dI6vpaZBP2oZAGltFl2ZBuZBA2nQyeIoh5TpCpIlhxaMeFgiAM9n37qf3fGZA6YEVMfRpc6yk7WJEdbcF0Q0ikSQ8nDSkKztqZCpXkVi6ef9FsnQ8hkZCUpRR&__paging_token=enc_AdBZBtQKBBpc2ZBQvZB3HgTG9BqjohQaKgAtqZAxKaaONCKf71LCdQZCZA50V3jYLrs87TahLNSI1DW3ZC1luczdWHOyv5K1ONJslO5fgsNbQ4Se8qM3wZDZD&__previous=1");
		urlList.add("https://graph.facebook.com/v2.6/t_mid.1441089310860:1241ac2fd302509804/messages?since=2016-06-13T09\u00253A36\u00253A41Z&limit=500&fields=message,to,from,created_time,attachments,shares&access_token=CAALyDYhpkjYBAGWZCtDMD9hHZAijZAeMuMPE6VjqIqZCXiDam2dZAjvMYYHc36bUfK6dI6vpaZBP2oZAGltFl2ZBuZBA2nQyeIoh5TpCpIlhxaMeFgiAM9n37qf3fGZA6YEVMfRpc6yk7WJEdbcF0Q0ikSQ8nDSkKztqZCpXkVi6ef9FsnQ8hkZCUpRR&until=1465814587&__paging_token=enc_AdBZBtQKBBpc2ZBQvZB3HgTG9BqjohQaKgAtqZAxKaaONCKf71LCdQZCZA50V3jYLrs87TahLNSI1DW3ZC1luczdWHOyv5K1ONJslO5fgsNbQ4Se8qM3wZDZD");
		urlList.add("");
	}
	
	/**
	 * Generate random string of given length, based on predefined modes.
	 *
	 * @param length
	 * @param mode
	 * @return
	 */
	public static String generateRandomString(int length, Mode mode) {

		String characters = "";

		switch (mode) {

		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;

		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;

		case ALPHANUMERICSCHAR:
			characters = "abcdefghijklmnopqrstuvwxyz1234567890";
			break;

		case NUMERIC:
			characters = "1234567890";
			break;
		}

		return stringComposer(characters, length);
	}

	/**
	 * Will receive an alphabet and a length and will return a random string
	 * from the alphabet of the given length.
	 * 
	 * @param alphabet
	 * @param length
	 * @return
	 */
	private static String stringComposer(String alphabet, int length) {
		StringBuffer buffer = new StringBuffer();
		int charactersLength = alphabet.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(alphabet.charAt((int) index));
		}

		return buffer.toString();
	}
	// Functionality for multilanguage

	// public static String grabRandomName(List<PackageObjectModel>
	// mongoPackageModelList) {
	// int max = mongoPackageModelList.size();
	// String name = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getName();
	// return name;
	// }
	//
	// public static String grabRandomValue(List<PackageObjectModel>
	// mongoPackageModelList, PackageColumns column) {
	// int max = mongoPackageModelList.size();
	// String value = "";
	// switch (column) {
	// case NAME:
	// value = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getName();
	// break;
	// case CATEGORY:
	// value = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getCategory();
	// break;
	// case VERSION:
	// value = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getVersion();
	// break;
	// case BUILD:
	// value = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getBuildNumber();
	// break;
	// case DESCRIPTION:
	// value = mongoPackageModelList.get(new Random().nextInt(max -
	// 1)).getDescription();
	// break;
	//
	// default:
	// break;
	// }
	//
	// return value;
	// }

	// public static enum AlphabetType {
	// TR, RU, JP,
	// }
	/// **
	// * Generate random string of given length, based on predefined modes and a
	// prefered alphabet type. ex RU, JP etc.
	// * @param length
	// * @param mode
	// * @return
	// */
	// public static String generateRandomString(int length, Mode mode,
	// AlphabetType alphabetType) {
	//
	// LanguageFields strangeString = setLanguage(alphabetType);
	// String characters = "";
	//
	// switch (mode) {
	//
	// case ALPHA:
	// characters = strangeString.getAlpha();
	// break;
	//
	// case ALPHANUMERIC:
	// characters = strangeString.getAlphaNumeric();
	// break;
	//
	// case NUMERIC:
	// characters = strangeString.getNumeric();
	// break;
	//
	// case ALPHANUMERICSCHAR:
	// characters = strangeString.getAlphaNumericChar();
	// break;
	// }
	//
	// return stringComposer(characters, length);
	// }
	// /**
	// * This method should be moved. This action is called for generate random
	// * string method. The method will switch the strings from which the random
	// * strings are build. This is useful for testing region specific alphabet.
	// *
	// * @return
	// */
	// private static LanguageFields setLanguage(AlphabetType alphabetType) {
	// LanguageFields returnObject = new LanguageFields();
	// Properties prop = new Properties();
	// InputStream input = null;
	//
	// try {
	// input = new FileInputStream(Constants.RESOURCES_PATH +
	// alphabetType.toString() + "_Field.properties");
	// prop.load(input);
	// returnObject.setAlpha(prop.getProperty("ALPHA"));
	// returnObject.setAlphaNumeric(prop.getProperty("ALPHANUMERIC"));
	// returnObject.setAlphaNumericChar(prop.getProperty("ALPHANUMERICSCHAR"));
	// returnObject.setNumeric(prop.getProperty("NUMERIC"));
	//
	// } catch (IOException ex) {
	// ex.printStackTrace();
	// }
	//
	// return returnObject;
	// }

	// public static void main(String args[]) {
	// String one = generateRandomString(10, Mode.ALPHA, AlphabetType.RU);
	// System.out.println("LAng: " + one);
	// }

}