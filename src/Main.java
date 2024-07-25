import presenter.Presenter;
import service.UserService;
import service.WODService;
import service.ResultService;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        WODService wodService = new WODService();
        ResultService resultService = new ResultService();

        Presenter presenter = new Presenter(userService, wodService, resultService);
        ConsoleView view = new ConsoleView(presenter);

        view.start();
    }
}
