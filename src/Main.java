
    public class Main {
        public static void main(String[] args) {
            MyHashTable<String, String> studentTable = new MyHashTable<>(11);

            // Добавляем несколько записей о студентах
            studentTable.put("student_001", "John Doe");
            studentTable.put("student_002", "Jane Smith");
            studentTable.put("student_003", "Mark Johnson");
            studentTable.put("student_004", "Emily Davis");

            // Проверка метода get
            System.out.println("Get 'student_001': " + studentTable.get("student_001")); // Ожидается "John Doe"
            System.out.println("Get 'student_005': " + studentTable.get("student_005")); // Ожидается null (такого студента нет)

            // Проверка метода remove
            System.out.println("Remove 'student_002': " + studentTable.remove("student_002")); // Ожидается "Jane Smith"
            System.out.println("Get 'student_002' after removal: " + studentTable.get("student_002")); // Ожидается null (удален)

            // Проверка метода contains
            System.out.println("Contains 'John Doe': " + studentTable.contains("John Doe")); // Ожидается true
            System.out.println("Contains 'Sarah Connor': " + studentTable.contains("Sarah Connor")); // Ожидается false (нет такого студента)

            // Проверка метода getKey
            System.out.println("Key for 'Mark Johnson': " + studentTable.getKey("Mark Johnson")); // Ожидается "student_003"

            // Проверка размера хеш-таблицы
            System.out.println("Size of the table: " + studentTable.size()); // Ожидается 3 (три студента после удаления)

        }
    }