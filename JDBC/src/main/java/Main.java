public class Main {
    public static void main(String[] args) {
        CreateAndFillTable createAndFillTable = new CreateAndFillTable();
        Queries queries = new Queries();
//        createAndFillTable.fillTables();
        queries.taskOne("Div1");
        System.out.println();
        queries.taskTwo("Div1");
        System.out.println();
        queries.taskThree("Шарапов");
        System.out.println();
        queries.taskFour("Анатолий", "Мащенко", "Захарович"); //начальник
        System.out.println();
        queries.taskFour("Георгий", "Устинов", "Иосифович"); //сотрудник
    }
}
