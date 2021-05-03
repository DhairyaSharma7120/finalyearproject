<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=no"
	name="viewport">
<title>Otika - Admin Dashboard Template</title>
<!-- General CSS Files -->
<link rel="stylesheet" href="adminResources/css/app.min.css">
<!-- Template CSS -->
<link rel="stylesheet" href="adminResources/css/style.css">
<link rel="stylesheet" href="adminResources/css/components.css">
<!-- Custom style CSS -->
<link rel="stylesheet" href="adminResources/css/custom.css">
<link rel='shortcut icon' type='image/x-icon'
	href='adminResources/image/favicon.ico' />
</head>

<body>
	<div id="app">
		<div class="main-wrapper main-wrapper-1">
			<div class="navbar-bg"></div>

			<jsp:include page="header.jsp"></jsp:include>


			<jsp:include page="menu.jsp"></jsp:include>


			<!-- Main Content -->
<div class="main-content">
	<section class="section">
      <div class="section-body">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h4 class="header">Add Property</h4>
              </div>
              <%-- <% 
   			  Boolean pass = true;
              String pas = (String)session.getAttribute("pass");  
              out.println(pass);
              out.println(pas);
              
              
              %> --%>
              <div class="card-body">
                <form method="POST" action="./registerdb.jsp">
                  <div class="row">
                    <div class="form-group col-6">
                      
                      
                      
                      <select class="form-control">
                      	<option disabled selected>Select Category</option>
                      	<option>Apartment</option>
                      	<option>Bunglow</option>
                      	<option>Flat</option>
                      	<option>Plot</option>
                      </select>
                    </div>
                    <div class="form-group col-6">
                      <select class="form-control">
                      	<option disabled selected>Select Subcategory </option>
                      	<option>Apartment</option>
                      	<option>Bunglow</option>
                      	<option>Flat</option>
                      	<option>Plot</option>
                      </select>
                    </div>
                    <div class="form-group col-12">
                      <select class="form-control">
                      	<option disabled selected>Select Construction Status </option>
                      	<option>Ready To  Move</option>
                      	<option>Fully Furnished</option>
                      	<option>Under Construction</option>
                      </select>
                    </div>
                    <div class="form-group col-12"><label>LOCATION</label></div>
                    <div class="form-group col-4">
                      <select class="form-control" id="stateSelect" size="1" onchange="makeSubmenu(this.value)">
					        <option value="" disabled selected>Select State</option>
					      
        			</select>
               
                    </div>
                         <div class="form-group col-4">
                      <select class="form-control" id="citySelect" size="1" >
					        <option value="" disabled selected>Select City</option>
					        <option></option>
               
        			</select>	
                    </div>
                         <div class="form-group col-4">
               			<select class="form-control">
                      	<option disabled selected>Select Area </option>
                      
                      </select>
                    </div>
                    
                    
                    
                    <div class="form-group col-6">
                      <label for="bhks">BHKs</label>
                      <select class="form-control">
                      	<option disabled selected>Select Option </option>
                      
                      </select>
                    </div>
                    <div class="form-group col-6">
                      <label for="property-area">Property Area</label>
                      <select class="form-control">
                      	<option disabled selected>Select Option </option>
                      
                      </select>
                    </div>
                    
                    
                    <div class="form-group col-6">
						<label>Owner's Name</label> <input type="text"
							class="form-control" required>
					</div>
					
					<div class="form-group col-6">
						<label>Owner's Contact</label> <input type="number" maxlength="10"
							class="form-control" required>
					</div>
					<div class="form-group col-12">
						<label>Owner's Email</label> <input type="email"
							class="form-control" required>
					</div>
					
					
					<div class="form-group col-12">
                      <label class="">Address</label>
                      <div class="">
                        <textarea class="summernote-simple" rows="4" cols="140"></textarea>
                        </div>
                    </div>
                  
                      <label class="">Attachments</label>
                  <div class="form-group col-12	">
                      <div class="dropzone dz-clickable col-12">
                        <div id="image-preview" class="dz-default dz-message col-12">
                          <input type="file" name="image" id="image-upload" multiple="multiple">
                        </div>
                      </div>
                    </div>
                  
                  </div>
                  
                  
                  
                  
                  <div class="card-footer text-right">
											<button class="btn btn-primary">Save</button>
										</div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
</div>
			<jsp:include page="footer.jsp"></jsp:include>



		</div>
	</div>
	<!-- General JS Scripts -->
	<script src="adminResources/js/app.min.js"></script>
	<!-- JS Libraies -->
	<!-- Page Specific JS File -->
	<!-- Template JS File -->
	<script src="adminResources/js/scripts.js"></script>
	<!-- Custom JS File -->
	<script src="adminResources/js/custom.js"></script>
	<script>
		$(document).ready(function() {
			iziToast.error({
				title : 'Hello, world!',
				message : 'This awesome plugin is made by iziToast',
				position : 'topRight'
			});
		});
	</script>
</body>

</html>