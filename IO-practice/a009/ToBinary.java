package a009;

public class ToBinary
{
    
    /** 
     * 中文转换为二进制
     * @param args
     */
    public static void main(String[] args)
    {
        String str = "转换为二进制";
        byte[] b = str.getBytes();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(Integer.toBinaryString(b[i]&0xff));
        } 
        
    }
    
}
