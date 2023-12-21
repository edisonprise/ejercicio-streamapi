
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Podemos crear una lista a partir de un array con la funcionalidad de la clase Arrays
        List<Person> persons = Arrays.asList(
                new Person("Juan", "25", "programar"),
                new Person("María", "19", "leer"),
                new Person("Pedro", "30", "bailar"),
                new Person("Luisa", "22", "programar"),
                new Person("Ana", "17", "dibujar"),
                new Person("Carlos", "29", "programar")
        );

        // Filtramos las personas mayores a 18 y cuyo hobby sea programar
        List<Person> filteredPersons = persons.stream()
                .filter(person -> Integer.parseInt(person.getAge()) > 18)
                .filter(person -> person.getHobby().contains("programar"))
                .toList();

        // Mapeamos los nombres de las personas a una nueva lista de tipo String donde solo contiene los nombres
        List<String> names = persons.stream()
                .map(Person::getName)
                .toList();

        // Guardamos una nueva lista de personas con un límite de 5 elementos
        List<Person> limitedPersons = persons.stream()
                .limit(5)
                .toList();

        // Imprimimos el listado de personas
        // Acá podemos colocar cualquiera de los listados modificados anteriores y comprobar los resultados
        persons.forEach(person -> System.out.println(person.getName()));
    }
}
