import model.FamilyTree;
import model.FamilyTreeOperations;
import model.Person;
import presenter.FamilyTreePresenter;
import service.FamilyTreeFileManager;
import service.FamilyTreeService;
import service.FileOperations;
import service.PersonFactory;
import view.ConsoleFamilyTreeView;
import view.FamilyTreeView;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");

        FamilyTreeOperations<Person> familyTree = new FamilyTree<>();
        PersonFactory personFactory = new PersonFactory();
        FamilyTreeService service = new FamilyTreeService(familyTree, personFactory);
        FamilyTreeView view = new ConsoleFamilyTreeView();
        FileOperations fileOps = new FileOperations();
        FamilyTreeFileManager fileManager = new FamilyTreeFileManager(fileOps);

        FamilyTreePresenter presenter = new FamilyTreePresenter(service, view, fileManager);

        presenter.run();
     }
    }
