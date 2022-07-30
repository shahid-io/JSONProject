package jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonfiles\\employee.json");
		
		Object obj = jsonParser.parse(reader);
		JSONObject jsonObj = (JSONObject) obj;
		
		System.out.println(jsonObj.get("firstName"));
		System.out.println(jsonObj.get("lastName"));
			
	
		JSONArray jsonArr = (JSONArray) jsonObj.get("address");
		for(int i=0; i<jsonArr.size(); i++) {
			JSONObject j1 = (JSONObject)jsonArr.get(i);
			System.out.println(j1.get("street"));
			System.out.println(j1.get("city"));
			System.out.println(j1.get("state"));
		}
	}
}
