<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]--><head>
<title>Navarasa Natana Academy - film institute</title>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta name="description"  content="Navarasa Natana Academy - film institute"/>
<meta name="keywords" content="Navarasa Natana Academy - film institute">
<meta name="author"  content="Navarasa Natana Academy - film institute"/>
<meta name="MobileOptimized" content="320">
<!--start theme style -->
<link href="css/main.css" rel="stylesheet" type="text/css"/>
<!-- end theme style -->
<!-- favicon icon -->
<link rel="shortcut icon" type="image/png" href="images/favicon.png"/>
<!-- favicon icon -->
</head>
<body>
<!-- preloader start -->
<div class="preloader_wrapper">
	<div id="pre_loader">
		<img src="images/loader.gif" alt="">
	</div>
</div>
<!-- preloader end -->
<!-- header menu section start -->
<div class="headermenupad"><!--dn_header_section-->
	<!-- header_fix_top-->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="dn_navigation_cover">
					<div class="logo1">
						<a href="index.html">
							<img src ="images/logo.png" alt="thumb" class="img-responsive">
						</a>
					</div>
					<div class="dn_logo">
						<a href="index.html">
							<img src ="images/logo1.png" alt="thumb" class="img-responsive">
						</a>
					</div>
					<div class="nav_toggle">
						<span></span>
						<span></span>
						<span></span>
					</div>
					<div class="dn_navigation">
						<ul class="menu">
							 <li><a href="index.html" class="active"><span class="home"></span>ಮುಖಪುಟ</a></li>
							<li><a href="about-us.html"><span class="about"></span>ನಮ್ಮ ಬಗ್ಗೆ</a></li>
							<li><a href="courses.html"><span class="courses"></span>ಶಿಕ್ಷಣ</a></li>
							<li><a href="admission.html"><span class="admission"></span>ಪ್ರವೇಶ</a></li>
							<li><a href="placement.html"><span class="placement"></span>ವೃತ್ತಿ</a></li>
							<li><a href="contact.html"><span class="contact"></span>ಸಂಪರ್ಕ</a></li>
							<li><a href="faculty.html"><span class="faculty"></span>ಸಿಬ್ಬಂದಿ</a></li>
							<li><a href="gallery.html"><span class="gallery"></span>ಗ್ಯಾಲರಿ</a></li>
							<li><a href="auditions.html"><span class="auditions"></span>ಆಡಿಷನ್ </a></li>
						</ul>
					</div>
                                   
                                </div>
			</div>
		</div>
	</div>
</div>
<!-- header menu section End -->
<section class="innerbanner">
<div class="container">
<div class="row">
	<div class="col-md-12">
		<h1>ಸಂಪರ್ಕ</h1>
	</div>
</div>
</div>
</section>

<div class="contact_section">
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-sm-12 right_pad">
				<div class="contact_form">
					<h4 class="contact_heading">ನಮಗೆ ಸಂದೇಶ ಕಳುಹಿಸಿ</h4>
					<form:form method="post" action="sendfeedback.html" modelAttribute="userfeed" onsubmit="return FormValidation();" onchange="return FormValidation();">
					
					<form:input path="feed_name" class="input_control" placeholder="ಹೆಸರು " id="name" name="name"/>
					<form:input path="feed_email" class="input_control" placeholder="ಇಮೇಲ್ " id="email" name="email"/>
					<form:input path="feed_subject" class="input_control" placeholder="ವಿಷಯ" id="subject" name="Subject"/>
					<form:textarea path="feed_msg" placeholder="ಸಂದೇಶ" id="msg" class="textarea input_control" rows="5" cols="5" style="resize:none;"/>
						<button value="ಕಳುಹಿಸು" class="submit_btn view_m_btn" type="submit">ಕಳುಹಿಸು</button>
	
					</form:form>
					
				</div>
			</div>
			<div class="col-md-6 col-sm-12 left_pad">
				<div class="contact_address">
					<h4 class="contact_heading">ಸಂಪರ್ಕ ಮಾಹಿತಿ</h4>
					<div class="address_block">
						<ul>
							<li data-wow-duration="1.5s" class="fadeleft wow" style="visibility: visible; animation-duration: 1.5s; animation-name: fadeleft;">
								<h4>ವಿಳಾಸ</h4>
								<div class="add_icon"><i class="fa fa-map-marker"></i></div>
								<div>
									<p>#393,13th ಅಡ್ಡ, ಎರಡನೆ ಮಹಡಿ ಕರ್ನಾಟಕ ಬ್ಯಾಂಕ್ ಮೇಲೆ,<br>
									ಸದಾಶಿವನಗರ, ಬೆಂಗಳೂರು
									ಭಾರತ 560080</p>
								</div>
							</li>
							<li data-wow-duration="2s" class="fadeleft wow" style="visibility: visible; animation-duration: 2s; animation-name: fadeleft;">
								<h4>ದೂರವಾಣಿ</h4>
								<div class="add_icon"><i class="fa fa fa-phone"></i></div>
								<div>
									<p>+91 9880219666 </p>
									<p>+91 9880419666 </p>
								</div>
							</li>
							<li data-wow-duration="2.5s" class="fadeleft wow" style="visibility: visible; animation-duration: 2.5s; animation-name: fadeleft;">
								<h4>ಇಮೇಲ್</h4>
								<div class="add_icon"><i class="fa fa-envelope"></i></div>
								<div>
									<a href="#">www.navarasanatana.com</a>
									<a href="#">navarasanatana@gmail.com</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>




