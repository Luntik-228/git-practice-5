class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        System.out.println("Первое изменение в main");
        System.out.println("Второе изменение в main");

        printInfo();
        printEnd();
    }

    public static void printInfo() {
        System.out.println("Метод printInfo выполнен");
    }

    public static void printEnd() {
        System.out.println("Программа завершена");
    }
}