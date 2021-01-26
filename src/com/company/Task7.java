package com.company;

import java.util.Arrays;

public class Task7 {

    // Основные задачи:

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
        System.out.println("Добрый день! Список задач на сегодня:");
        String[] arrayOfTasks = {"1. Посмотреть видео", "2. Решить домашнее задание", "3. Получить оценку"};
        for (int i = 0; i < arrayOfTasks.length; i++) {
            System.out.println(arrayOfTasks[i]);
        }
    }


    /**
     * Создание рандомного массива
     * @param array массив
     * @return рандомный массив
     */
    public static int[] randomArray(int[] array) {
        int[] randomArray = array;
        for (int i = 0; i < array.length; i++) {
            randomArray[i] = (int) (Math.random()*100);
        }
        return randomArray;
    }

    /**
     * Поиск максимального элемента массива
     * @param array массив
     * @return максимальный элемент массива
     */
    public static int searchMaxElement(int[] array) {
        System.out.println(Arrays.toString(randomArray(array)));
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
        int[] array = new int[15];
        int maxElement = searchMaxElement(array);
        System.out.println("Максимальный елемент массива равен = " + maxElement);
    }

    /**
     * Поик индекса минимального элемента массива
     * @param array массив
     * @return индекс минимального элемента массива
     */
    public static int minElementIndex(int[] array) {
        System.out.println(Arrays.toString(randomArray(array)));
        int minElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
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
        int[] array = new int[10];
        int minIndex = minElementIndex(array);
        System.out.println("Индекс минимального елемента массива равен = " + minIndex);
    }

    /**
     * Метод селективной сортировки массива
     * @param array массив
     * @return отсортированный массив
     */
    public static void selectiveSort (int[] array) {
        System.out.println(Arrays.toString(randomArray(array)));

    }

    /**
     * Задача 4. Написать метод, который пригнимает массив и сортирует его методом выбора (селективная сортировка)
     */
    public static void exercise04() {

    }

    /**
     * Выбор четных элементов массива
     * @param array массив
     * @return массив четных элементов
     */
    public static int[] selectOfEvenElements (int[] array) {
        System.out.println(Arrays.toString(randomArray(array)));
        int size = 0;
        for (int el : array) {
            if (el % 2 == 0) {
              size++;
            }
        }
        int[] arrayOfEvenElements = new int[size];
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
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
        int[] array = new int[20];
        System.out.println("Массив четных элементов = " + Arrays.toString(selectOfEvenElements(array)));
    }

    public static void main(String[] args) {
        exercise05();
    }
}