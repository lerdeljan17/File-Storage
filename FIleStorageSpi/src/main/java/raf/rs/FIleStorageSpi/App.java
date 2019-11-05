package raf.rs.FIleStorageSpi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Laco!?" );
        List<File> files = new ArrayList<File>();
		files.add(new File("C:\\Users\\laxy9\\Desktop\\root\\root.settings"));
		files.add(new File("C:\\Users\\laxy9\\Desktop\\root\\kok"));
		files.add(new File("C:\\Users\\laxy9\\Desktop\\root\\metaFile.txt"));
		files.add(new File("C:\\Users\\laxy9\\Desktop\\root\\Proba3.txt"));
		files.add(new File("C:\\Users\\laxy9\\Desktop\\root\\silvija13"));
		try {
			//file.uploadFilesAsArchive("try", "C:\\Users\\subot\\Desktop", files);
			 Archive.uploadFilesAsArchive("try", "C:\\Users\\laxy9\\Desktop", files);
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
}
