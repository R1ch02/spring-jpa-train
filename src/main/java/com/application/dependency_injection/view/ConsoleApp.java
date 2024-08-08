package com.application.dependency_injection.view;

import com.application.dependency_injection.domain.Department;
import com.application.dependency_injection.domain.Employee;
import com.application.dependency_injection.servises.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ConsoleApp implements CommandLineRunner {

    private Long employeeId = 0L;
    private Long departmentId = 0L;

    @Autowired
    private ApplicationService applicationService;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1: Добавить сотрудника");
            System.out.println("2: Удалить сотрудника");
            System.out.println("3: Найти сотрудника");
            System.out.println("4: Добавить отдел");
            System.out.println("5: Удалить отдел");
            System.out.println("6: Найти отдел");
            System.out.println("0: Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Добавление сотрудника

                    Employee employee = new Employee();
                    employeeId++;
                    employee.setEmployeeId(employeeId);
                    System.out.print("Введите фамилию: ");
                    employee.setEmployeeSurname(scanner.nextLine());
                    System.out.println("Введите имя: ");
                    employee.setEmployeeName(scanner.nextLine());
                    System.out.println("Введите отчество: ");
                    employee.setEmployeePatron(scanner.nextLine());
                    System.out.print("Введите адрес: ");
                    employee.setEmployeeAddress(scanner.nextLine());
                    System.out.println("Введите должность: ");
                    employee.setEmployeePost(scanner.nextLine());
                    System.out.println("Введите дату рождения: ");
                    employee.setEmployeeBirth(scanner.nextLine());
                    System.out.println("Введите отдел работы: ");
                    employee.setEmployeeDepartment(scanner.nextLine());
                    applicationService.addEmployee(employee);
                    System.out.println("Сотрудник добавлен.");
                    break;

                case 2:
                    // Удаление сотрудника
                    System.out.print("Введите ID сотрудника для удаления: ");
                    Long employeeId = scanner.nextLong();
                    applicationService.removeEmployee(employeeId);
                    System.out.println("Сотрудник удален.");
                    break;

                case 3:
                    // Поиск сотрудника
                    System.out.print("Введите ID сотрудника для поиска: ");
                    employeeId = scanner.nextLong();
                    Employee foundEmployee = applicationService.getEmployee(employeeId);
                    if (foundEmployee != null) {
                        System.out.println("Найденный сотрудник: " + '\n' + foundEmployee);
                    } else {
                        System.out.println("Сотрудник не найден.");
                    }
                    break;

                case 4:
                    // Добавление отдела
                    Department department = new Department();
                    departmentId++;
                    department.setDepartmentId(departmentId);
                    System.out.print("Введите название отдела: ");
                    department.setDepartmentName(scanner.nextLine());
                    System.out.println("Введите количество сотрудников в отделе");
                    department.setEmployeeCount(scanner.nextInt());
                    // Установите другие поля по необходимости
                    applicationService.addDepartment(department);
                    System.out.println("Отдел добавлен.");
                    break;

                case 5:
                    // Удаление отдела
                    System.out.print("Введите ID отдела для удаления: ");
                    Long departmentId = scanner.nextLong();
                    applicationService.removeDepartment(departmentId);
                    System.out.println("Отдел удален.");
                    break;

                case 6:
                    // Поиск отдела
                    System.out.print("Введите ID отдела для поиска: ");
                    departmentId = scanner.nextLong();
                    Department foundDepartment = applicationService.getDepartment(departmentId);
                    if (foundDepartment != null) {
                        System.out.println("Найденный отдел: " + '\n' + foundDepartment);
                    } else {
                        System.out.println("Отдел не найден.");
                    }
                    break;

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор, попробуйте еще раз.");
            }
        }
    }


}