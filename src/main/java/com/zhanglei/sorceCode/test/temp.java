/*Copyright ©  2018 Lyons. All rights reserved. */
package test;

import java.io.File;

/**
 * @Description: TODO
 * @ClassName: temp
 * @author: lyons<zhanglei>
 * @date: 2018年3月22日 上午10:29:36
 * @version: [1.0]
 */
public class temp
{
    public static void main(String[] args)
    {
        printerName("E:\\软件搬家 来自c盘\\Desktop\\新建文件夹");
    }
    
    public static void printerName(String dir)
    {
        File file1 = new File(dir);
        File[] list = file1.listFiles();
        int num = -1;
        for (File file : list)
        {
            
                System.out.println(str(file.getName(),++num));
        }
    }
    
    public static String  str(String name,int num)
    {
        return "<div class=\"grid\"><div class=\"imgholder\"><div class=\"Dcolor\">"+name.substring(0, 4)+"</div>"
                        +"<img class=\"lazy thumb_photo\" title=\""+num+"\" src=\"../style/img/common/pixel.gif\" data-original=\"../style/img/me/"+name+"\" width=\"225\" />"
                        +"</div></div>";
        
    }
    
    public static String str2(String name)
    {
      return  "<img class=\"img\" src=\"../style/img/me/"+name+"\">";
    }
    
}
