/*Copyright ©  2018 Lyons. All rights reserved. */
package temp;

/**
 * @Description: TODO
 * @ClassName: Aclass
 * @author: lyons<zhanglei>
 * @date: 2018年1月31日 下午4:17:54
 * @version: [1.0]
 */
public class Aclass implements AInterface
{
    
    public static void main(String[] args)
    {
        String string = "https://www.bilibili.com/video/av6749471/?from=search&seid=691637846006417271#page=";
        int j=0;
        for (int i = 226; i <= 253; i++)
        {
            System.out.println(string+i);
            j++;
            if (j == 20)
            {
                break;
            }
        }
        System.out.println(j);
    }
    
    
    @Override
    public void aInter()
    {
        // TODO Auto-generated method stub
        
    }
    
}
