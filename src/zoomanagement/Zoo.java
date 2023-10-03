package zoomanagement;

import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private Set<Animal> animals;
    private String name;
    private String city;
    private int maxCapacity;

    public Zoo(String name, String city, int maxCapacity) {
        this.name = name;
        this.city = city;
        this.maxCapacity = maxCapacity;
        this.animals = new HashSet<>();
    }

    private int animalCount = 0; // Compteur d'animaux dans le zoo

  /*  public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }*/

   /* public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }*/

  /*  public void displayZoo() {
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville du zoo : " + this.city);
        System.out.println("Nombre de cages du zoo : " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre de cages=" + nbrCages + "]";
    }*/



   /* public boolean addAnimal(Animal animal) {
        // Vérifiez si le nombre d'animaux dans le zoo est inférieur à la capacité
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++; // Incrémente le compteur d'animaux
            return true;
        } else {
            return false;
        }
    }*/
    public boolean addAnimal(Animal animal) {
        if (animals.size() < maxCapacity) {
            return animals.add(animal); // Ajout réussi
        } else {
            return false; // Le zoo est plein, ajout échoué
        }
    }
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal); // Supprime l'animal et renvoie true si la suppression réussit, sinon false
    }
    public int getAnimalCount() {
        return animalCount;
    }
   /* public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i].getName());
        }
    }*/
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (Animal animal : animals) {
            System.out.println("Animal : " + animal.getName());
        }
    }
   /* public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animalName)) {
                return i; // Retourne l'indice de l'animal trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }*/
    public int searchAnimal(String animalName) {
        int index = 0;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                return index; // Retourne l'indice de l'animal trouvé
            }
            index++;
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }
}
