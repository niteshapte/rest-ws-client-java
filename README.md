# rest-ws-client-java
Consume RESTFul Web Services in Java without using 3rd party APIs

From my blog: http://blogs.niteshapte.com/2013-11-08-how-to-consume-rest-web-service-in-java.htm

# How to consume REST Web Service in Java

What is Web Service?

    Web Services is a technology which provides an efficient way to share application logic across multiple machines running various operating systems and using different development environments.

If you guys want to know more about Web Services, then Google up ;-). But one thing, don’t jump into advance stuff. Clear you basics first or things could get messy 😛

Moving ahead, web services are of two types:

1. SOAP
2. REST

In this post I will cover only REST web service. So, what is REST Web Service?

    Representational State Transfer (REST) is an architectural style that abstracts the architectural elements within a distributed hypermedia system. REST ignores the details of component implementation and protocol syntax in order to focus on the roles of components, the constraints upon their interaction with other components, and their interpretation of significant data elements.

In 2000, Roy Fielding wrote his doctoral dissertation about architectural styles and designs of network-based software architectures. Within it, he speaks of Web architectures where any information or concept that can be named, referred to as a resource, is identified by a resource identifier, such as a URI. In common terms, you can think of the Yahoo! home page as a resource with a resource identifier of http://www.yahoo.com/.rest-featured

Components in this architecture perform actions on the resource using its representation. For instance, using a browser to request the resource, a server transfers the current state of a Web page to the browser. The browser is then able to perform the action of rendering the representation. Simply put, the server sends the data for the requested page in its current state, and the data is rendered. Navigating to any of the links within the rendered page causes a state transition because the next page, which could be considered another state of an application, is transferred to the browser for rendering.

For more details on REST Web Service, please check the article by Roy Fielding – http://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm
