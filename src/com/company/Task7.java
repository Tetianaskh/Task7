package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    // Основные задачи:

    /**
     * Удаление элемена по индексу
     * @param array исходный массив
     * @param index индекс удаляемого элемента
     * @return новый массив
     */
    public static String[] removeArrayElement(String[] array, int index) {
        String[] array2 = new String[array.length - 1];
        for (int i = 0; i < array2.length; i++) {
            if (i < index) {
                array2[i] = array[i];
            } else {
                array2[i] = array[i + 1];
            }
        }
        return array2;
    }

    /**
     * Печать списка задач
     * @param arrayOfTasks список задач
     */
    private static void printTaskList(String[] arrayOfTasks) {
        System.out.println("Список задач на сегодня:");
        for (int i = 0; i < arrayOfTasks.length; i++) {
            System.out.println(i+1 + ". " + arrayOfTasks[i]);
        }
    }

    /**
     * Задача 1. Создать массив задач (массив строк с текстом задач) вывести все задачи в виде списка с номерами,
     * например
     * 1. Посмотреть видео
     * 2. Решить домашнее задание
     * 3. Получить оценку
     * Затем предложить пользователю добавить задачу, если он согласится - считать и добавить в конец, после чего
     * вывести список.
     * Затем предложить пользователю удалить задачу, если он согласится, спросить, какую задачу по номеру он хочет
     * удалить этот элемент из массива.
     * После вывести список вновь
     */
    public static void exercise01() {
        System.out.println("Добрый день!");
        String[] arrayOfTasks = {"Посмотреть видео", "Решить домашнее задание", "Получить оценку"};
        printTaskList(arrayOfTasks);
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите добавить задачу в список?");
        if (sc.nextLine().equalsIgnoreCase("Да")) {
            System.out.println("Введите текст добавляемой задачи:");
            arrayOfTasks = Arrays.copyOf(arrayOfTasks, arrayOfTasks.length + 1);
            arrayOfTasks[arrayOfTasks.length - 1] = sc.nextLine();
            printTaskList(arrayOfTasks);
        }
        System.out.println("Вы хотите удалить задачу из списка?");
        if (sc.nextLine().equalsIgnoreCase("Да")) {
            System.out.println("Введите номер удаляемой задачи:");
            arrayOfTasks = removeArrayElement(arrayOfTasks, sc.nextInt() - 1);
            printTaskList(arrayOfTasks);
        }
    }

    /**
     * Создание рандомного массива
     * @return рандомный массив
     */
    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }

    /**
     * Поиск максимального элемента массива
     * @param array массив
     * @return максимальный элемент массива
     */
    public static int searchMaxElement(int[] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    /**
     * Задача 2. Написать метод, который принимает массив целых чисел и возвращает значение максимального элемента
     */
    public static void exercise02() {
        System.out.println("Добрый день! Поиск максимального элемента массива: ");
        int[] array = getRandomArray(15);
        System.out.println(Arrays.toString(array));
        int maxElement = searchMaxElement(array);
        System.out.println("Максимальный елемент массива равен = " + maxElement);
    }

    /**
     * Поик индекса минимального элемента массива
     * @param array массив
     * @return индекс минимального элемента массива
     */
    public static int minElementIndex(int[] array, int startIndex) {
        int minElementIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[minElementIndex]) {
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    /**
     * Задача 3. Написать метод, который пригнимает массив целых чисел и возвращает индекс минимального элемента
     */
    public static void exercise03() {
        System.out.println("Добрый день! Поиск индекса минимального элемента массива: ");
        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));
        int minIndex = minElementIndex(array, 0);
        System.out.println("Индекс минимального елемента массива равен = " + minIndex);
    }

    /**
     * Метод селективной сортировки массива
     * @param array массив
     */
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElementIndex = minElementIndex(array, i);
            int buf = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = buf;
        }
    }

    /**
     * Задача 4. Написать метод, который пригнимает массив и сортирует его методом выбора (селективная сортировка)
     */
    public static void exercise04() {
        System.out.println("Добрый день! Наш помощник отсортирует исходный массив методом селективной сортировки: ");
        int[] array = getRandomArray(5);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    /**
     * Проверка числа: - деление на 2 без остатка; - число не равно 0
     * @param num число
     * @return проверка числа
     */
    public static boolean isEven (int num) {
        return num % 2 == 0 && num != 0;
    }

    /**
     * Выбор четных элементов массива
     * @param array массив
     * @return массив четных элементов
     */
    public static int[] selectEvenElements(int[] array) {
        int size = 0;
        for (int el : array) {
            if (isEven(el)) {
              size++;
            }
        }
        int[] arrayOfEvenElements = new int[size];
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                arrayOfEvenElements[step++] = array[i];
            }
        }
        return arrayOfEvenElements;
    }

    /**
     * Задача 5. Написать метод, который пригнимает массив и возвращает новый массив, содержащий только четные элементы
     * исходного массива (четные значения)
     */
    public static void exercise05() {
        System.out.println("Добрый день! Выбор четных элементов из исходного массива: ");
        int[] array = getRandomArray(30);
        System.out.println(Arrays.toString(array));
        System.out.println("Массив четных элементов = " + Arrays.toString(selectEvenElements(array)));
    }

    public static void main(String[] args) {
        exercise04();
    }
}