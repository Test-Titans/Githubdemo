import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class API {
   /* public static void main(String[] args) {

        baseURI="https://reqres.in/";
        given().
                //header("Content-Type","application/Json").
                //contentType(ContentType.JSON).
                accept(ContentType.JSON).
                //body(json.toJSONString()).
                when().
                delete("/api/users/2").
                then().
                statusCode(204).
                log().all();

    }*/
    @Test
    public void ApiTestng()
    {
     Response resp= RestAssured.get("https://reqres.in/");
     int code=resp.statusCode();

        Assert.assertEquals(204,code);
    }

}
