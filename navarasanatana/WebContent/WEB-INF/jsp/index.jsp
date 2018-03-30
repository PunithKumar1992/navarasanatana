<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<style>
    .button {
    background-color: #337ab7;
    border: none;
    color: white;
    padding: 12px 25px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

</style>
</head>
<body>
    <style>
        .kannada
        {
            font-family: 'Baloo Tamma', cursive;
        }
  </style>
    
	<div class="body">
     
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
<!-- slider section Start -->
<div class="dn_slider"><!---->
	<div class="swiper-wrapper">
	<c:forEach var="userbanner" items="${userbannerlist}">		
	<div class="swiper-slide">
                    <img src="images/banner/${userbanner.banner_name}" class="img-responsive" alt="">
		</div>
		

		</c:forEach>
		
		
		
	</div>
	
	<div class="swiper_pagination"></div>
	
	 <div class="swiper-button-prev"></div>
    <div class="swiper-button-next"></div>
<!--<img src="images/logo.png" class="slidefiximg">
    <img src="images/logo1.png" class="slidefiximg1">-->
</div>

<div class="dn_section dn_about1_section">
	<div class="container">
		<div class="row">
			<div class="col-md-6"></div>
			<div class="col-md-6">
                         <marquee  SCROLLAMOUNT="6" DIRECTION="up"><p style="text-align: justify;"> ನವರಸನಟನ ಅಕಾಡೆಮಿಯಲ್ಲಿ ಚಲನಚಿತ್ರ ನಟನೆ ಮತ್ತು ನಿರ್ದೇಶನದ ತರಬೇತಿಗೆ ಪೂರ್ಣಾವಧಿ ಮತ್ತು ವಾರಾಂತ್ಯದ ತರಗತಿಗಳು ಲಭ್ಯ

                                ಕಿರುತೆರೆ ಮತ್ತು ಬೆಳ್ಳಿತೆರೆಯಲ್ಲಿ ಉತ್ತಮ ನಟ ಹಾಗೂ ನಿರ್ದೇಶಕರಾಗಲು ಉತ್ತಮ ಅವಕಾಶ ಹಾಗೂ ಅಗತ್ಯ ತರಬೇತಿ ನೀಡಲಾಗುತ್ತೆ.

                                ನಿಮಗೆ ನಟನೆ ಮತ್ತು ನಿರ್ದೇಶನದಲ್ಲಿ ಆಸಕ್ತಿ ಮತ್ತು ಕೌಶಲ್ಯವಿದ್ದರೆ ಸಾಕು. ನಿಮಗೆ ಉತ್ತಮ ತರಬೇತಿ ನೀಡಿ ಕಿರುಚಿತ್ರದಲ್ಲಿ ನಟಿಸಲು ಮತ್ತು ನಿರ್ದೇಶಿಸಲು ಅವಕಾಶ ಕಲ್ಪಿಸಿಕೊಡುವ ಜವಾಬ್ದಾರಿ ನಮ್ಮದು.
    
                                ನಮ್ಮ ಸಂಸ್ಥೆಯಲ್ಲಿ ನಟನೆ ಮತ್ತು ನಿರ್ದೇಶನದ ತರಬೇತಿ ಪಡೆಯೋಕೆ ಸೇರಿದ ಎಲ್ಲರಿಗೂ ತರಬೇತಿ ನೀಡುವವರು ಸಹ ಚಿತ್ರರಂಗದಲ್ಲಿ ಪ್ರಸಿದ್ದರಾದ ವಿಶೇಷ ವ್ಯಕ್ತಿಗಳು. ಕನ್ನಡ ಚಿತ್ರರಸಿಕರಿಗೆ ಚಿರಪರಿಚಿತರಾದ ಕಲಾ ಸಾಮ್ರಾಟ್ ಎಸ್. ನಾರಾಯಣ್, ಖ್ಯಾತ ನಿರ್ದೇಶಕರಾದ ಎಸ್, ಮಹೇಂದರ್, ವಿಶಾಲ್‍ರಾಜ್, ಅನಂತರಾಜು, ಲಕ್ಕಿ ಶಂಕರ್ ನಟನೆ ಹಾಗೂ ನಿರ್ದೇಶನದ ಬಗ್ಗೆ ತರಬೇತಿ ನೀಡಿದ್ರೆ ಅನಿಲ್ ಅಂಬಾರಿ ಹಿನ್ನಲೆ ಸಂಗೀತ, ಕುಂಗ್ ಫೂ ಚಂದ್ರು ಸಾಹಸ, ಮಾಲೂರ್ ಶ್ರೀನಿವಾಸ್ ನೃತ್ಯ ಹೇಳಿಕೊಡುತ್ತಾರೆ. ಜೊತೆಗೆ ಚಲನಚಿತ್ರ ಮತ್ತು ರಂಗಭೂಮಿಯಲ್ಲಿ ಪ್ರಸಿದ್ಧರಾದ ನಟ ನಟಿಯರು ಹಾಗೂ ನಿರ್ದೇಶಕರು ನಿಮಗೆ ಮಾರ್ಗದರ್ಶನ ನೀಡಲಿದ್ದಾರೆ.</p>
                         </marquee>
                         <a href="about-us.html"><button class="button button2" style="margin-left: 10%;">ಮುಂದೆ ಓದಿ </button></a>

                        </div>			</div>
		</div>
	</div>
</div>
<div class="dn_section section1">
	<div class="container-fulid">
		<div class="row">
			<div class="col-md-6" style="background-image: url(images/d.jpg);background-size:100%";>
                            <a href="courses.html"><h1>ನಿರ್ದೇಶನ</h1></a>
				<p></p>
			</div>
			<div class="col-md-6" style="background-image: url(images/a.jpg);background-size:100%";>
                            <a href="courses.html"><h1>ನಟನೆ</h1></a>     
				<p></p>
			</div>
		</div>
	</div>
</div>
<div class="dn_section teamsection" style="background-color: #000000d1;;">
	<div class="container-fulid">
		<div class="row">
			<div class="col-md-7">
				<h1>ನಮ್ಮ ತಂಡ</h1>
				<c:forEach var="userteamlist" items="${userteamlist}">
				<div class="col-md-4">
					<p class="teampad">
                       <img src="images/team/${userteamlist.member_image}">
						<span>${userteamlist.member_name} </span><br>
						<i>${userteamlist.member_disg}</i>
					</p>
				</div>
				</c:forEach>
				
                                
				
				
			</div>
			<div class="col-md-5 adpad">
				
                            <div class="col-md-12" style="margin-top: 7%;"><a href="#">
                                    <iframe  src="https://www.youtube.com/embed/mnmTDRZpID8" frameborder="0" allow="autoplay; encrypted-media" style="width:100%;height:452px;" allowfullscreen></iframe>
                                    </a></div>
			</div>
		</div>
	</div>
</div>
<div class="dn_section section2">
	<div class="container-fulid">
		<div class="row">
			<div class="col-md-6" style="background-image: url(images/actin.jpg);">
				<h1><a href="placement.html">ಉದ್ಯೋಗ</a></h1>
			</div>
			<div class="col-md-6" style="background-image: url(images/au.jpg);">
				<h1><a href="auditions.html">ಆಡಿಷನ್</a> </h1>
			</div>
		</div>
	</div>
</div>
<div class="dn_section footer_contact_section">
	<div class="">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-2 col-md-8 col-sm-12" style="margin-top: -8%;">
					<div class="dn_heading_middle">
						<h2>ಸ್ಥಳ</h2>
					</div>
				</div>
				<div class="dn_address_wrap">
					<div class="col-md-4 col-sm-6">
						<div class="address_box">
							<span class="address_icon"><i class="fa fa-phone"></i></span>
							<p>+91 9880219666</p>
							<p>+91 9880419666</p>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="address_box">
							<span class="address_icon"><i class="fa fa-map-marker"></i></span>
							<p>#393,13th ಅಡ್ಡ, ಎರಡನೆ ಮಹಡಿ ಕರ್ನಾಟಕ ಬ್ಯಾಂಕ್ ಮೇಲೆ,<br>
									ಸದಾಶಿವನಗರ, ಬೆಂಗಳೂರು
									ಭಾರತ 560080</p>
						</div>
					</div>
					<div class="col-md-4 col-sm-6">
						<div class="address_box">
							<span class="address_icon"><i class="fa fa-envelope"></i></span>
							<p>www.navarasanatana.com</p>
							<p>navarasanatana@gmail.com</p>
						</div>
					</div>
				</div>
				<!-- figure end-->
				
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
				<p> &copy; 2018 Navarasa Natana Academy. All rights reserved | Designed by <a target="_blank" href="#">Appfone</a></p>
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
</body>
</html>