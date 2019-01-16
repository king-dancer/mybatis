package com.spring.activiti.util;

import java.io.File;
import java.util.Properties;
import java.util.Vector;
 
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
 
public class Demo003 {
 
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        JSch jsch = new JSch();
        
        Session session = jsch.getSession("root", "193.112.214.43");
        session.setPassword("lumia830");
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        
        ChannelSftp channelSftp = (ChannelSftp)session.openChannel("sftp");
        channelSftp.connect();
//        channelSftp.setFilenameEncoding("utf-8");
        String localPath = "D://wls";
        String downPath = "/root/readme.txt";
        Vector vector  = channelSftp.ls(downPath);//
        try{
//            for(Object obj :vector){
//                if(obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry){
//                    String fileName = ((com.jcraft.jsch.ChannelSftp.LsEntry)obj).getFilename();
//                    System.out.println(fileName);
//                }
//            }
            if(vector == null){
                System.out.println("文件"+downPath+"不存在");
                throw new Exception();
            }
            File file = new File(localPath);
            if(!file.exists()){
                file.mkdir();
            }
            //downPath为ftp上要下载的文件,localPath为本地路径，未指定文件名则下载下来的文件名和ftp的一致
            channelSftp.get(downPath,localPath);
        }
        finally{
            channelSftp.quit();
            session.disconnect();
        }
    }
 
}  