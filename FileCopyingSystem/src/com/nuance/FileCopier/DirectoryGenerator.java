package com.nuance.FileCopier;

import java.io.File;
import java.util.List;

import com.nuance.constants.BackendConstants;

public class DirectoryGenerator {

	public void DirGen(List<String> path)
	{
		SortbyLength sort=new SortbyLength();
		path.sort(sort);
		for(String s:path)
		{
			int index=s.indexOf("\\");
			String dir=BackendConstants.FILESOURCE+s.substring(index+1,s.length());
			File directory=new File(dir);
			if(!directory.exists())
			{
				directory.mkdirs();
			}
			
		}
		
		
		
		
	}
	
	
}
