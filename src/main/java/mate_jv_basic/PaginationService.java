package mate_jv_basic;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    // create getElementsCount() method
    public int getElementsCount() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            count++;
        }
        return count;
    }

    // create getPageNumberByElementIndex(int index) method
    public int getPageNumberByElementIndex(int index) {
        if (index < 0 || index > getElementsCount()) {
            return  -1;
        }
        return index / elementsPerPage;
    }

    public static void main(String[] args) {

    }
}

// 0 1 | 2 3 | 4 5 | 6 7 | 8 9 |
//  0     1     2     3     4

// для 10 елементів у масиві `data`, по 2 элементи на сторінці
// (тобто змінна `elementsPerPage` має значення 2)

//    getElementsCount(); -> 10

//    getPageNumberByElementIndex(0); -> 0
// найперший елемент розташований на першій сторінці

//    getPageNumberByElementIndex(1); -> 0
// другий елемент також знаходиться на першій сторінці,
// бо elementsPerPage == 2

//    getPageNumberByElementIndex(2); -> 1
// третій елемент (за індексом 2)
// знаходиться вже на наступній сторінці

//    getPageNumberByElementIndex(8); -> 4

//    getPageNumberByElementIndex(100); -> -1
// індекс не валідний - останній доступний індекс
// у поточному масиві `data` дорівнює 9

//    getPageNumberByElementIndex(-5); -> -1
// від'ємний індекс також не є валідним
//        Пам'ятай про те, що оскільки ти пишеш методи всередині класу PaginationService,
//        ти маєш прямий доступ до його полів data і elementsPerPage.