
package run;
import data.*;

public class ManagingProgram1 {
    public static void main(String[] args){
        int choice;
        Menu menu = new Menu(5);//khai bao size cho menu
        menu.add("Add new person"); //add hints 
        menu.add("Remove a person");
        menu.add("Update a person");
        menu.add("List");
        menu.add("Quit");
        PersonList list = new PersonList(50); // khai bao size cho list person
        do{
            System.out.println("\nPERSON MANAGER");
            choice=menu.getChoice();
            switch(choice){
                case 1: list.add(); break;
                case 2: list.remove(); break;
                case 3: list.update(); break;
                case 4: list.sort();list.print(); break;
              
            }
        }while(choice>=1 && choice <5);
    }
}
