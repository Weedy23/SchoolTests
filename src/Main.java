import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, Student, write your Name and Age below");
        String NameAge = scan.nextLine();

        String[] NA = new String[2];
        NA = NameAge.split(" ");

        if (AgeCheck(Integer.parseInt(NA[1]))) {

            Student St = new Student(NA[0], Integer.parseInt(NA[1]));

            System.out.println("Which test would you like to write first?");
            for (int i = 4; i >= 0; i--) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.println(St.getSubjectsName(j) + " " + j);
                }
                System.out.println("Write index of subject");
                int index = scan.nextInt();
                St.SetSubjectMark(test(index, St), index);
                St.MoveSub(index, i);
            }
            System.out.println("You have done all exams");
            System.out.println("This is your results");
            Result(St);
        }

    }

    public static void Result(Student St) {
        System.out.println(St.getName());
        System.out.println(St.getAge());
        for (int i = 0; i < 5; i++) {
            System.out.println(St.getSubjectsName(i) + " " + St.getMark(i));
        }
    }

    public static boolean AgeCheck(Integer age) {
        if (age < 6) {
            System.out.println("You are too young for school");
            return false;
        } else if (age > 19) {
            System.out.println("You are too old for school");
            return false;
        }
        return true;
    }

    public static Integer test(int index, Student St) {
        String SubName = St.getSubjectsName(index);
        switch (SubName) {
            case "Math":
                return Math();
            case "Russian":
                return Russian();
            case "Social":
                return Social();
            case "D&T":
                return DandT();
            case "Literature":
                return Literature();
        }
        return 0;
    }

    public static Integer Math() {
        Scanner scanner = new Scanner(System.in);
        Integer mark = 1;
        int answer;
        System.out.println("Chose correct answer:");
        System.out.println("    First question:");
        System.out.println("        2+2*2");
        System.out.println("    Answers:");
        System.out.println("        1. 8");
        System.out.println("        2. 6");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Second question:");
        System.out.println("        (2+2*2)/3");
        System.out.println("    Answers:");
        System.out.println("        1. 2");
        System.out.println("        2. 2,6666666666666666666666666666666666666666666666666666666666666666666666666666");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Third question:");
        System.out.println("        ((2+2*2)/3)^2");
        System.out.println("    Answers:");
        System.out.println("        1. 5,875349857834975983476983759823798527398489237589237958723895");
        System.out.println("        2. 4");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("Good job, go to next exam!");
        return mark;
    }

    public static Integer Russian() {
        Scanner scanner = new Scanner(System.in);
        Integer mark = 1;
        int answer;
        System.out.println("Chose correct answer:");
        System.out.println("    First question:");
        System.out.println("        Привет is ____");
        System.out.println("    Answers:");
        System.out.println("        1. Hello");
        System.out.println("        2. GoodNight");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Second question:");
        System.out.println("        Hi is ______");
        System.out.println("    Answers:");
        System.out.println("        1. Привет");
        System.out.println("        2. Пока");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Third question:");
        System.out.println("        How are you? is _________");
        System.out.println("    Answers:");
        System.out.println("        1. Как твоё настироение?");
        System.out.println("        2. Как ты?");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("Good job, go to next exam!");
        return mark;
    }

    public static Integer Social() {
        Scanner scanner = new Scanner(System.in);
        Integer mark = 1;
        int answer;
        System.out.println("Chose correct answer:");
        System.out.println("    First question:");
        System.out.println("        How many people live in Latvia");
        System.out.println("    Answers:");
        System.out.println("        1. 2 mil");
        System.out.println("        2. 2 000");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Second question:");
        System.out.println("        How are you?");
        System.out.println("    Answers:");
        System.out.println("        1. Good");
        System.out.println("        2. Bad");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Third question:");
        System.out.println("        What do you think about death");
        System.out.println("    Answers:");
        System.out.println("        1. This is cool");
        System.out.println("        2. This is bad");
        answer = scanner.nextInt();
        if (answer == 2) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("Good job, go to next exam!");
        return mark;
    }

    public static Integer DandT() {
        Scanner scanner = new Scanner(System.in);
        Integer mark = 1;
        int answer;
        System.out.println("Chose correct answer:");
        System.out.println("    First question:");
        System.out.println("        What is a metal");
        System.out.println("    Answers:");
        System.out.println("        1. I don't know");
        System.out.println("        2. The metal?");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Second question:");
        System.out.println("        Are you strong?");
        System.out.println("    Answers:");
        System.out.println("        1. Yes");
        System.out.println("        2. Why?");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Third question:");
        System.out.println("        What is a tree?");
        System.out.println("    Answers:");
        System.out.println("        1. This is a wood");
        System.out.println("        2. This is the metal");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("Good job, go to next exam!");
        return mark;
    }

    public static Integer Literature() {
        Scanner scanner = new Scanner(System.in);
        Integer mark = 1;
        int answer;
        System.out.println("Chose correct answer:");
        System.out.println("    First question:");
        System.out.println("        Who is Pushkin");
        System.out.println("    Answers:");
        System.out.println("        1. A man");
        System.out.println("        2. A woman");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Second question:");
        System.out.println("        Why are you doing this test");
        System.out.println("    Answers:");
        System.out.println("        1. I don't know");
        System.out.println("        2. Why?");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("    Third question:");
        System.out.println("        Have a nice day");
        System.out.println("    Answers:");
        System.out.println("        1. Ok");
        System.out.println("        2. Thanks");
        answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("    Correct");
            mark += 3;
        } else {
            System.out.println("    Incorrect");
        }
        System.out.println("Good job, go to next exam!");
        return mark;
    }

}
