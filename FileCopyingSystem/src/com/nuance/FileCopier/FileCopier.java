package com.nuance.FileCopier;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.nuance.constants.BackendConstants;

public class FileCopier {


	public void FileCopy(List<String> pathlist) throws IOException
	{
		for(String s:pathlist)
		{
			//System.out.println(s);
			int index=s.indexOf("\\");
			String destpath=BackendConstants.FILESOURCE+s.substring(index+1,s.length());
			System.out.println(destpath);
			File src=new File(s);
			File dest=new File(destpath);
			Files.copy(src.toPath(),dest.toPath());
		}
		
		
	}
	
}
