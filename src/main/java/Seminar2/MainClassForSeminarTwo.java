package Seminar2;


    import Seminar2.animals.Duck;
    import Seminar2.animals.Owl;
    import Seminar2.animals.base.Animal;
    import Seminar2.animals.Bear;
    import Seminar2.animals.Cow;
    import Seminar2.zoo.Zoo;

    public class MainClassForSeminarTwo {
        public static void main(String[] args) {
            Animal bear = new Bear("Потапыч");
            Animal cow = new Cow("Мурка");

            Zoo zoo = new Zoo();
            zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald")).addAnimal(new Owl("Сава"));
            System.out.println(zoo);

            System.out.println(zoo.getSound());


            RunSpeed champ = zoo.getRunnerChampion();
            System.out.println("--Runnner-champion--");
            System.out.println(champ);
            System.out.println("---runners---");
            for (RunSpeed runner: zoo.runners()) {
                System.out.println(runner);
            }

            System.out.println("--flyers--");
            for (FlySpeed flyer: zoo.flyers()) {
                System.out.println(flyer);
            }

            System.out.println("--swimmers--");
            for (SwimSpeed swimmer: zoo.swimmers()) {
                System.out.println(swimmer);
            }

            System.out.println("--Swimmer-champion--");
            System.out.println(zoo.getSwimmerChampion());

            System.out.println("--Flyer-champion--");
            System.out.println(zoo.getFlyerChampion());

        }
    }

