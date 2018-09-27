/*Copyright ©  2017 Lyons. All rights reserved. */
package shiyanlou.string;

/**
 * @Description: 
 * 
 *  For a given source string and a target string,
 *  you should output the first index(from 0) of target string in source string.
 */
public class S001
{
    /**
     * 
     * @Title: strIndex
     * @Description: output the first index(from 0) of target string in source string.
     * @param source
     * @param target
     * @return: int（index�??
     */
    public static int strIndex(String source, String target)
    {
        if (source == null && target == null) return 0;
        if (source == null) return -1;
        if (target == null) return 0;
        
        int sourceLength = source.length(),
            targetLength = target.length();
        for (int i = 0; i < sourceLength - targetLength + 1; i++)
        {
            int j = 0;
            for (; j < targetLength; j++)
            {
                if (source.charAt(i+j) != target.charAt(j)) break;
            }
            
            if (j == targetLength) return i;
        }
        
        return -1;
    }

    
}
