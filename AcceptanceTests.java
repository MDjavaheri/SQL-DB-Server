import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.net.httpserver.HttpServer;
/**
 * 
 */

/**
 * @author morde
 *
 */
public class AcceptanceTests {
	HTTPServer server;
	HttpServer bochen = HttpServer.create(new InetSocketAddress(PORT), 0);
	bochen.start();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		server = new HTTPServer();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	// 1. REQUEST HEADER TESTS
	// 1.1 Unsupported HTTP Methods
	@Test
	public void unsupportedTrace() {

//		bochen.send(request TRACE, OPTIONS, or CONNECT)
//		assert(response code == 501), maybe 405	}
	}
	@Test
	public void unsupportedOptions() {
		
//		bochen.send(request TRACE, OPTIONS, or CONNECT)
//		assert(response code == 501), maybe 405	}
	}
	
	@Test
	public void unsupportedConnect() {
		
//		bochen.send(request TRACE, OPTIONS, or CONNECT)
//		assert(response code == 501), maybe 405	}
	}
	
	@Test
	public void illegalMethod() {
		/*
		 * 405 comes with Allow header field, which has a list of those allowed. 
		 * Verify that it matches the ones specified in the config file
		 */
	}
	
	// 1.2 Accept Headers
	/**
	 * When no available representations match the ones specified in the accept headers
	 * Either 406 or disregard the accept
	 * Write one per type of accept header
	 */
	@Test
	public void noAvailableReps() {
	}
	
	// 1.3 URI
	/**
	 * URI exceeds maximum length
	 * Req: generate random URI string about 9000 bytes in size
	 */
	@Test
	public void uriLength() {
	}
	
	// 1.4 Payload
	/**
	 * Payload type unsupported
	 * 415
	 */
	@Test
	public void unsupportedPayloadType() {
	}

	/**
	 * Payload too large
	 * Req: set a max payload size and then send a message with a bigger one
	 * Objectively - 413 and close, no Retry-After header
	 * Temporarily - 413 with Retry-After header
	 */
	@Test
	public void payloadTooLarge() {
	}
	
	//1.5 Expect
	
	/**
	 * Correct Header Value: "100-continue" is the only supported value
	 * Sends a request with an invalid Expect value, 417
	 */
	@Test
	public void invalidContinueVal() {
		
	}
	
	/**
	 * Server follows up with a final response code in addition to the 100
	 */
	@Test
	public void finalResponseReceived() {
		
	}

	//2.0 HTTP Method Specific Tests
	//2.1 GET
	
	/**
	 * successfully get data that does exist
	 */
	@Test
	public void getExisting() {
		
	}
	
	/**
	 * unsuccessfully get data that does not exist
	 */
	@Test
	public void getNonExisting() {
		
	}
	
	//2.2 HEAD
	
	/**
	 * successfully get header data of a resource does exist, ensure no payload!
	 */
	@Test
	public void headExisting() {
		
	}
	
	/**
	 * unsuccessfully get header data of a resource that does not exist
	 */
	@Test
	public void headNonExisting() {
		
	}
		
	//2.3 POST
	/**
	 * Successful POST - 201
	 * Also anything but 206, 304, and 416
	 */
	@Test
	public void post() {
		
	}
	
	//2.4 PUTs
	/**
	 * PUT new Data - 201
	 */
	@Test
	public void newPut() {
		
	}
	
	/**
	 * PUT to replace existing data - 200 or 204
	 */
	@Test
	public void replacePut() {
		
	}
	
	/**
	 * PUT with Content-Range field - 400
	 */
	@Test
	public void badPutHeader() {
		
	}
	
	/**
	 * PUT with no payload - ?Which Error?
	 */
	@Test
	public void noPutPayload() {
		
	}
	
	//2.5 DELETE
	//202, 204, 205
	//Successfully Delete Data that does exist - check for both the correct response to the delete and to a follow up get
	
	//Unsuccessfully Delete data that does not exist - get and then delete
	
	//2.6 TRACE
	//See 1.1
	//2.7 CONNECT
	//See 1.1
	//2.8 OPTIONS
	//See 1.1

	//3.0 Resource Related
	//3.1 Redirects
	/**
	 * GETs resource that has been moved
	 */
	@Test
	public void getRedirected() {
		
	}
	/**
	 * HEADs resouce that has been moved
	 */
	@Test
	public void headRedirected() {
		
	}
	/**
	 * POSTs to resource that has been moved
	 */
	@Test 
	public void postRedirected() {
		
	}
	/**
	 * PUTs resouce that has been moved
	 */
	@Test
	public void putRedirected() {
		
	}
	/**
	 * DELETEs resource that has been moved
	 */
	@Test 
	public void deleteRedirected() {
		
	}
	
	//3.2 User Request Issues
	/**
	 * 403 Forbidden/unauthorized
	 */
	@Test
	public void forbidden() {
		
	}
	
	/**
	 * 404, 410 Resource not found
	 */
	@Test
	public void cantFindResource() {
		
	}
	
	/**
	 * 409, 415 Conflict, inconsistent PUT and server side constraints
	 */
	
	//3.3 Content negotiation
	/**
	 * 409, 415 Inconsistent PUT representation and server side constraints on the resources
	 */
	
	//4.0 Stam
	/**
	 * No deprecated response codes
	 * Find a way to make sure never get 305 or 306
	 */
	@Test
	public void noDeprecateds() {
		
	}
	/**
	 * No timeouts 408
	 */
	@Test
	public void timeouts() {
		
	}
}
