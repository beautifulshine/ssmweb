package com.li.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
                log.debug("Process file: {}", file.getOriginalFilename());  
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("d:\\temp\\imooc\\",   
                        System.currentTimeMillis()+ file.getOriginalFilename()));  
            }  

        }  
        return "success";  
    }  
    
    
}
