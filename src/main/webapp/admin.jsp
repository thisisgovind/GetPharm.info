<%-- 
    Document   : admin
    Created on : 13-Apr-2024, 1:16:55 am
    Author     : Utkarsh Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin pannel</title>
         <%@include file="componenets/common_css_js.jsp"%>
        
    </head>
    <body>
        
     
                         <%@include file="componenets/navbar.jsp" %>

    <div class="container admin">
        <div class="row mt-3" >
            <div class="col-md-4">
                
                <div class="card">
                    <div class="card-body text-center">
                        <div class="container">
                          
                            <img style="max-width: 100px;" class="img-fluid rounded-circle" src ="image/teamwork.png"alt="user_icon">
                        </div>
                        
                        <h1>23442</h1>
                        <h1>USERS</h1>
                    
                 
            </div>
            </div>
        </div>
            <div class="col-md-4">
                   <div class="card">
                    <div class="card-body  text-center">
                        <div class="container">
                          
                            <img style="max-width: 100px;" class="img-fluid rounded-circle" src ="image/to-do-list.png"alt="user_icon">
                        </div>
                        <h1>23432</h1>
                        <h1>CATEGORIES</h1>
                    </div>
                </div>   
            </div>
                  <div class="col-md-4">
                   <div class="card">
                    <div class="card-body  text-center">
                           <div class="container">
                          
                            <img style="max-width: 100px;" class="img-fluid rounded-circle" src ="image/organic-product.png"alt="user_icon">
                        </div>

                        <h1>23445</h1> 
                        <h1>PRODUCTS</h1>
                    </div>
                </div>   
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-md-6">
                  <div class="card" data-toggle="modal" data-target="#add-category-modal">
                    <div class="card-body  text-center">
                        <div class="container">
                          
                            <img style="max-width: 100px;" class="img-fluid rounded-circle" src ="image/plus.png"alt="user_icon">
                        </div>
                        <P class="mt-2">Click here to add categories</P>
                        <h1>ADD CATEGORIES</h1>
                    </div>
                </div>   
            </div>
            <div class="col-md-6">
                  <div class="card">
                    <div class="card-body  text-center">
                        <div class="container">
                          
                            <img style="max-width: 100px;" class="img-fluid rounded-circle" src ="image/shopping-bag.png"alt="user_icon">
                        </div>
                        <p class="mt-2">Click here to add product</p>
                        <h1>ADD PRODUCT</h1>
                    </div>
                </div>   
            </div>
        </div>
    </div>
   
   <!-- Button trigger modal -->

<!-- Modal -->
<div class="modal fade" id="add-category-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header custom-bg text-white">
        <h5 class="modal-title" id="exampleModalLabel">Fill categories details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <form>
              <div class="form-group">
                  <input type="text" class="form-control" name="catTitle" placeholder="Enter your categories title"required/>
                  
              </div>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
    </body>
</html>
