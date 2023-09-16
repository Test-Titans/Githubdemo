import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class api_new {
    public static void main(String[] args) {


        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204).
                log().all();
        System.out.println("Added new api class");
        System.out.println("added 2nd line of print statement");
<<<<<<< HEAD

=======
        System.out.println("adreiena added new code");
>>>>>>> ce2898ad1620094f49a3258c506c2e4140180c52
    }

}
