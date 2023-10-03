package zoomanagement;

/**
 * @author chkampawlow
 */
public class ZooManagement {

    public static void main(String[] args) {

        /* int nbrCages = 20;
         String zooName = "my zoo";

         System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */

      /* Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        while (zooName.isEmpty()) {
            System.out.println("ERREUR: Veuillez entrer un nom !");
            System.out.print("Entrez le nom du zoo: ");
            zooName = scanner.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        while (nbrCages <= 0) {
            System.out.println("ERREUR : Veuillez entrer un nombre de cages positif !");
            System.out.print("Entrez le nombre de cages : ");
            nbrCages = scanner.nextInt();

        }

        System.out.println(zooName + " comporte " + nbrCages + " cages"); */

     /*   Animal lion = new Animal("Félin", "Lion", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "Monastir", 25);

        myZoo.getAnimals()[0] = lion;

        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville du zoo : " + myZoo.getCity());
        System.out.println("Nombre de cages du zoo : " + myZoo.getNbrCages());
        System.out.println("Nom de l'animal : " + myZoo.getAnimals()[0].getName());
        System.out.println("Famille de l'animal : " + myZoo.getAnimals()[0].getFamily());
        System.out.println("Âge de l'animal : " + myZoo.getAnimals()[0].getAge());
        System.out.println("Est un mammifère : " + myZoo.getAnimals()[0].isMammal());

    } */


      /*
       Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Éléphant", 10, true);
        Animal giraffe = new Animal("Girafidé", "Girafe", 7, true);

        Animal[] zooAnimals = new Animal[25];

        zooAnimals[0] = lion;
        zooAnimals[1] = elephant;
        zooAnimals[2] = giraffe;

        Zoo myZoo = new Zoo("My Zoo", "Aryanah", 20, zooAnimals); // Vous avez spécifié un maximum de 50 cages, mais nous allons en utiliser seulement 25

        // Accédez aux attributs du zoo et des animaux
        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville du zoo : " + myZoo.getCity());
        System.out.println("Nombre de cages du zoo : " + myZoo.getNbrCages());

        // Accédez aux attributs des animaux dans le zoo
        for (int i = 0; i < myZoo.getAnimals().length; i++) {
            Animal animal = myZoo.getAnimals()[i];
            if (animal != null) {
                System.out.println("Animal " + (i + 1) + " : " + animal.getName() + " (Âge : " + animal.getAge() + ")");
            }
        }*/


       /* Zoo myZoo = new Zoo("Belvedère", "Tunis", 20, null);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        Animal lion = new Animal("Félin", "Lion", 5, true);
        System.out.println(lion); */

        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 3); // Capacité du zoo de 3 animaux
        // Créez des animaux
        Animal lion = new Animal("Félin", "Lion", 5, true);
        /*Animal elephant = new Animal("Éléphantidé", "Éléphant", 10, true);
        Animal giraffe = new Animal("Girafidé", "Girafe", 7, true);
        Animal tiger = new Animal("Félin", "Tigre", 6, true);

        System.out.println("Ajout de Lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout d'Éléphant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout de Girafe : " + myZoo.addAnimal(giraffe));
        System.out.println("Ajout de Tigre : " + myZoo.addAnimal(tiger)); // Cette ligne ajoutera un animal de plus que la capacité

        System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount()); */
        boolean ajoutLion = myZoo.addAnimal(lion);

        myZoo.displayAnimals();

        // int foundIndex = myZoo.searchAnimal("Lion");
       /* if (ajoutLion) {
            System.out.println("Lion ajouté au zoo.");
        } else {
            System.out.println("Lion non ajouté au zoo, le zoo est plein.");
        }
        if (foundIndex != -1) {
            System.out.println("Animal trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("Animal non trouvé.");
        }*/
        boolean suppressionLion = myZoo.removeAnimal(lion);
        if (ajoutLion) {
            System.out.println("Lion ajouté au zoo.");
        } else {
            System.out.println("Lion non ajouté au zoo, le zoo est plein.");
        }

        if (suppressionLion) {
            System.out.println("Lion supprimé du zoo.");
        } else {
            System.out.println("Lion non trouvé dans le zoo.");
        }

        myZoo.displayAnimals();
    }
}
