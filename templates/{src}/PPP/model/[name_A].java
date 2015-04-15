package <%=gen.package%>;

import java.io.Serializable;

public class <%=gen.name%> implements Serializable {
	
<% each(current.attributes, function(attr) { %>
	private <%=attr.type.A()%> <%=attr.name.a()%>;
<% }) %>

	public <%=gen.name%>() {
	}

<%
var args = '';
each(current.attributes, function(attr) {
	if(args != '') { args += ', '; }
	args += attr.type.A() + " " + attr.name.a();
})
%>
	public <%=gen.name%>(<%=args%>) {
<% each(current.attributes, function(attr) { %>
		this.<%=attr.name.a()%> = <%=attr.name.a()%>;
<% }) %>
	}

	<% each(current.attributes, function(attr) { %>
	public <%=attr.type.A()%> get<%=attr.name.A()%>() {
		return <%=attr.name.a()%>;
	}

	public void set<%=attr.name.A()%>(<%=attr.type.A()%> <%=attr.name.a()%>) {
		this.<%=attr.name.a()%> = <%=attr.name.a()%>;
	}
	<% }) %>

}
