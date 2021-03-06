package com.li.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/fileController")
public class FileController {
	/** 定位到上传单个文件界面 /hello/upload   **/
    @RequestMapping(value="/upload", method=RequestMethod.GET)  
    public String showUploadPage(){   
        return "uploadFile";         //view文件夹下的上传单个文件的页面  
    }  
    
    /** 
     * 上传单个文件操作 
     * @param RequestParam 括号中的参数名file和表单的input节点的name属性值一致 
     * @return 
     */  
    @RequestMapping(value="/doUpload", method=RequestMethod.POST)  
    public String doUploadFile(@RequestParam("file") MultipartFile file){  
        if(!file.isEmpty()){  
            try {  
                //这里将上传得到的文件保存至 d:\\temp\\file 目录  
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("d:\\temp\\file\\",   
                        System.currentTimeMillis()+ file.getOriginalFilename()));  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        return "success";  //上传成功则跳转至此success.jsp页面  
    }  
    
    /** 定位到上传多个文件界面 /hello/uploadMulti**/   
    @RequestMapping(value="/uploadMulti", method=RequestMethod.GET)  
    public String showUploadPage2(){      
        return "uploadMultifile";        //view文件夹下的上传多个文件的页面  
    }  
    
    /** 
     * 上传多个附件的操作类 
     * @param multiRequest 
     * @return 
     * @throws IOException 
     */
   @RequestMapping(value="/doMultiUpload", method=RequestMethod.POST)  
    public String doUploadFile2(MultipartHttpServletRequest multiRequest) throws IOException{  
      Iterator<String>  filesNames = multiRequest.getFileNames(); //获得所有的文件名  
      
        while(filesNames.hasNext()){    //迭代，对单个文件进行操作  
            String fileName =filesNames.next();  
            MultipartFile file =  multiRequest.getFile(fileName);  
            if(!file.isEmpty()){  
//                log.debug("Process file: {}", file.getOriginalFilename());  
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("d:\\temp\\imooc\\",   
                        System.currentTimeMillis()+ file.getOriginalFilename()));  
            }  

        }  
        return "success";  
    }  
   
   
   /*
    * 通过流的方式上传文件
    * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile 对象
    */
   @RequestMapping("fileUpload")
   public String  fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
       //用来检测程序运行时间
       long  startTime=System.currentTimeMillis();
       System.out.println("fileName："+file.getOriginalFilename());
        
       try {
           //获取输出流
           OutputStream os=new FileOutputStream("E:/"+new Date().getTime()+file.getOriginalFilename());
           //获取输入流 CommonsMultipartFile 中可以直接得到文件的流
           InputStream is=file.getInputStream();
           int temp;
           //一个一个字节的读取并写入
           while((temp=is.read())!=(-1))
           {
               os.write(temp);
           }
          os.flush();
          os.close();
          is.close();
        
       } catch (FileNotFoundException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       long  endTime=System.currentTimeMillis();
       System.out.println("方法一的运行时间："+String.valueOf(endTime-startTime)+"ms");
       return "/success"; 
   }
   
   /*
    * 采用file.Transto 来保存上传的文件
    */
   @RequestMapping("fileUpload2")
   public String  fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long  startTime=System.currentTimeMillis();
       System.out.println("fileName："+file.getOriginalFilename());
       String path="E:/"+new Date().getTime()+file.getOriginalFilename();
        
       File newFile=new File(path);
       //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
       file.transferTo(newFile);
       long  endTime=System.currentTimeMillis();
       System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");
       return "/success"; 
   }
   
   /*
    *采用spring提供的上传文件的方法
    */
   @RequestMapping("springUpload")
   public String  springUpload(HttpServletRequest request) throws IllegalStateException, IOException
   {
        long  startTime=System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
       CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
               request.getSession().getServletContext());
       //检查form中是否有enctype="multipart/form-data"
       if(multipartResolver.isMultipart(request))
       {
           //将request变成多部分request
           MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
          //获取multiRequest 中所有的文件名
           Iterator<String> iter=multiRequest.getFileNames();
            
           while(iter.hasNext())
           {
               //一次遍历所有文件
               MultipartFile file=multiRequest.getFile(iter.next().toString());
               if(file!=null)
               {
                   String path="E:/springUpload/"+file.getOriginalFilename();
                   //上传
                   file.transferTo(new File(path));
               }
                
           }
       }
       long  endTime=System.currentTimeMillis();
       System.out.println("方法三的运行时间："+String.valueOf(endTime-startTime)+"ms");
   return "/success"; 
   }
   
   
}
