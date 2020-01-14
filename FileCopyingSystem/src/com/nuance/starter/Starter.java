package com.nuance.starter;

import java.io.IOException;
import java.util.List;

import com.nuance.FileCopier.DirectoryGenerator;
import com.nuance.FileCopier.DirectoryPathGenerator;
import com.nuance.FileCopier.FileCopier;
import com.nuance.FileCopier.FilePathGenerator;

public class Starter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> genpath;
FilePathGenerator gen=new FilePathGenerator();
DirectoryPathGenerator dirgen=new DirectoryPathGenerator();
List<String> result=dirgen.PathGen("C:/logs/callLogs/");
DirectoryGenerator folder=new DirectoryGenerator();
folder.DirGen(result);
genpath=gen.PathGen("C:\\logs\\callLogs");
FileCopier copy=new FileCopier();
copy.FileCopy(genpath);
	}

}
