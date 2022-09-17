public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });
        director.force(() -> System.out.println("Готовлю"));
    }
}

/*
* работа с анонимным классом, плюс реализация через лямбда
* */