package com.appfone.nna.controller;

import java.io.File;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.appfone.nna.pojo.NnaAdminregistration;
import com.appfone.nna.pojo.NnaAdmission;
import com.appfone.nna.pojo.NnaAds;
import com.appfone.nna.pojo.NnaAuditions;
import com.appfone.nna.pojo.NnaBanner;
import com.appfone.nna.pojo.NnaFaculty;
import com.appfone.nna.pojo.NnaFeedback;
import com.appfone.nna.pojo.NnaGallery;
import com.appfone.nna.pojo.NnaTeam;
import com.appfone.nna.service.AdminAddprofileService;
import com.appfone.nna.service.AdminAdmissionService;
import com.appfone.nna.service.AdminBannerService;
import com.appfone.nna.service.AdminFacultyService;
import com.appfone.nna.service.AdminFeedbackService;
import com.appfone.nna.service.AdminGalleryService;
import com.appfone.nna.service.AdminadsService;
import com.appfone.nna.service.AdminauditionsService;
import com.appfone.nna.service.AdminloginService;
import com.appfone.nna.service.AdminteamService;
import com.appfone.nna.service.RecoveryService;
import com.appfone.nna.service.UserAdmissionService;
import com.appfone.nna.service.UserAuditionService;
import com.appfone.nna.service.UserFacultyService;
import com.appfone.nna.service.UserFeedbackService;
import com.appfone.nna.service.UserGalleryService;
import com.appfone.nna.service.UserbannerService;
import com.appfone.nna.service.UserteamService;
import com.appfone.nna.util.Emailutility;

@Controller
public class NavarasanatanaController {
	
	@Autowired
	private ServletContext context;
	@Autowired 
	private AdminloginService admincheck;
	
	@Autowired
	private RecoveryService recovery;
	@Autowired
	private AdminBannerService bannerlist;
	
	@Autowired
	private HttpSession sessionn;
	
	@Autowired
	private AdminFacultyService facultyservice;
	
	@Autowired
	private AdminadsService adsservice;
	
	@Autowired
	private AdminteamService teamservice;
	
	@Autowired
	private AdminGalleryService galleryservice;
	
	@Autowired
	private AdminauditionsService auditionservice;
	
	@Autowired
	private AdminFeedbackService feedbackservice;
	
	@Autowired
	private AdminAdmissionService admissionservice;
	
	@Autowired
	private AdminAddprofileService adminprofileservice;
	
	@Autowired
	private UserbannerService userservice;
	@Autowired
	private UserteamService userteamservice;
	
	@Autowired
	private UserAdmissionService useradmissionservice;
	
	@Autowired
	private UserFacultyService userfacultyservice;
	
	@Autowired
	private UserGalleryService usergalservice;
	
	@Autowired
	private UserAuditionService useraudservice;
	
	@Autowired
	private UserFeedbackService userfeedservice;
	
	
	@RequestMapping(value="/admin")
	public ModelAndView adminController()
	{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	
	
	@RequestMapping(value="/admindashboard")
	public String admindashboardController(@RequestParam Map<String, String>reqparam)
	{
		
		
		String user=reqparam.get("username");
		String pass= reqparam.get("password1");
		System.out.println("in controller");
		
		int res=admincheck.checkAdmin(user, pass);
		if(res==1)
		{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminindex");
		sessionn.setAttribute("activeuser", user);
		sessionn.setAttribute("activpass", pass);
		String activeuser=user;
		mv.addObject("activeuser", activeuser);
		return "redirect:/adminloginsuccess.html";
		}
		
		return "redirect:/adminloginfailure.html";
	}
	
	@RequestMapping(value="/adminloginsuccess")
	public ModelAndView adminloginsuccessController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminindex");
		return mv;
	}
	
