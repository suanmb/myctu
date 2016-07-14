package MyctuExam;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
class Test  extends Thread{
	public static void main(String args[])
    {
        int i = 0, j = 5;
        st:for( ; ; i++)   //line4
        {
            for( ; ; j--)
            {
                if(i > j)
                {
                    break st;
                }
            }
        }
        System.out.println("i = " +i + "j = " +j);
    }
}

