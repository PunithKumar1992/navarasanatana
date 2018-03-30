<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  lang="kn">
<head>
<title>Navarasa Natana Academy::Admin</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="Shift_JIS">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="admincss/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="admincss/style.css" rel='stylesheet' type='text/css' />
<link href="admincss/style-responsive.css" rel="stylesheet"/>
<link rel="stylesheet" href="admincss/lightbox.css">
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="admincss/font.css" type="text/css"/>
<link href="admincss/font-awesome.css" rel="stylesheet"> 
<link rel="stylesheet" href="admincss/morris.css" type="text/css"/>
<!-- calendar -->
<link rel="stylesheet" href="admincss/monthly.css">
<!-- //calendar -->
<!-- //font-awesome icons -->
<script src="adminjs/jquery2.0.3.min.js"></script>
<script src="adminjs/raphael-min.js"></script>
<script src="adminjs/morris.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">
    <a href="dashboard.html" class="logo">
         <img src="adminimages/logo.png" alt="nna" style="width: 9%; margin-top: -8%;">
		<img src="adminimages/logo1.png" alt="nna" style="width: 60%; margin-top: -25%;">
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="top-nav clearfix">
    <!--search & user info start-->
     <ul class="nav pull-right top-menu">
       
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <img alt="" src="images/2.png">
                <span class="username">${sessionScope.activeuser}</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <li><a href="adminprofile.html"><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="adminAdd.html"><i class="fa fa-cog"></i> Settings</a></li>
                <li><a href="adminlogout.html"><i class="fa fa-key"></i> Log Out</a></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
       
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a class="active" href="dashboard.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
                <li class="sub-menu">
                    <a href="adminbanner.html">
                        <i class="fa fa-book"></i>
                        <span>Banner</span>
                    </a>
                            </li>
                <li>
                    <a href="adminadds.html">
                         <i class="fa fa-glass"></i>
                        <span>Ads</span>
                    </a>
                </li>
				 <li>
                    <a href="adminourteam.html">
                        <i class="fa fa-adn" aria-hidden="true"></i>
                        <span> Our Team</span>
                    </a>
                </li>
				
				<li>
                    <a href="adminadmission.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span>Admission</span>
                    </a>
                </li>
				<li>
                    <a href="adminfaculty.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span>Faculty</span>
                    </a>
                </li>
				<li>
                    <a href="admingallery.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span>Gallery</span>
                    </a>
                </li>
				<li>
                    <a href="adminaudition.html">
                       <i class="fa fa-comments-o" aria-hidden="true"></i>
                        <span>Auditions</span>
                    </a>
                </li>
				
				<li>
                    <a href="adminfeedback.html">
                       <i class="fa fa-registered" aria-hidden="true"></i>
                        <span>Feedback</span>
                    </a>
                </li>             
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
            <div class="row">
            <div class="col-md-12">
                    <section class="panel">
                        <header class="panel-heading">
                       	   ಸಿಬ್ಬಂದಿ
                        </header>
                        <div class="panel-body">
                            <div >
                        <form:form method="post" action="saveadminfaculty.html" modelAttribute="faculty"  enctype="multipart/form-data">
                        <div class="col-md-3" >
                        
                        <form:input path="faculty_name" placeholder="ಸಿದ್ಧಬಂದಿ ಹೆಸರು"/>
                        </div>
                        <div class="col-md-3">     
                        <form:input path="faculty_disc" placeholder="ಸಿದ್ಧಬಂದಿ  ವೃತ್ತಿ"/>
                        </div>
                        
                        <div class="col-md-3">
                                   <label>ಭಾವಚಿತ್ರ ಅಪ್ಲೋಡ್ ಮಾಡಿ</label>
                                    <input type="file" id="fileUpload" name="facultyfile" placeholder="File input" id="fileUpload" onchange="Upload();" value="" accept=".jpg,.png,jpeg">
                                </div>
                                <div class="col-md-3">
                                    <button type="submit" class="btn btn-info" id="sub" style="margin-top:-2%">Add</button>
                                </div>
                        
                        
                        </form:form>
                        
                        
                        
                        
                            </div>
                        </div>
                    </section>
            </div>
