<%-- 
    Document   : login
    Created on : 12-Apr-2024, 4:44:51 pm
    Author     : Utkarsh Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login - getpharm</title>
        <%@include file="componenets/common_css_js.jsp"%>
        <%@include file="componenets/navbar.jsp" %>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="card mt 4">
                        <div class="card-header custom-bg text-white">
                            <h3>Login here</h3>
                            
                        </div>
                        <div class="card-body px5">
                         <%@include file="componenets/message.jsp" %>

                               <div style="text-align: center;">
                              <img src="image/logo-color.png" height="300" width="300" >
                          </div>
                               <form action="LoginServlet" method="post">
                                     <div class="mb-3">
                                          <label for="exampleInputEmail1" class="form-label">Email address</label>
                                           <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                           <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                    </div>
                                    <div class="mb-3">
                                           <label for="exampleInputPassword1" class="form-label">Password</label>
                                           <input name="password" type="password" class="form-control" id="exampleInputPassword1">
                                    </div>
                                    <a href ="register.jsp" class="text-center d-block mb-2"> if not registered click here </a>
                                    <div class="container text-center">
                                         <button type="submit" class="btn btn-primary custom-bg border-0">Submit</button> 
                                         <button type="reset" class="btn btn-primary custom-bg border-0">Reset</button> 
                                    </div>
                                </form>
                        </div>
                       
                    </div>
                </div>
                
            </div>
        </div>
    </body>
</html>