	@RequestMapping(value="dashboard")
	public String dashboardController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		return"redirect:/adminloginsuccess.html";
	}
	
	@RequestMapping(value="/adminloginfailure")
	public ModelAndView adminloginfailureController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		String err="Username or Password Missmatch";
		mv.addObject("logerr", err);
		return mv;
	}
	
	@RequestMapping(value="/adminlogout")
	public String adminlogoutController()
	{
		sessionn.invalidate();
		return "redirect:/admin.html";
	}
	
	@RequestMapping(value="/forgotcredentials")
	public ModelAndView forgotcredentialsController()
	{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("recoverycredentials");
		return mv;
	}
	
	@RequestMapping(value="/recovery")
	public ModelAndView recoveryController(@RequestParam("email")String email)
	{
		
		int res=recovery.checkMailidtosend(email);
		if(res==1)
		{
			String username=recovery.getusername(email);
			String password=recovery.getpassword(email);
			String subject ="login credentials Recovery ";
			String msg="Dear Admin your username and password is as follows \n \n \n Username :" +username +"\n Password is :"+password +"\n \n \n Please don't reply to this message this is computer generated";
		Emailutility.send(email, subject, msg);
		
			ModelAndView mv = new ModelAndView();
		mv.setViewName("popup");
		return mv;
		}
		ModelAndView mv=new ModelAndView();
		mv.setViewName("recoverycredentials");
		String recerror="please enter the registred email id";
		mv.addObject("recerr", recerror);
		return mv;
		
		
	}
	
	@RequestMapping(value="/adminbanner")
	public ModelAndView adminbannerController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView();
		List list=bannerlist.getBannerlist();
		int bansize = bannerlist.getBannersize();
		NnaBanner banner= new NnaBanner();
		mv.addObject("adminbanner", banner);
		mv.addObject("adbannerlist", list);
		mv.addObject("bannersize", bansize);
		mv.setViewName("adminbanner");
		return mv;
	}
	
	@RequestMapping(value="/adminbannerdel")
	public String adminbannerdelController(@RequestParam("banner_id")int banner_id,@RequestParam("banner_name")String banner_name)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		
		System.out.println("in controller");
		
		
		
		bannerlist.deletebanner(banner_id);
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"ads"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,banner_name);
		file.delete();
		return "redirect:/adminbanner.html";
	}
	

	@RequestMapping(value="/saveadminbanner")
	public String saveadminbannerController(@ModelAttribute("adminbanner")NnaBanner banner)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		  MultipartFile file = banner.getAdminbannerfile();
		 
		   
		  String fileName = file.getOriginalFilename();  
		  System.out.println("filename is " +fileName);
		  banner.setBanner_name(fileName);
		  String relativepath = "images/banner/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"banner"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		  bannerlist.saveBanner(banner);
		return "redirect:/adminbanner.html";
	}

	
	@RequestMapping(value="/adminfaculty")
	public ModelAndView adminfacultyController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView();
		NnaFaculty faculty = new NnaFaculty();
		List list = facultyservice.getFacultyList();
		mv.addObject("faculty", faculty);
		mv.addObject("facultylist", list);
		mv.setViewName("adminfaculty");
		return mv;
	}
	@RequestMapping(value="/saveadminfaculty")
	public String saveadminfacultyController(@ModelAttribute("faculty")NnaFaculty faculty)
	{
		System.out.println(faculty.getFaculty_name());
		System.out.println(faculty.getFaculty_disc());
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		MultipartFile file=faculty.getFacultyfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		 faculty.setFaculty_image(fileName);
		  String relativepath = "images/faculty/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"faculty"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  facultyservice.saveFaculty(faculty);
		return "redirect:/adminfaculty.html";
	}
	
	@RequestMapping(value="/addeletefaculty")
	public String addeletefacultyController(@RequestParam("faculty_id")int faculty_id,@RequestParam("faculty_image")String faculty_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		
		System.out.println("in controller");
		
		
		
		
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"faculty"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,faculty_image);
		file.delete();
		facultyservice.deleteFaculty(faculty_id);
		return "redirect:/adminfaculty.html";
	}
	@RequestMapping(value="/adminfacultyedit")
	public ModelAndView adminfacultyeditController(@RequestParam("faculty_id")int faculty_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		NnaFaculty faculty=facultyservice.getSingleFaculty(faculty_id);
		String facultyimgtoedit=faculty.getFaculty_image();
		ModelAndView mv = new ModelAndView();
		mv.addObject("facultyimgtoedit", facultyimgtoedit);
		mv.addObject("adeditfaculty", faculty);
		mv.setViewName("adminfacultyedit");
		return mv;
		
	}
	
	@RequestMapping(value="/saveadmineditfaculty")
	public String saveadmineditfacultyController(@RequestParam("facultyimgtoedit")String facultyimgtoedit ,@ModelAttribute("adeditfaculty")NnaFaculty faculty)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		System.out.println("imgtoedit is  " +facultyimgtoedit);
		MultipartFile file = faculty.getFacultyfile();
		System.out.println(""+file.getSize());
		System.out.println(file.getOriginalFilename());
		if(file.getSize()==0)
		{
			System.out.println("image is not choose method");
			faculty.setFaculty_image(facultyimgtoedit);
			facultyservice.saveFaculty(faculty);
			
		}
		else if(file.getSize()>0)
		{
			System.out.println("image choose method");
			String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"faculty"+ File.separator;
			File delfile=new File(uploadPath,facultyimgtoedit);
			delfile.delete();
			String fileName = file.getOriginalFilename();  
			  System.out.println("filename is " +fileName);
			  faculty.setFaculty_image(fileName);
			  String relativepath = "images/faculty/"+fileName;
			   System.out.println("uploadpath is" +uploadPath);
			   File targetFile = new File(uploadPath, fileName);  
			  try {
				file.transferTo(targetFile);
				System.out.println("transfer starts");
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			  			 
		}
		facultyservice.saveFaculty(faculty);
	return "redirect:/adminfaculty.html";
	}
	
	
	
	
	
	
	@RequestMapping(value="/adminadds")
	public ModelAndView adminaddsController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		NnaAds ads= new NnaAds();
		List list = adsservice.getAdminads();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminads", ads);
		mv.addObject("adminadslist", list);
		mv.setViewName("adminads");
		return mv;
	}
	
	@RequestMapping(value="/addeleteads")
	public String addeleteadsController(@RequestParam("ads_id")int ads_id,@RequestParam("ads_image")String ads_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		
		System.out.println("in controller");
		
		
		
		
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"ads"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,ads_image);
		file.delete();
		adsservice.deleteAdminads(ads_id);
		return "redirect:/adminadds.html";
	}
	
	@RequestMapping(value="/saveadminads")
	public String saveadminadsController(@ModelAttribute("adminads")NnaAds ads)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		MultipartFile file=ads.getAdsfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		 ads.setAds_image(fileName);
		  String relativepath = "images/ads/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"ads"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  adsservice.saveAdminads(ads);
		return "redirect:/adminadds.html";
	}
	
	@RequestMapping(value="/adminourteam")
	public ModelAndView adminourteamController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		List list = teamservice.getAdminTeamlist();
		NnaTeam team= new NnaTeam();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminteam", team);
		mv.addObject("adminteamlist", list);
		mv.setViewName("adminourteam");
		return mv;
	}
	
	
	
	@RequestMapping(value="/addeleteteam")
	public String addeleteteamController(@RequestParam("team_id")int team_id,@RequestParam("member_image")String member_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		
		System.out.println("in controller");
		
		
		
		
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"team"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,member_image);
		file.delete();
		teamservice.deleteteam(team_id);
		return "redirect:/adminourteam.html";
	}
	
	
	@RequestMapping(value="/saveadminteam")
	public String saveadminteamController(@ModelAttribute("adminteam")NnaTeam team)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		MultipartFile file=team.getTeamfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		 team.setMember_image(fileName);
		  String relativepath = "images/team/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"team"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  teamservice.saveTeam(team);
		return "redirect:/adminourteam.html";
	}
	
	@RequestMapping(value="/adminteamedit")
	public ModelAndView adminteameditController(@RequestParam("team_id")int team_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		NnaTeam team = teamservice.getSingleteam(team_id);
		String teamimgtoedit=team.getMember_image();
		ModelAndView mv = new ModelAndView();
		mv.addObject("teamimgtoedit", teamimgtoedit);
		mv.addObject("adeditteam", team);
		mv.setViewName("adminourteamedit");
		return mv;
		
	}
	@RequestMapping(value="/saveadmineditteam")
	public String saveadmineditteamController(@RequestParam("teamimgtoedit")String teamimgtoedit ,@ModelAttribute("adeditteam")NnaTeam team)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		System.out.println("imgtoedit is  " +teamimgtoedit);
		MultipartFile file = team.getTeamfile();
		System.out.println(""+file.getSize());
		System.out.println(file.getOriginalFilename());
		if(file.getSize()==0)
		{
			System.out.println("image is not choose method");
			team.setMember_image(teamimgtoedit);
			teamservice.saveTeam(team);
		}
		else if(file.getSize()>0)
		{
			System.out.println("image choose method");
			String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"team"+ File.separator;
			File delfile=new File(uploadPath,teamimgtoedit);
			delfile.delete();
			String fileName = file.getOriginalFilename();  
			  System.out.println("filename is " +fileName);
			  team.setMember_image(fileName);
			  String relativepath = "images/team/"+fileName;
			   System.out.println("uploadpath is" +uploadPath);
			   File targetFile = new File(uploadPath, fileName);  
			  try {
				file.transferTo(targetFile);
				System.out.println("transfer starts");
			} catch (IllegalStateException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			  			 
		}
		teamservice.saveTeam(team);
	return "redirect:/adminourteam.html";
	}
	
	
	@RequestMapping(value="/admingallery")
	public ModelAndView admingalleryController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		
		List list = galleryservice.getAdmingallery();
		NnaGallery gallery = new NnaGallery();
		ModelAndView mv = new ModelAndView();
		mv.addObject("admingallery", gallery);
		mv.addObject("adgallerylist", list);
		mv.setViewName("admingallery");
		return mv;
	}
	@RequestMapping(value="/deleteadmingal")
	public String admingalleryController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_image")String gallery_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		galleryservice.deleteadmingallery(gallery_id);
		String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"gallery"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,gallery_image);
		file.delete();
		return "redirect:/admingallery.html";
	}
	
	@RequestMapping(value="/saveadmingallery")
	public String saveadmingalleryController(@ModelAttribute("admingallery")NnaGallery gallery)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		MultipartFile file=gallery.getGalleryfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		 gallery.setGallery_image(fileName);
		  String relativepath = "images/gallery/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"gallery"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  galleryservice.saveAdmingallery(gallery);
		return "redirect:/admingallery.html";
	}
	
	@RequestMapping(value="/adminaudition")
	public ModelAndView adminauditionController()
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		List list = auditionservice.getadminauditions();
		ModelAndView mv= new ModelAndView();
		NnaAuditions audition =new NnaAuditions();
		mv.addObject("adminauditionlist", list);
		mv.addObject("adminaudition", audition);
		mv.setViewName("adminaudition");
		return mv;
	}
	
	@RequestMapping(value="/deleteadminaudition")
	public String deleteadminauditionController(@RequestParam("audition_id")int audition_id,@RequestParam("audition_image")String audition_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		auditionservice.deleteAdminaudition(audition_id);
		String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"auditions"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File file= new File(uploadPath,audition_image);
		file.delete();
		return "redirect:/adminaudition.html";
	}
	
	@RequestMapping(value="/saveadminaudition")
	public String saveadminauditionController(@ModelAttribute("adminaudition")NnaAuditions audition)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		MultipartFile file=audition.getAuditionsfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		 audition.setAuditions_image(fileName);
		  String relativepath = "images/gallery/"+fileName;
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"auditions"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  auditionservice.saveAdminaudition(audition);
		return "redirect:/adminaudition.html";
	}
	
	@RequestMapping(value="/adminfeedback")
	public ModelAndView adminfeedbackController()
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		List list = feedbackservice.getAdminfeedbcak();
		NnaFeedback feedback= new NnaFeedback();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminfeedback", feedback);
		mv.addObject("adminfeedlist", list);
		
		mv.setViewName("adminfeedback");
		return mv;
	}
	
	@RequestMapping(value="/admindeletefeed")
	public String admindeletefeedController(@RequestParam("feed_id")int feed_id)
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin.html";
		}
		
		feedbackservice.deleteadminfeed(feed_id);
		return "redirect:/adminfeedback.html";
	}
	

	@RequestMapping(value="/adminadmission")
	public ModelAndView adminadmissionController()
	{
		
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		List list= admissionservice.getAdmissionForm();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adadmissionlist", list);
		mv.setViewName("adminadmission");
		return mv;
	}
	@RequestMapping(value="/admineditapplication")
	public ModelAndView admineditapplicationController(@RequestParam("admission_id")int admission_id,@RequestParam("admission_image")String admission_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		
		ModelAndView mv=new ModelAndView();
		NnaAdmission admission = admissionservice.getAdmission(admission_id);
		mv.addObject("formingtoedit", admission_image);
		mv.addObject("adminformedit", admission);
		mv.setViewName("adminadmissionedit");
		return mv;
		
		
	}
	
	
	@RequestMapping(value="/saveadminformedit")
	public String saveadminformeditController(@RequestParam("formingtodelete")String formingtodelete,@ModelAttribute("adminformedit")NnaAdmission admission)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin.html";
		}
		String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"admission"+ File.separator;
		System.out.println("ads image path " +uploadPath);
		File delfile= new File(uploadPath,formingtodelete);
		delfile.delete();
		MultipartFile file=admission.getAdmissionfile();
		String fileName=file.getOriginalFilename();
		  System.out.println("filename is " +fileName);
		  admission.setAdmission_image(fileName);
		  String relativepath = "images/admission/"+fileName;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  admissionservice.saveAdmissionForm(admission);
		  
		
		return "redirect:/adminadmission.html";
	}
	
	
	@RequestMapping(value="/adminAdd")
	public ModelAndView adminAddController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		List list = adminprofileservice.getAdminprofile();
		ModelAndView mv= new ModelAndView();
		NnaAdminregistration admin= new NnaAdminregistration();
		mv.addObject("adminprolist", list);
		mv.addObject("addadmin", admin);
		mv.setViewName("adminAdd");
		return mv;
	}
	
	@RequestMapping(value="/adminprofileedit")
	public ModelAndView adminprofileeditController(@RequestParam("admin_id")int admin_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		NnaAdminregistration admin=adminprofileservice.getsingleadmin(admin_id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminprofiletoedit", admin);
		mv.setViewName("adminAddedit");
		return mv;
	}
	
	@RequestMapping(value="/adminsaveedprofile")
	public String adminsaveedprofileController(@ModelAttribute("adminprofiletoedit")NnaAdminregistration admin)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin.html";
		}
		adminprofileservice.saveadmin(admin);
		return "redirect:/adminAdd.html";
		
		
	}
	
	@RequestMapping(value="/adminprofilesave")
	public String adminprofilesaveController(@ModelAttribute("addadmin")NnaAdminregistration admin)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin.html";
		}
		adminprofileservice.saveadmin(admin);
		return "redirect:/adminAdd.html";
		
		
	}
	
	@RequestMapping(value="/admindelprofile")
	public String admindelprofileController(@RequestParam("admin_id")int admin_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin.html";
		}
		adminprofileservice.deletesingleadmin(admin_id);
		return "redirect:/adminAdd.html";
		
		
	}
	
	@RequestMapping(value="/adminprofile")
	public ModelAndView adminprofileController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		String user = sessionn.getAttribute("activeuser").toString();
		String pass = sessionn.getAttribute("activpass").toString();
		List list = adminprofileservice.getAdminDetails(user, pass);
		ModelAndView mv = new ModelAndView();
		mv.addObject("acadminprolist", list);
		mv.setViewName("adminprofile");
		return mv;
	}
	
	
	@RequestMapping(value="/index")
	public ModelAndView indexController()
	{
		List list = userservice.getBannerlist();
		List teamlist= userteamservice.getUserTeamlist();
		ModelAndView mv = new ModelAndView();
		mv.addObject("userteamlist", teamlist);
		mv.addObject("userbannerlist", list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/about-us")
	public ModelAndView aboutusController()
	{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("about-us");
		return mv;
	}
	
	@RequestMapping(value="/courses")
	public ModelAndView coursesController()
	{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("courses");
		return mv;
	}
	
	
	@RequestMapping(value="/placement")
	public ModelAndView placementController()
	{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("placement");
		return mv;
	}
	
	@RequestMapping(value="/auditions")
	public ModelAndView auditionsController()
	{
		List list=useraudservice.getauditionsList();

		ModelAndView mv = new ModelAndView();
		mv.addObject("useraudlist", list);
		mv.setViewName("auditions");
		return mv;
	}
	
	

	@RequestMapping(value="/admission")
	public ModelAndView admissionController()
	{
		List list = useradmissionservice.getAdmissionForm();
		ModelAndView mv = new ModelAndView();
		mv.addObject("useradmissionlist", list);
		mv.setViewName("admission");
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contactController()
	{
		NnaFeedback feed= new NnaFeedback();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("userfeed", feed);
		mv.setViewName("contact");
		return mv;
	}
	
	@RequestMapping(value="/faculty")
	public ModelAndView facultyController()
	{
		List list = userfacultyservice.getFacultyList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("userfacultylist", list);
		mv.setViewName("faculty");
		return mv;
	}
	
	@RequestMapping(value="/gallery")
	public ModelAndView galleryController()
	{
		List list=usergalservice.getgalleryList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("usergallerylist", list);
		mv.setViewName("gallery");
		return mv;
	}
	
	
	@RequestMapping(value="/sendfeedback")
	public ModelAndView sendfeedbackController(@ModelAttribute("userfeed")NnaFeedback feed)
	{
		userfeedservice.savefeedback(feed);
		Emailutility.send("stepperzstudio1234@gmail.com", "FeedBack","New Feedback is come from the person whose name is "+feed.getFeed_name()+"\n" +"and his/her email is "+feed.getFeed_email()+"\n"+"and his/her Feedback subject is" +feed.getFeed_subject() +"\n" +" and his/her Feed back message is  "+feed.getFeed_msg()+"");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("indexpopup");
		return mv;
	}
	

	
	
}




