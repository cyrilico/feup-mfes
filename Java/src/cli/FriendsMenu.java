package cli;

import java.util.ArrayList;

class FriendsMenu extends AbstractMenu {

    private MainMenu mainMenu;

    FriendsMenu(boolean hasParent, MainMenu mainMenu) {
        super(hasParent);
        this.mainMenu = mainMenu;
    }

    @Override
    void getOptions() {
        printDivision("Friends Menu");

        ArrayList<String> options = new ArrayList<>();
        options.add("Search Users");
        options.add("List Friends");
        options.add("List Blocked Users");

        String input = printAndSelectOptions(options);
        switch (input) {
            case "Search Users":
                break;
            case "List Friends":
                break;
            case "List Blocked Users":
                break;
            case BACK_INPUT:
                return;
            case MENU_INPUT:
                mainMenu.getOptions();
                break;
        }
    }
}