package com.application.dependency_injection.view;

import com.application.dependency_injection.domain.department.Department;
import com.application.dependency_injection.domain.employee.Staff;
import com.application.dependency_injection.servises.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
@Component
public class ConsoleApp implements CommandLineRunner {

    @Autowired
    private ApplicationService applicationService;
    //TODO разобраться
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
                    Staff staff = new Staff();
                    System.out.print("Введите ФИО: ");
                    staff.setFullName(scanner.nextLine());
                    System.out.print("Введите адрес: ");
                    staff.setAddress(scanner.nextLine());
                    System.out.println("Введите должность: ");
                    staff.setPost(scanner.nextLine());
                    System.out.println("Введите дату рождения: ");
                    //TODO try catch
                    staff.setBirth(LocalDate.parse(scanner.nextLine()));
                    System.out.println("При завершении списка наберите 'end'" + '\n' + "Введите отделы работы: " );
                    List<String> departamentList = new ArrayList<>();
                    String currentDepartment;
                    while(true){
                        currentDepartment = scanner.nextLine();
                        if(currentDepartment.equals("end")){
                            break;
                        } else {
                            departamentList.add(currentDepartment);
                        }
                    }

                    applicationService.addStaff(staff);
                    System.out.println("Сотрудник добавлен.");
                    break;

                case 2:
                    // Удаление сотрудника
                    System.out.print("Введите ID сотрудника для удаления: ");
                    Long staffId = scanner.nextLong();
                    applicationService.deleteStaff(staffId);
                    System.out.println("Сотрудник удален.");
                    break;

                case 3:
                    // Поиск сотрудника
                    System.out.print("Введите ID сотрудника для поиска: ");
                    staffId = scanner.nextLong();
                    Optional<Staff> foundStaff = applicationService.findStaffById(staffId);
                    if (foundStaff.isPresent()) {
                        System.out.println("Найденный сотрудник: " + '\n' + foundStaff.orElse(null));
                    } else {
                        System.out.println("Сотрудник не найден.");
                    }
                    break;

                case 4:
                    // Добавление отдела
                    Department department = new Department();
                    System.out.print("Введите название отдела: ");
                    department.setName(scanner.nextLine());
                    // TODO доделать department


                    applicationService.addDepartment(department);
                    System.out.println("Отдел добавлен.");
                    break;

                case 5:
                    // Удаление отдела
                    System.out.print("Введите ID отдела для удаления: ");
                    Long departmentId = scanner.nextLong();
                    applicationService.deleteDepartment(departmentId);
                    System.out.println("Отдел удален.");
                    break;

                case 6:
                    // Поиск отдела
                    System.out.print("Введите ID отдела для поиска: ");
                    departmentId = scanner.nextLong();
                    Optional<Department> foundDepartment = applicationService.findDepartmentById(departmentId);
                    if (foundDepartment.isPresent()) {
                        System.out.println("Найденный отдел: " + '\n' + foundDepartment.orElse(null));
                    } else {
                        System.out.println("Отдел не найден.");
                    }
                    break;

                    //TODO сделать меню работы с Organisation

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор, попробуйте еще раз.");
            }
        }
    }


}