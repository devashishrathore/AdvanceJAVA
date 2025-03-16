package servlets;

// ===============================================================================================  Servlet  =====================================================================================================================

// Servlet ->

// Servlet Hierarchy -> There is one Class(GenericServlet) is directly implements the Servlet Interface and one Class(HttpServlet)is indirectly implements the Servlet Interface so the hierarchy is like
//                      Servlet(I) is parent of GenericServlet(C) and this GenericServelt(C) is parent of HttpServlet(C).

// Sevlet(I) and Use case -> where we need to the proper life cycle of Servlet, It defines Servlet life-cycle methods. It has 5 common methods for defining the life cycle of Servlet.

// GenericServlet(C) and Use case -> Where we want to create protocol protocol-independent Servlet i.e. there are no request and response objects in Servlet or A Protocol-independent Servlet is a 
//                                   Servlet that can handle requests from different network protocols, such as HTTP, HTTPS, FTP, and many more...

// HttpServelt(C) and Use case -> It is used when we want http specify methods & request-rsponse Object. some commonly used HTTP methods are GET, HEAD, POST, PUT, and DELETE.
//                                It is the most preferred way to create Servlet due to HttpServelt providing HTTP methods and also the child of Servlet(I) and GenericServlet(I) so
//                                also inherit properties of those Parents.

// ##Note:- For using Servlet, We have to create one file i.e. "Deployment Descriptor" file i.e. web.xml file.
//          To define which Servlet is executed by using Servlet configuration in the web.xml file. It is the present WEB-INF folder.
//          In the latest version, it is not compulsory to create a web.xml file due to annotation in Java. 

// Annotations i.e. @WebServlet, @WebFilter, @WebListner, @MultipartConfig, etc are part of the Java Servlet API and can be used in any version from Servlet 3.0 onwards,
// including newer versions like 3.1, 4.0 and 5.0

// Life-Cycle of Servlet:-
// Servlet file is contained in the server(Apache Tomcat Server) and it is connected with the Client(Browser). So some Steps/Stages for a life-cycle of Servlet->

// (1) Loading & Instantiation -> Whenever the server is started so Servlet file is loaded in memory and our ServletClass object is created i.e. in deeply, first MyServlet.java 
//                                file will complied and a .class file will be created and then this .class file will be loaded in the memory.                            
// (2) Initialization -> As the Servlet Object is created init() method will be invoked i.e. Servlet object will be initialized by invoking the init() method 
// (3) Request handling -> Now as the client sends any request the service() method will be invoked in the server and it checks the type of request and invokes as per the request type here is
//                         multithreading occurs when the service() method is invoked it creates a thread and this process is continuous as many requests are sent by the client.
// (4) Destroy -> When the server is shutdown, destroy() method will be executed & Servlet object will be deleted. but other resources like a database connection or any file connection close first.

// HttpServletRequest and HttpServletResponse:-
// Both are the interface by creating their reference we can use it in the service() method so->

// HttpServletRequest -> When the client sends any request so by Using HttpServletRequest interface methods like getParameters(), getCookies(), or any other content request will be accessible.
//                       Some common methods of HttpServletRequest (I) are ->

// -> getParameter(String name): Returns the value of the request parameter specified by the name.
// -> getCookies(): Returns an array of Cookie objects representing the cookies included in the request.
// -> getSession(boolean create): Returns the current session associated with the request or creates a new one if create is true.
// -> getMethod(): Returns the HTTP method of the request, such as GET, POST, PUT, DELETE, etc.
// -> getAttribute(String name): Returns the value of the named attribute as an Object.
// -> setAttribute(String name, Object value): Binds an object to a given attribute name in the request scope.
// -> getHeader(String name): Returns the value of the specified HTTP header.
// -> getHeaderNames(): Returns an enumeration of all the header names sent with the request.
// and many more methods...

// HttpServletResponse -> After getting client request data or any request, by using HttpServletResponse Interface methods like sendRedirect(), sendError() or any other response will be 
//                        sent back to the client or use/set request content as requirements.               
//                        Some common methods of HttpServletRequest (I) are ->

