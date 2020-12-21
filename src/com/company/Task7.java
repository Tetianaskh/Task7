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

    }

//    public static int maxElement(int array, int element) {
//
//    }
    /**
     * Задача 2. Написать метод, который принимает массив целых чисел и возвращает значение максимального элемента
     */
    public static void exercise02() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
    }

//    public static int minElementIndex(int array, int element) {
//
//    }
    /**
     * Задача 3. Написать метод, который пригнимает массив целых чисел и возвращает индекс минимального элемента
     */
    public static void exercise03() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача 4. Написать метод, который пригнимает массив и сортирует его методом выбора (селективная сортировка)
     */
    public static void exercise04() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача 5. Написать метод, который пригнимает массив и возвращает новый массив, содержащий только четные элементы
     * исходного массива (четные значения)
     */
    public static void exercise05() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
	exercise02();
    }
}
