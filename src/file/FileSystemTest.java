package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSystemTest {
	
	public static void main(String[] args) {

        ExecutableFile browser = new ExecutableFile(824000, "firefox.run", "Arch GNU/Linux", new byte[1]);

        System.out.println(browser);

        HTMLFile page1 = new HTMLFile("philosophy.html", 2000, "Unicode", 5, browser, null);
        HTMLFile page2 = new HTMLFile("gnu.html", 5000, "Unicode", 5, browser, null);
        HTMLFile page3 = new HTMLFile("freelicences.html", 4000, "Unicode", 5, browser, null);
        HTMLFile page4 = new HTMLFile("contact.html", 1000, "Unicode", 5, browser, null);

        List<HTMLFile> myPageLinks = new ArrayList<HTMLFile>();
        myPageLinks.add(page1);
        myPageLinks.add(page2);
        myPageLinks.add(page3);
        myPageLinks.add(page4);
        
        HTMLFile myWebpage = new HTMLFile("mypage.html", 9000, "Unicode", 5, browser, myPageLinks);

        PlainTextFile todos = new PlainTextFile("My To Do List", 3000, "ASCII", new String[]{"Feed the cats", "Clean cats toilet",
                "Eat", "Write code", "Drink beer", "Sleep"});

        ExecutableFile player = new ExecutableFile(160000, "vlc.run", "Debian GNU/Linux", new byte[1]);

        DataFile music = new DataFile(350000, "The Drones - Shark Fin Blues.flac", "flac", player, new boolean[1]);

        DataFile movie = new DataFile(1500000, "Pulp Fiction.1994.ETRG.x264.mkv", "mkv", player, new boolean[1]);


        movie.onClick();
        music.onClick();
        

    }

}