// -> getWriter(): Returns a PrintWriter object that can be used to send character text to the client.
// -> setContentType(String type): Sets the MIME type of the response.
// -> setContentLength (int len): Sets the length of the content being returned in the response.
// -> sendRedirect(String location): Redirects the client to a different URL.
// -> sendError(int sc, String msg): Sends an error response to the client with the specified status code and message.
// -> addCookie(Cookie cookie): Adds a cookie to the response.
// -> setStatus(int sc): Sets the status code of the response.
// -> setHeader(String name, String value): Sets the value of the specified response header.
// -> addHeader(String name, String value): Adds a response header with the given name and value.
// and many more methods...

// sendRedirect() and RequestDispatcher:- 
// Both are used to respond to the client with different pages, resources, or the same applications. There is some difference between senRedirect and RequestDispatcher->

// sendRedirect -> It is the method of HttpServletResponse and is used to redirect the response to another resource(i.e. to server or JSP or HTML etc...) or we simply say that we can redirect the response to 
//                 another/external application from the existing application by the sendRedirect method and it will change the URL.

// (1) It is used for external request redirection
// (2) It redirects the request to a different application or URL
// (3) It is called by the HttpServletResponse object
// (4) It changes the URL on the browser
// (5) Syntax:-
//                1. For any URL: response.sendRedirect("https://www.example.com");
//                2. For any servlet : response.sendRedirect("/servlet2");

// RequestDispatcher -> It is the interface and is used to dispatch the request to another resource(i.e. server or JSP or HTML within the same application) or we simply say that we can dispatch the request to 
//                      another/internal page or the same page with a different error or message by RequestDispatcher and will not change the URL. It has 2 methods which are:-

// -> forward() method -> It is used to dispatch the request into the dispatch path(i.e. server or JSP or HTML file) as passed arguments in the getRequestDispatcher method.

// -> include() method -> It is used when we need to back end code of existing block and is also included with the dispatch path(i.e. server or JSP or HTML file) as passed arguments in the getRequestDispatcher method.

// (1) It is used for internal request redirection
// (2) It forwards or includes the request to the same application or URL
// (3) It has 2 methods, forward() and include()
// (4) It does not change the URL on the browser
// (5) Syntax:-
//             1. forward() method:
//                 RequestDispatcher rd = request.getRequestDispatcher("/example.jsp"); rd.forward(request, response);
//             2. include() method:
//                 RequestDispatcher rd = request.getRequestDispatcher("/servlet2"): rd.include(request, response);

// HttpSession:- 
// Session -> To maintain the user identity in an object or simply if we need any request object access on multiple pages we have to create a session for that and this object is used to 
//            multiple pages by session Object and it is getting or creating(if earlier not created) by getSession() method of HttpServletRequest Interface.

// Methods of HttpSession->
// -> setAttribute(String name, Object value): Binds an object to a given name in the session.
// -> getAttribute(String name): Retrieves the object associated with the specified name from the session.
// -> removeAttribute(String name): Removes the object associated with the specified name from the session.
// -> invalidate(): Invalidates the session, effectively removing all session attributes and ending the session
// -> getId(): Returns the unique identifier assigned to the session.
// -> isNew(): Returns a boolean indicating whether the session is a new session or an existing one.
// -> getLastAccessedTime(): Returns the time, in milliseconds since midnight January 1, 1970 GMT, when the session was last accessed by the client.
// -> getMaxInactiveInterval(): Returns the maximum time interval, in seconds, between client requests before the session is invalidated.
// -> setMaxinactiveInterval(int interval): Sets the maximum time interval, in seconds, between client requests before the session is invalidated.
//  and many more methods...

// Different ways to delete "Session Object" ->
// 1. using invalidate() method
// 2. closing the browser
// 3. using web.xml file

// Different Clients create different Session objects and provide unique IDs for those clients and by which clients can access the object.
// So if one Client is requested many times it does not need to create sessions for every request.  

public class ServletInterface {
	public static void main(String[] args) {
	}
}
