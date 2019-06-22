/*Copyright ©  2018 Lyons. All rights reserved. */
package imp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bilibili.Bilibili;

/**
 * @Description: TODO
 * @ClassName: BilibiliImp
 * @author: lyons<zhanglei>
 * @date: 2018年1月26日 下午7:41:13
 * @version: [1.0]
 */
public class BilibiliImp implements Bilibili
{
    
    @Override
    public List<String> Read(String dir) throws IOException
    {
        List<String> list = new ArrayList<String>();
        
//      1.打开本地源文件
        BufferedReader source = new BufferedReader(new FileReader(dir));
//      2.数据匹配
        String regex = "start.*?end";
        Pattern p = Pattern.compile(regex);
        
        String line = null;
        while ( (line=source.readLine())!=null ) //打开的源文件数据每行有信息就进行匹配
        {
            Matcher m = p.matcher(line);
            while (m.find())
            {
                String string = m.group().replaceAll("start", " ").replace("end", " ");
                //讲规则的数据都存储到集合中
                list.add(string.trim());
            }
        }
        
        source.close();
        return list;
    }

    @Override
    public boolean Rename(String dir,List<String> newName) throws IOException
    {
        /*
         * 把NewName放到数组里
         */
        int j = 0;
        String[] newNames = new String[newName.size()];
        for (String string : newName)
        {
            newNames[j++] = string;
        }
        
        
        File file1 = new File(dir);
        File[] list = file1.listFiles();
        
        File newFile = null;
        
        //不要忘记数组是从0开始的
        int i = 0,count=1;
        for (File file : list)
        {
                System.out.println(newNames[i]);
                file.renameTo(new File((dir+"//("+count+")"+newNames[i]+".flv").trim()));
            i++;
            count++;
            
        }
        return true;
        
    }

    @Override
    public boolean PrintNullFile(String dir)
    {
        File file1 = new File(dir);
        File[] list = file1.listFiles();
        
        for (File file : list)
        {
            if (file.length() == 0)
            {
                System.out.println(file.getName());
            }
        }
        
        return true;
        
    }

    /* (non Javadoc)
     * @Title: Rename
     * @Description: TODO
     * @param dir
     * @return
     * @throws IOException
     * @see bilibili.Bilibili#Rename(java.lang.String)
     */
    @Override
    public boolean Rename(String dir,int start)
        throws IOException
    {
        File file = new File(dir);
        File[] list = file.listFiles();
        
        File newName;
        try
        {
            for (File file2 : list)
            {
                newName = new File((dir+"//"+start+".flv").trim());
                start++;
                file2.renameTo(newName);
            }
            
            return true;
            
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        
        return false;
    }

    
}
