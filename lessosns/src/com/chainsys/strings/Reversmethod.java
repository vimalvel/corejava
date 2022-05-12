package com.chainsys.strings;

import java.util.Scanner;

public class Reversmethod {
	public static void reverse()
    {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a sentence");
            String sentence="";
            String sentenceA="";
            try
            {
                    sentence=scanner.nextLine();
            }
            finally
            {
                    scanner.close();
            }
            char[] charSentence=sentence.toCharArray();
            for(int index=charSentence.length-1; index>=0; index-- )
            {
                    sentenceA=sentenceA+charSentence[index];
            }
            System.out.println(sentenceA);
    }

	}
