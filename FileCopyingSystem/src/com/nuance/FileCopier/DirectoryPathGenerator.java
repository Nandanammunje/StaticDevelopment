package com.nuance.FileCopier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nuance.constants.BackendConstants;

public class DirectoryPathGenerator {

	public List<String> PathGen(String path)
	{
List<String> result=null;
		
		try (Stream<Path> walk = Files.walk(Paths.get(path))) {

			 result =walk.filter(Files::isDirectory).map(x -> x.toString())
					.filter(f -> !f.endsWith(BackendConstants.EXTEXCLUDED)).collect(Collectors.toList());

			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return result;
		
		
		
	}
	
	
}
