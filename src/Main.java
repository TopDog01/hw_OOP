import model.FamilyTree;
import model.FamilyTreeOperations;
import model.Person;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");

        FamilyTreeOperations<Person> familyTree = new FamilyTree<>();
        PersonFactory personFactory = new PersonFactory();
        FamilyTreeService service = new FamilyTreeService(familyTree, personFactory);
        FamilyTreeView view = new ConsoleFamilyTreeView();
        FileOperaions fileOps = new FileOperations();
        FamilyTreeFileManager fileManager = new FamilyTreeFileManager(fileOps);

        FamilyTreePresenter presenter = new FamilyTreePresenter(service, view, fileManager);

        presenter.run();
     }
    }