</section>
		<div class="table-agile-info">
  <div class="panel panel-default">
    <div class="panel-heading">
      ಸಿಬ್ಬಂದಿ  ಮಾಹಿತಿ
    </div>
     <div class="table-responsive">
      <table class="table table-striped b-t b-light">
        <thead>
          <tr>
		  <th style="font-size:"><b>ಹೆಸರು</b></th>
		  <th>ವೃತ್ತಿ</th>
            <th>ಭಾವಚಿತ್ರ</th>
            <th> ಕ್ರಿಯೆ</th>
          </tr>
        </thead>
        <tbody>
    <c:forEach var="faculty" items="${facultylist}">
    <c:url var="addeletefaculty" value="addeletefaculty.html">
    <c:param name="faculty_id" value="${faculty.faculty_id}"></c:param>
    <c:param name="faculty_image" value="${faculty.faculty_image}"></c:param>
    </c:url>
    <c:url var="adminfacultyedit" value="adminfacultyedit.html">
    <c:param name="faculty_id" value="${faculty.faculty_id}"></c:param>
    </c:url>
    
	 <tr>
	 <td>${faculty.faculty_name}</td>
	 <td>${faculty.faculty_disc}</td>	
            <td>
			<a class="example-image-link" href="images/faculty/${faculty.faculty_image}" data-lightbox="example-set" >		
	<img src="images/faculty/${faculty.faculty_image}" alt="" width="70%"/>
	</a>
	
			<!-- //gallery -->
			</td>
			<td>
			<a href="${adminfacultyedit}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
		<a href="${addeletefaculty}"><i class="fa fa-trash" aria-hidden="true"></i></a>
		  </td>
		 
		   </tr>
		   </c:forEach>
		    <script src="adminjs/lightbox-plus-jquery.min.js"> </script>
        </tbody>
      </table>
    </div>
    
  </div>
</div>
 <!-- footer -->
		  <div class="footer">
			<div class="wthree-copyright">
			  <p>Â© 2018 Navarasa Natana Academy. All rights reserved | Design by <a href="http://appfonehub.com">Appfone Hub Private Limited.</a></p>
			</div>
		  </div>
</section>
<!--main content end-->
</section>
<!--main content end-->
</section>
<script src="adminjs/bootstrap.js"></script>
<script src="adminjs/jquery.dcjqaccordion.2.7.js"></script>
<script src="adminjs/scripts.js"></script>
<script src="adminjs/jquery.slimscroll.js"></script>
<script src="adminjs/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="js/jquery.scrollTo.js"></script>
<!-- morris JavaScript -->	
<script>
	$(document).ready(function() {
		//BOX BUTTON SHOW AND CLOSE
	   jQuery('.small-graph-box').hover(function() {
		  jQuery(this).find('.box-button').fadeIn('fast');
	   }, function() {
		  jQuery(this).find('.box-button').fadeOut('fast');
	   });
	   jQuery('.small-graph-box .box-close').click(function() {
		  jQuery(this).closest('.small-graph-box').fadeOut(200);
		  return false;
	   });
</script>

<script type="text/javascript">
function Upload() {
    //Get reference of FileUpload.
    var fileUpload = document.getElementById("fileUpload");
 
    //Check whether the file is valid Image.
    var regex = new RegExp("([a-zA-Z0-9\s_\\.\-:])+(.jpg|.png|.gif)$");
    if (regex.test(fileUpload.value.toLowerCase())) {
 
        //Check whether HTML5 is supported.
        if (typeof (fileUpload.files) != "undefined") {
            //Initiate the FileReader object.
            var reader = new FileReader();
            //Read the contents of Image File.
            reader.readAsDataURL(fileUpload.files[0]);
            reader.onload = function (e) {
                //Initiate the JavaScript Image object.
                var image = new Image();
 
                //Set the Base64 string return from FileReader as source.
                image.src = e.target.result;
                       
                //Validate the File Height and Width.
                image.onload = function () {
                    var height = this.height;
                    var width = this.width;
                    if (height == 4617 && width == 4617) {
                    	alert("Uploaded image has valid Height and Width.");
                        document.getElementById('sub').disabled = false;
                        
                    }
                    else
                    	{
                    	 alert("Height and Width must not exceed 4617px & 4617px.");
                    	document.getElementById('sub').disabled = true;
          
                    	}
                };
 
            }
        } else {
            alert("This browser does not support HTML5.");
            return false;
        }
    } else {
        alert("Please select a valid Image file.");
        return false;
    }
}


</script>


</body>
</html>
