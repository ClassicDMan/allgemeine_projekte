package LLL_32_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Beispiel {

	public static List<String> analyzeData(String data) {
		List<String> errors = new ArrayList<>();

			try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			InputSource inputSource = new InputSource(new StringReader(data));
			Document document = builder.parse(inputSource);
			}catch(ParserConfigurationException e) {
				errors.add(e.getMessage());
			}catch(IOException e) {
				errors.add(e.getMessage());
			}catch(SAXException e) {
				errors.add(e.getMessage());
			}finally {
				
				//
				System.out.println("u should parse the document");
				//
				
			}
	

		return errors;
	}

	public static void fixAndCombineData(List<String> DataWithErrors) {

		System.out.println("u should solve the Error");

	}

	public static void main(String[] args) {
		String xmlContent = "large xml content";

		int dataSize = xmlContent.length() / 10;
		List<String> datas = splitXML(xmlContent, dataSize);

		List<String> errorsCode = new ArrayList<>();
		for (String data : datas) {
			List<String> errors = analyzeData(data);
			if (!errors.isEmpty()) {
				errorsCode.add(data);
			}
		}

		if (!errorsCode.isEmpty()) {
			fixAndCombineData(errorsCode);
			System.out.println("Errors fixed and XML combined.");
		} else {
			System.out.println("No errors found.");
		}
	}

	private static List<String> splitXML(String xmlContent, int dataSize) {
		List<String> datas = new ArrayList<>();
		for (int i = 0; i < xmlContent.length(); i += dataSize) {
			int endIndex = Math.min(i + dataSize, xmlContent.length());
			datas.add(xmlContent.substring(i, endIndex));
		}
		return datas;
	}
}
