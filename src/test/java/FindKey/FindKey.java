package FindKey;

import com.google.gson.*;
import org.junit.Test;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by abarabash on 5/6/16.
 */
public class FindKey {

    List<JsonElement> result = new ArrayList<>();

    public JsonElement getJsonFromFile(String fileName) throws IOException {

        JsonParser parser = new JsonParser();

        JsonElement expectedJsonResponse = parser.parse(new FileReader("src/test/java/FindKey/" + fileName));

        return expectedJsonResponse;
    }

    private List<JsonElement> findKey(JsonElement jsonElement, String keyName) {

        if(jsonElement.isJsonObject())
        {
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            if(jsonObject.get(keyName) != null)
            {
                //Object className = jsonObject.get(keyName).getClass();

                if(jsonObject.get(keyName).getClass().getName().equals(JsonPrimitive.class.getName()))
                {
                    JsonObject searchedElement = new JsonObject();
                    searchedElement.add(keyName, jsonObject.get(keyName));
                    result.add(searchedElement);
                } else {
                    findKey(jsonObject, keyName);
                }
            } else {
                for(Map.Entry<String, JsonElement> each: jsonObject.entrySet()){
                    findKey(each.getValue(), keyName);
                }
            }
        }

        else if(jsonElement.isJsonArray())
        {
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            for (JsonElement childElement : jsonArray)
            {
                findKey(childElement, keyName);
            }
        }

        return result;
    }

    @Test
    public void test001() throws IOException {

        JsonElement json = getJsonFromFile("sample.json");

        List<JsonElement> result = findKey(json, "nestedKey");

        System.out.println(result.toString());
    }

}
