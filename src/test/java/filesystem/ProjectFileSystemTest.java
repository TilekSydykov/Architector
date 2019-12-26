package filesystem;

import database.models.Author;
import database.models.BookCharacter;
import database.models.Chapter;
import filesystem.models.Project;
import org.junit.Test;

import java.util.ArrayList;

public class ProjectFileSystemTest {

    @Test
    public void setProjectNameTest() {
        ProjectFileSystem p = new ProjectFileSystem();
        p.setProjectName("hello");
    }

    @Test
    public void initNewProjectFile() { }

    @Test
    public void saveProject() {
        ProjectFileSystem pfs = new ProjectFileSystem();
        Project p = new Project();
        ArrayList<Author> a = new ArrayList<>();
        ArrayList<Chapter> ch = new ArrayList<>();
        ArrayList<BookCharacter> characters = new ArrayList<>();
        p.setName("hello");
        p.setType("novel");
        p.setFileName("hello");
        p.setBookDescription("boookDesc");
        p.setBookIntro("cool intro");
        p.setWorldDescription("cool world");

        a.add(new Author("tilek", "hell@mail.ru"));
        p.setAuthors(a);

        ch.add(new Chapter("dfa", "fdqa"));
        p.setChapters(ch);

        characters.add(new BookCharacter("name", "his", "fdqwf"));
        p.setCharacters(characters);

        pfs.saveProject(p);
    }

    @Test
    public void readProject() {
        ProjectFileSystem pfs = new ProjectFileSystem();
        System.out.println(pfs.readProject("hello").toString());
    }

    @Test
    public void listProjects() {
    }

    @Test
    public void updateChapters( ) {
        ProjectFileSystem pfs = new ProjectFileSystem();
        pfs.setProjectName("hello");

        Chapter c = new Chapter();
        c.setBody("body");
        c.setId(1613845581);
        c.setTitle("name");

        pfs.updateChapter(c);
    }

    @Test
    public void saveAuthor(){
        ProjectFileSystem pfs = new ProjectFileSystem();
        pfs.setProjectName("hello");
        Author a = new Author();
        a.setEmail("fvsjhdcrffe");
        a.setName("fwafew");
        a.setId(-411083607);
        pfs.saveAuthor(a);
    }
}