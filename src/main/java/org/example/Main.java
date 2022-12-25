package org.example;

import java.util.Scanner;
import lombok.Getter;
import lombok.SneakyThrows;

/**
 * Основной файл сборки для Java - jar. есть ещё war
 *
 *
 * Maven - фреймворк для автоматизации сборки проектов
 * Управляет зависимостями. Внутренними и внешними
 *
 * Ключевые понятия:
 * - Описание проекта - pom.xml
 * - Архетип
 * - Репозитории - локальный/удалённые
 *
 * - Проперти
 * - Зависимости
 * - Плагины
 *
 * - Скоупы
 *
 * java -jar step-maven.jar
 *
 *
 * Links
 * https://topjava.ru/blog/apache-maven-osnovy-1
 * https://javarush.com/groups/posts/2523-chastjh-4osnovih-maven
 * https://maven.apache.org/guides/mini/guide-naming-conventions.html
 * https://coderlessons.com/articles/devops-articles/uluchshenie-maven-proektov
 * https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html
 *
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.getId();
        user.setName("");
    }
}