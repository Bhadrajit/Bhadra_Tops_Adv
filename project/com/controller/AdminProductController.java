package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.AdminProductDao;

//import org.apache.tomcat.jni.File;

import com.model.ProductModel;


@WebServlet("/AdminProductController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512,// 512 MB
maxFileSize = 1024 * 1024 * 512,// 512 MB
maxRequestSize = 1024 * 1024 * 512  )// 512 MB
public class AdminProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String extractfilename(Part file)
    {
    	String cd=file.getHeader("content-disposition");
    	String[] items=cd.split(";");
    	for(String string:items)
    	{
    		if(string.trim().startsWith("filename"))
    		{
    			return string.substring(string.indexOf("=")+2,string.length()-1);
    		}
    	}
    	return "";
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductModel pm=new ProductModel();
		pm.setPname(request.getParameter("pname"));
		
		String savePath="/Users/admin/eclipse-workspace/MiniProject_ecommerce/src/main/webapp/productimage";
		File fileSaveDir=new File(savePath);
		if(!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
		}
		Part file=request.getPart("image");
		String fileName=extractfilename(file);
		file.write(savePath+File.separator+fileName);
		String filePath=savePath+File.separator+fileName;
		pm.setImage(fileName);
		
		int x=new AdminProductDao().addProduct(pm);
		if(x>0)
		{
			response.sendRedirect("admin/dashboard.jsp");
		}
		else
		{
			response.sendRedirect("admin/addproduct.jsp");
		}
		
	}

}
