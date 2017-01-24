package com.frantz.sandbox;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.frantz.samples.JsonUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/*
	// http://www.sbir.gov/api/solicitations.json?keyword=testing&agency=DOD
	// Fields returned from the API = title, link, description, agency, close_date, status


DOD = Dept. of Defense
HHS = Dept. of Health and Human Services
NASA = National Aeronautics and Space Administration
NSF = National Science Foundation
DOE = Dept. of Energy
USDA = United States Dept. of Agriculture
EPA = Environmental Protection Agency
DOC = Dept. of Commerce
ED = Dept. of Education
DOT = Dept. of Transportation
DHS = Dept. of Homeland Security
 */
public class SBIRSolicitation 
{
	private String mtitle;
	private String mlink;
	private String mdescription;
	private String magency;
	private String mclose_date;
	private String mstatus;
	private String mid;
	
	public static final String[] SBIR_Agencies = { "DOD", "HHS", "NASA","NSF", "DOE",
		"USDA", "EPA", "DOC", "ED", "DOT", "DHS"}; 
	
	public static final String[] SBIR_AgenciesExtra = { 
		"Dept. of Defense", 
		"Dept. of Health and Human Services", 
		"National Aeronautics and Space Administration",
		"National Science Foundation", 
		"Dept. of Energy",
		"United States Dept. of Agriculture", 
		"Environmental Protection Agency", 
		"Dept. of Commerce", 
		"Dept. of Education", 
		"Dept. of Transportation", 
		"Dept. of Homeland Security"}; 
	
	public SBIRSolicitation()
	{
		
	}
	
	public SBIRSolicitation(String id,String title,String link,String description,String agency,String close_date,String status)
	{
		mid=id;
		mtitle=title;
		mlink=link;
		mdescription=description;
		magency=agency;
		mclose_date=close_date;
		mstatus=status;
	}
	public String getId() {
		return mid;
	}
	public String getTitle() {
		return mtitle;
	}

	public String getLink() {
		return mlink;
	}

	public String getDescription() {
		return mdescription;
	}

	public String getAgency() {
		return magency;
	}

	public String getClose_date() {
		return mclose_date;
	}

	public String getStatus() {
		return mstatus;
	}
	// http://www.sbir.gov/api/solicitations.json?keyword=testing&agency=DOD
	// Fields returned from the API = title, link, description, agency, close_date, status

	public static List<SBIRSolicitation> getSBIRSolicitationJson(String sJson)
	{
		List<SBIRSolicitation> lp = new ArrayList<SBIRSolicitation>();
		try {
			Gson gson = new Gson();
			Map<String, Object> map = gson.fromJson(sJson, new TypeToken<Map<String, Object>>(){}.getType());
			
			map.forEach((x,y)-> System.out.println("key : " + x + " , value : " + y));
			SBIRSolicitation fs = new SBIRSolicitation();
			lp.add(fs);
			/* 
			
			JSONObject root = new JSONObject(sJson);
			int numFound = root.getInt("numFound");
			for(int i=0;i<numFound;i++)
			{
				JSONObject jso = root.getJSONObject(String.valueOf(i));
			
				String id = jso.getString("id");
				String title = jso.getString("title");
				String link = jso.getString("link");
				String description = jso.getString("description");
				String agency = jso.getString("agency");
				String close_date = jso.getString("close_date");
				String status = jso.getString("status");
				
				SBIRSolicitation fs = new SBIRSolicitation( id, title, link, description, agency, close_date, status);
				lp.add(fs);
			}*/
			
			
		} 
		catch (Exception e) {
		}

		
		return lp;
	}
	// http://www.sbir.gov/api/solicitations.json?keyword=testing&agency=DOD
	static public String buildQuery(String keyword, String agency)
	{
		String base="https://www.sbir.gov/api/solicitations.json?";
		if(keyword!=null && keyword.length()>0)
		{
			return String.format("%skeyword=%s&agency=%s", base,keyword, agency);
		}
		return String.format("%sagency=%s", base, agency);
		
	}
	public static String readSBIRSolicitations(String keyword, String agency) 
	{
		String sInput = buildQuery(keyword,agency);
		//return JsonUtils.readJson(sInput);
		try {
			//return UrlReader.readJsonFromUrl(sInput);
			//return JsonUtils.readUrl(sInput);
			return JsonUtils.readJson(sInput);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sInput;
		
	}	
	public static void main(String[] args) {
		String sJson = readSBIRSolicitations("testing","DOD");
		Gson gson = new Gson();
		JsonArray jobj = new Gson().fromJson(sJson, JsonArray.class);
		for (JsonElement jsonElement : jobj) {
			String elStr = jsonElement.toString();
			Map<String, Object> elMap = gson.fromJson(elStr, Map.class);
			for(Map.Entry<String, Object> entry :  elMap.entrySet())
			{
				System.out.println(entry.getKey() + "\t:\t" + entry.getValue());
			}
		}
		
	
		System.out.println("Done");
	}
}
