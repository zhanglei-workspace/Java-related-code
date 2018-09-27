/*Copyright ©  2017 Lyons. All rights reserved. */
package shiyanlou.string;

/**
 * @Description: TODO
 *Given an array of strings, return all groups of strings that are anagrams.
    Example
    Given ["lint", "intl", "inlt", "code"], return ["lint", "inlt", "intl"].
    Given ["ab", "ba", "cd", "dc", "e"], return ["ab", "ba", "cd", "dc"].
 */
public class S003
{
    public static String[] anagrams(String[] str)
    {
        for (int i = 0; i < str.length; i++)
        {
            
        }
    }
    
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
    /**
     * @Title: main
     * @Description: TODO
     * @param args
     * @return: void
     */
    public static void main(String[] args)
    {
        
    }
    
}
