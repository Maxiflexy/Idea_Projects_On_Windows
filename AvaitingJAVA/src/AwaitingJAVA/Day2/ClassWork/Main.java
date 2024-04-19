package AwaitingJAVA.Day2.ClassWork;

public class Main {
    public static void main(String[] args) {
        Liberians nikole = new Liberians();
        nikole.setName("Nikole");
        Borrowers max = new Borrowers();
        max.setName("Maxi");
        Cleaners kiki = new Cleaners();
        kiki.setName("Kiki");

        Library library= new Library();


        Borrowers deltaStateBorrower = new Borrowers();
        deltaStateBorrower.setStateOfOrigin("Delta State");
        deltaStateBorrower.setNumberOfBooksCollected(2);
        deltaStateBorrower.setIsEligible(true);
        deltaStateBorrower.setIsAStudent(true);

        Department deltaStateLibraryHistoryDept = new Department();
        deltaStateLibraryHistoryDept.setBorrowersA(deltaStateBorrower);
        System.out.println(deltaStateLibraryHistoryDept);

        Library deltaStateBranch = new Library();
        deltaStateBranch.setDepartmentA(deltaStateLibraryHistoryDept);
        //System.out.println(library);

//        deltaStateBranch.setBorrowersA(deltaStateBorrower);
//        Library lagosStateBranch = new Library();
//
//
//        library.setLiberiansA(nikole);
//        library.setBorrowersA(max);
//        library.setCleanersA(kiki);
//
//        System.out.println(library);
//        System.out.println(library.getBorrowersA().getName());





    }
}

//        Person maro = new Liberians();