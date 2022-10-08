package task_13;

import books.ProgrammerBook;

public class Main {
    public static void main(String[] args){
        ProgrammerBook.setEdition(1);
        ProgrammerBook programmerBook1 = new ProgrammerBook(
                "TITLE",
                "AUTHOR",
                15,
                "978-3-16-148410-2",
                "Java",
                1);
        ProgrammerBook programmerBook2 = new ProgrammerBook(
                "TITLE",
                "AUTHOR",
                15,
                "978-3-16-148410-2",
                "Java",
                1);
        ProgrammerBook programmerBook3 = new ProgrammerBook(
                "title",
                "author",
                10,
                "978-3-16-148410-1",
                "Java",
                2);

        if (programmerBook1.equals(programmerBook2)) {
            System.out.println("programmerBook1 == programmerBook2");
        } else{
            System.out.println("programmerBook1 != programmerBook2");
        }
        if (programmerBook3.equals(programmerBook2)) {
            System.out.println("programmerBook3 == programmerBook2");
        } else{
            System.out.println("programmerBook3 != programmerBook2");
        }
        System.out.println(programmerBook1.toString());
        System.out.println(programmerBook2.toString());
        System.out.println(programmerBook3.toString());

        System.out.println(programmerBook1.hashCode());
        System.out.println(programmerBook2.hashCode());
        System.out.println(programmerBook3.hashCode());
    }
}