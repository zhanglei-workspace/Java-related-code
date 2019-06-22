/*Copyright ©  2017 Lyons. All rights reserved. */
package shiyanlou.string;

/**
 * @Description: TODO
 * 
 * Write a method anagram(s,t) to decide if two strings are anagrams or not.
 * 
 * Example
 * Given s="abcd", t="dcab", return true.
 */
public class S002
{
    public static boolean anagram(String source, String target)
    {
        //省略判断为空的情�?
        
        String str[] = source.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length; i > 0; i--)
        {
            sb.append(str[i-1]);
        }
        
        return sb.toString().equals(target);
    }

}
