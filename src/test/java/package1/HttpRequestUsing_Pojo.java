/*
 * package package1;
 * 
 * import static io.restassured.RestAssured.*; import static
 * io.restassured.matcher.RestAssuredMatchers.*; import static
 * org.hamcrest.Matchers.*;
 * 
 * import org.testng.annotations.Test; //import package1.Pojo_Request;
 * 
 * public class HttpRequestUsing_Pojo {
 * 
 * private final String NAME = "Praveen"; private final String PHONE_NUMBER =
 * "898565258"; private final String LOCATION = "India"; private final String
 * JOB = "PM"; private final String courses[] = {"C", "C++"}; private int
 * record_id;
 * 
 * @Test(priority = 1) void createTestdata() {
 * 
 * Pojo_Request data = new Pojo_Request(); data.setName(NAME); data.setJob(JOB);
 * data.setCourses(courses); data.setLocation(LOCATION);
 * 
 * 
 * 
 * given() .contentType("application/json") .body(data)
 * 
 * .when() .post("https://reqres.in/api/users") .body().jsonPath().getList("id")
 * 
 * 
 * 
 * 
 * 
 * .statusCode(201) .log().all()
 * 
 * ;
 * 
 * }
 * 
 * @Test (priority = 2) public void updateUser() { Pojo_Request data = new
 * Pojo_Request(); data.setName(NAME); data.setJob(JOB);
 * 
 * 
 * 
 * }
 * 
 * public void deleteUser() {
 * 
 * 
 * } }
 */