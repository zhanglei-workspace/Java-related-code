/*Copyright ©  2018 Lyons. All rights reserved. */
package readtest;

import java.io.IOException;
import java.util.List;

import bilibili.Bilibili;
import imp.BilibiliImp;

/**
 * @Description: TODO
 * @ClassName: 
 * @author: lyons<zhanglei>
 * @date: 2018年1月26日 下午7:20:51
 * @version: [1.0]
 */
public class Read
{
/*        public static void main(String[] args) throws IOException
        {
          Bilibili oper = new BilibiliImp();
          List<String> list = oper.Read("F:\\1.txt");
          
                 int i = 0;
          for (String string : list)
        {
              i++;
            System.out.println(i+"  "+string.toString());
        }
          
//          System.out.println(oper.Rename("H:\\myzone\\研究生之路\\视频专区\\专业课\\数据库系统\\模型与语言（上）\\上\\合并\\5", list));
            
          
            for (int j = 1; j < 6; j++)
            {
                oper.PrintNullFile("H:\\myzone\\研究生之路\\视频专区\\专业课\\数据库系统\\模型与语言（上）\\上\\合并\\"+j);
            }
          
          
        }*/
        
        public static void main(String[] args) throws IOException
        {
            Bilibili oper = new BilibiliImp();
            List<String> list = oper.Read("F:\\spring.txt");
          
              int i = 0;
              for (String string : list)
            {
                  i++;
                System.out.println(i+"  "+string.toString());
            }
            
//            oper.PrintNullFile("H:\\myzone\\study\\spring\\spring");
              
            
//            System.out.println(oper.Rename("H:\\myzone\\study\\spring\\spring", list));
            
//            System.out.println(oper.Rename("H:\\myzone\\study\\spring\\spring1", 1));
            
            
        }
        
}