<!-- footer section Start -->
<div class="dn_section dn_footer_section">
	<div class="container">
		<div class="row">
			<div class="footer_content">
				<div class="footer_icon">
					<a href="#" class="hexa_icon">
						<div class="hexa_inner"><i class="fa fa-facebook"></i></div>
					</a>
					<a href="#" class="hexa_icon">
						<div class="hexa_inner"><i class="fa fa-twitter"></i></div>
					</a>
					<a href="#" class="hexa_icon">
						<div class="hexa_inner"><i class="fa fa-pinterest-p"></i></div>
					</a>
					<a href="#" class="hexa_icon">
						<div class="hexa_inner"><i class="fa fa-linkedin"></i></div>
					</a>
					<a href="#" class="hexa_icon">
						<div class="hexa_inner"><i class="fa fa-google-plus"></i></div>
					</a>
				</div>
				<p> &copy; 2018 Navarasa Natana Academy. All rights reserved | Designed by <a target="_blank" href="appfone hub">Appfone hub</a></p>
			</div>
		</div>
	</div>
</div>
<!-- footer section End -->
<!--main js file start--> 
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!--main js file end-->
<!--slider js Start-->
<script type="text/javascript" src="js/plugins/slider/swiper.min.js"></script>
<script type="text/javascript" src="js/plugins/carousel/owl.carousel.js"></script>
<!--slider js Start-->
<!-- portfolio js -->
<script type="text/javascript" src="js/plugins/portfolio/jquery.mixitup.js"></script> 
<!-- portfolio js -->
<!-- player js start -->
<script type="text/javascript" src="js/plugins/player/js/mediaelement-and-player.min.js">
</script>
<script type="text/javascript" src="js/plugins/player/js/mep-feature-playlist.js">
</script>
<!-- player js end -->
<!-- wow js start -->
<script type="text/javascript" src="js/plugins/animation/wow.min.js">
</script>
<!-- wow js end -->
<!-- Gallery js -->
<script type="text/javascript" src="js/plugins/gallery/jquery.magnific-popup.js"></script> 
<!-- Gallery js -->
<!--custom js file Start-->
<script type="text/javascript" src="js/custom.js"></script>
<!--custom js file End-->
<script type="text/javascript">
function FormValidation()
{
	var fn=document.getElementById('name').value;
	
    if(fn == "")
    {
        //alert('Please Enter First Name');
        document.getElementById('name').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('name').style.borderColor = "green";
    }
    if (/^[0-9]+$/.test(document.getElementById("name").value)) 
    {
       //alert("First Name Contains Numbers!");
        document.getElementById('name').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('name').style.borderColor = "green";
    }
    if(fn.length <=2)
    {
        //alert('Your Name is To Short');
        document.getElementById('name').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('name').style.borderColor = "green";
    }
    

    
    var em=document.getElementById('email').value;
    if(em=="")
 	   {
 	   document.getElementById('email').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('email').style.borderColor = "green";
    }
    if(/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/.test(document.getElementById("email").value))
    	{
    	document.getElementById('email').style.borderColor = "green";
    	}
    else
	   {
	   document.getElementById('email').style.borderColor = "red";
	   return false;
	   }
    
    var pos=document.getElementById('pos').value;
    if(pos == "")
    {
        //alert('Please Enter First Name');
        document.getElementById('pos').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('pos').style.borderColor = "green";
    }
    if(/^[a-zA-z]+$/.test(document.getElementById("pos").value))
    	{
    	document.getElementById('pos').style.borderColor = "green";
    	}
   	
    else
	   {
	   document.getElementById('pos').style.borderColor = "red";
	   return false;
	   }
    
    
var sub=document.getElementById('subject').value;
	
    if(sub == "")
    {
        //alert('Please Enter First Name');
        document.getElementById('subject').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('subject').style.borderColor = "green";
    }
    if (/^[0-9]+$/.test(document.getElementById("subject").value)) 
    {
       //alert("First Name Contains Numbers!");
        document.getElementById('subject').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('subject').style.borderColor = "green";
    }
    if(sub.length <=2)
    {
        //alert('Your Name is To Short');
        document.getElementById('subject').style.borderColor = "red";
        return false;
    }
    else
    {
        document.getElementById('subject').style.borderColor = "green";
    }
    
   
   
   
   var msg=document.getElementById('msg').value;
	
   if(msg== "")
   {
       //alert('Please Enter First Name');
       document.getElementById('msg').style.borderColor = "red";
       return false;
   }
   else
   {
       document.getElementById('msg').style.borderColor = "green";
   }
   if (/^[0-9]+$/.test(document.getElementById("msg").value)) 
   {
      //alert("First Name Contains Numbers!");
       document.getElementById('msg').style.borderColor = "red";
       return false;
   }
   else
   {
       document.getElementById('msg').style.borderColor = "green";
   }
   if(msg.length <=2)
   {
       //alert('Your Name is To Short');
       document.getElementById('msg').style.borderColor = "red";
       return false;
   }
   else
   {
       document.getElementById('msg').style.borderColor = "green";
   }
   
    	
   	
}
</script>
</body>
</html>