/*Copyright ©  2018 Lyons. All rights reserved. */
package bilibili;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @Description: TODO
 * @ClassName: ReadText
 * @author: lyons<zhanglei>
 * @date: 2018年1月26日 下午7:28:16
 * @version: [1.0]
 */
public interface Bilibili
{
    /** 读取文件，将其截取的名字放在数组中并返回
     * @throws FileNotFoundException */
    public List<String> Read(String dir) throws IOException;
    
    /** 根据实际重命名文件 
     * @return */
    public boolean Rename(String dir, List<String> newName)
        throws IOException;
    
    /** 读取后，重命名文件第一个为文件名为start  第二个为start++*/
    public boolean Rename(String dir,int start)
        throws IOException;
    
    
    public boolean PrintNullFile(String dir);

}
